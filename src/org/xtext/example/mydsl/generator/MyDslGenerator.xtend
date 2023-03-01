package org.xtext.example.mydsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.List
import java.util.ArrayList
import org.xtext.example.mydsl.Bloc
import java.util.LinkedList
import java.util.HashSet
import org.xtext.example.mydsl.myDsl.Component
import org.xtext.example.mydsl.myDsl.Node
import org.xtext.example.mydsl.Voisin
import java.util.Stack

class MyDslGenerator extends AbstractGenerator {
StringBuffer setupCode = new StringBuffer();
StringBuffer loopCode = new StringBuffer();


	
	 List<Bloc> components = new ArrayList<Bloc>();
	 Bloc b;
	 Voisin v;
	ArduinoCodeGenerator generator = new ArduinoCodeGenerator();	
	
override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {	
		
		for (c : resource.allContents.filter(Component).toList) {
			b = new Bloc()
			b.idCompo = c.compoId
			b.idt = c.compoIdt
			components.add(b);
		}
		
		for (node : resource.allContents.filter(Node).toList) {
			for (compo : components) {
				if(node.nodeName.split("~").contains(compo.idCompo)){
					for (link : node.links) {
						if (link.compID != compo.idCompo){
							v = new Voisin()
							v.idCompo = link.compID
							v.type = link.portName2
							compo.voisins.add(v)
						}
					}
				}
			}
		}
		
		if (components.size > 0) {
			val visited = new HashSet<Bloc>()
			var stack = new Stack<Bloc>()
			
			for (compo : components) {
				if (!visited.contains(compo)) {
					topologicalSort(compo, visited, stack)
				}
			}
			setBlocType(stack)
			setVoisinType(stack)
			println("********* MY STACK ***********")
			for (element : stack) {
			println(element.idCompo + " est un\" " + element.blocType + " \" " )
			}
			println("******************************")
			fsa.deleteFile("code.txt") 
		    fsa.generateFile("code.txt",generator.ArduinoCodeGen(stack)) 	
			generator.ArduinoCodeClear()
			stack.clear
			components.clear
		}
		
	}
	

	
	def void topologicalSort(Bloc current, HashSet<Bloc> visited, Stack<Bloc> stack) {
		visited.add(current)
		if (current.voisins != null) {
			for (voisin : current.voisins) {
				val voisinBloc = components.findFirst[bloc | bloc.idCompo == voisin.idCompo]
				if (voisinBloc != null && !visited.contains(voisinBloc)) {
					topologicalSort(voisinBloc, visited, stack)
				}
			}
		}
		
		stack.push(current)
	}
	
	
	def void setBlocType(Stack<Bloc> stack){
		var in = false;
		var out = false;
		
		for (b : stack) {
			for (v : b.voisins) {
				if(v.type=="out")
					out = true;
				if(v.type=="in")
					in = true;		
			}	
		if(in && out)
			b.blocType="inter"
		if(in && !out)
			b.blocType="in"
		if(!in && out)
			b.blocType="out"		
		
		//reinitialisation des bool
		in = false;
		out = false;
		}
		
	}

def setVoisinType(Stack<Bloc> stack){
	for (bloc : stack) {
		for (voisin : bloc.voisins) {
			for (tempBloc : stack) {
				if(tempBloc.idCompo==voisin.idCompo)
					voisin.blocType=tempBloc.blocType
			}
		}
	}
}

	
}
