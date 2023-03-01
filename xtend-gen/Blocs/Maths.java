package Blocs;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.Bloc;

@SuppressWarnings("all")
public class Maths {
  public String init_Inferior(final Bloc b1, final Bloc b2) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("boolean inferiority (double b1 , double b2){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return b1<b2;");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    return _builder.toString();
  }

  public String init_Add_pp(final Bloc b1, final Bloc b2) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("double Add_PP(double D1 , double D2)");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return d1+d2;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
