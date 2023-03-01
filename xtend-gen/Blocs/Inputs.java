package Blocs;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.Bloc;

@SuppressWarnings("all")
public class Inputs {
  public String initInput(final Bloc bloc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Input bloc");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("int ");
    _builder.append(bloc.idCompo, "  ");
    _builder.append("Pin = 12;");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("int ");
    _builder.append(bloc.idCompo, "  ");
    _builder.append("Value = 0;");
    _builder.newLineIfNotEmpty();
    _builder.append("//fin Input  ");
    return _builder.toString();
  }

  public String setupInput(final Bloc bloc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pinMode(");
    _builder.append(bloc.idCompo);
    _builder.append(",INPUT);");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String Const(final Bloc bloc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("double ");
    _builder.append(bloc.idCompo);
    _builder.append(" = ");
    _builder.append(bloc.value);
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
