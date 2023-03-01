package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.ArrayExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.Bloc;
import org.xtext.example.mydsl.Voisin;
import org.xtext.example.mydsl.myDsl.Component;
import org.xtext.example.mydsl.myDsl.Link;
import org.xtext.example.mydsl.myDsl.Node;

@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  private StringBuffer setupCode = new StringBuffer();

  private StringBuffer loopCode = new StringBuffer();

  private List<Bloc> components = new ArrayList<Bloc>();

  private Bloc b;

  private Voisin v;

  private ArduinoCodeGenerator generator = new ArduinoCodeGenerator();

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    List<Component> _list = IteratorExtensions.<Component>toList(Iterators.<Component>filter(resource.getAllContents(), Component.class));
    for (final Component c : _list) {
      {
        Bloc _bloc = new Bloc();
        this.b = _bloc;
        this.b.idCompo = c.getCompoId();
        this.b.idt = c.getCompoIdt();
        this.components.add(this.b);
      }
    }
    List<Node> _list_1 = IteratorExtensions.<Node>toList(Iterators.<Node>filter(resource.getAllContents(), Node.class));
    for (final Node node : _list_1) {
      for (final Bloc compo : this.components) {
        boolean _contains = ArrayExtensions.contains(node.getNodeName().split("~"), compo.idCompo);
        if (_contains) {
          EList<Link> _links = node.getLinks();
          for (final Link link : _links) {
            String _compID = link.getCompID();
            boolean _notEquals = (!Objects.equal(_compID, compo.idCompo));
            if (_notEquals) {
              Voisin _voisin = new Voisin();
              this.v = _voisin;
              this.v.idCompo = link.getCompID();
              this.v.type = link.getPortName2();
              compo.voisins.add(this.v);
            }
          }
        }
      }
    }
    int _size = this.components.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      final HashSet<Bloc> visited = new HashSet<Bloc>();
      final Stack<Bloc> stack = new Stack<Bloc>();
      for (final Bloc compo_1 : this.components) {
        boolean _contains_1 = visited.contains(compo_1);
        boolean _not = (!_contains_1);
        if (_not) {
          this.topologicalSort(compo_1, visited, stack);
        }
      }
      this.setBlocType(stack);
      InputOutput.<String>println("********* MY STACK ***********");
      for (final Bloc element : stack) {
        {
          InputOutput.<String>print((element.idCompo + " : "));
          for (final Voisin vos : element.voisins) {
            InputOutput.<String>print((((vos.idCompo + "_") + vos.type) + " | "));
          }
          InputOutput.println();
          InputOutput.<String>println((((element.idCompo + " est un\" ") + element.blocType) + " \" "));
        }
      }
      fsa.generateFile("code.txt", this.generator.ArduinoCodeGen(stack));
      this.generator.ArduinoCodeClear();
    }
  }

  public void topologicalSort(final Bloc current, final HashSet<Bloc> visited, final Stack<Bloc> stack) {
    visited.add(current);
    boolean _notEquals = (!Objects.equal(current.voisins, null));
    if (_notEquals) {
      for (final Voisin voisin : current.voisins) {
        {
          final Function1<Bloc, Boolean> _function = (Bloc bloc) -> {
            return Boolean.valueOf(Objects.equal(bloc.idCompo, voisin.idCompo));
          };
          final Bloc voisinBloc = IterableExtensions.<Bloc>findFirst(this.components, _function);
          if (((!Objects.equal(voisinBloc, null)) && (!visited.contains(voisinBloc)))) {
            this.topologicalSort(voisinBloc, visited, stack);
          }
        }
      }
    }
    stack.push(current);
  }

  public void setBlocType(final Stack<Bloc> stack) {
    boolean in = false;
    boolean out = false;
    for (final Bloc b : stack) {
      {
        for (final Voisin v : b.voisins) {
          {
            boolean _equals = Objects.equal(v.type, "out");
            if (_equals) {
              out = true;
            }
            boolean _equals_1 = Objects.equal(v.type, "in");
            if (_equals_1) {
              in = true;
            }
          }
        }
        if ((in && out)) {
          b.blocType = "inter";
        }
        if ((in && (!out))) {
          b.blocType = "in";
        }
        if (((!in) && out)) {
          b.blocType = "out";
        }
        in = false;
        out = false;
      }
    }
  }
}
