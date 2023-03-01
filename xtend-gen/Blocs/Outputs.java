package Blocs;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.Bloc;

@SuppressWarnings("all")
public class Outputs {
  public String setup_output(final Bloc b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pinMode(");
    _builder.append(b.idCompo);
    _builder.append(",OUTPUT);");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public Object call_output(final Bloc b) {
    return null;
  }
}
