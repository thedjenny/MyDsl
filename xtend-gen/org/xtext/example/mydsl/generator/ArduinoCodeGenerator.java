package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import java.util.Stack;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.Bloc;

@SuppressWarnings("all")
public class ArduinoCodeGenerator {
  private static String str = "";

  public String initCode(final Stack<Bloc> stack) {
    this.ArduinoCodeClear();
    for (final Bloc element : stack) {
      {
        boolean _equals = Objects.equal(element.blocType, "in");
        if (_equals) {
          ArduinoCodeGenerator.str = (((ArduinoCodeGenerator.str + "double ") + element.idCompo) + "Value ; \n");
        }
        boolean _equals_1 = Objects.equal(element.blocType, "out");
        if (_equals_1) {
          ArduinoCodeGenerator.str = (((ArduinoCodeGenerator.str + "boolean ") + element.idCompo) + "Value ; \n");
        }
        boolean _equals_2 = Objects.equal(element.blocType, "inter");
        if (_equals_2) {
          final String _switchValue = element.idt;
          if (_switchValue != null) {
            switch (_switchValue) {
              case "2010114":
                String _str = ArduinoCodeGenerator.str;
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("double temp");
                int _indexOf = stack.indexOf(element);
                _builder.append(_indexOf);
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("double ");
                _builder.append(element.idCompo);
                _builder.append("Value(double var1, double var2 ){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("return var1+var2;");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
                ArduinoCodeGenerator.str = (_str + _builder);
                break;
              case "2010351":
                String _str_1 = ArduinoCodeGenerator.str;
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("boolean temp");
                int _indexOf_1 = stack.indexOf(element);
                _builder_1.append(_indexOf_1);
                _builder_1.append(";");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append(" ");
                _builder_1.append("boolean ");
                _builder_1.append(element.idCompo, " ");
                _builder_1.append("Value(double var1, double var2){");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("\t");
                _builder_1.append("return (var1 < var2);");
                _builder_1.newLine();
                _builder_1.append("}");
                _builder_1.newLine();
                ArduinoCodeGenerator.str = (_str_1 + _builder_1);
                break;
            }
          }
        }
      }
    }
    return ArduinoCodeGenerator.str;
  }

  public String setupCode(final Stack<Bloc> stack) {
    String _initCode = this.initCode(stack);
    String _plus = ("\n" + _initCode);
    ArduinoCodeGenerator.str = _plus;
    String _str = ArduinoCodeGenerator.str;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void setup(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Serial.begin(9600);");
    _builder.newLine();
    ArduinoCodeGenerator.str = (_str + _builder);
    for (final Bloc element : stack) {
      {
        boolean _equals = Objects.equal(element.blocType, "in");
        if (_equals) {
          boolean _equals_1 = Objects.equal(element.idt, "2010122");
          if (_equals_1) {
          }
          boolean _equals_2 = Objects.equal(element.idt, "2010121");
          if (_equals_2) {
            String _str_1 = ArduinoCodeGenerator.str;
            ArduinoCodeGenerator.str = (_str_1 + (("\n pinMode(" + element.idCompo) + "Value ,INPUT);"));
          }
        }
        boolean _equals_3 = Objects.equal(element.blocType, "out");
        if (_equals_3) {
          String _str_2 = ArduinoCodeGenerator.str;
          ArduinoCodeGenerator.str = (_str_2 + "\n pinMode(13,OUTPUT);");
        }
      }
    }
    String _str_1 = ArduinoCodeGenerator.str;
    ArduinoCodeGenerator.str = (_str_1 + "} \n");
    return ArduinoCodeGenerator.str;
  }

  public String ArduinoCodeGen(final Stack<Bloc> stack) {
    String _setupCode = this.setupCode(stack);
    String _plus = ("\n" + _setupCode);
    ArduinoCodeGenerator.str = _plus;
    String _str = ArduinoCodeGenerator.str;
    ArduinoCodeGenerator.str = (_str + "void loop(){ \n");
    for (final Bloc element : stack) {
      {
        boolean _equals = Objects.equal(element.blocType, "in");
        if (_equals) {
          boolean _equals_1 = Objects.equal(element.idt, "2010121");
          if (_equals_1) {
            String _str_1 = ArduinoCodeGenerator.str;
            ArduinoCodeGenerator.str = (_str_1 + (element.idCompo + "Value = 6; \n"));
          }
          boolean _equals_2 = Objects.equal(element.idt, "2010122");
          if (_equals_2) {
            String _str_2 = ArduinoCodeGenerator.str;
            ArduinoCodeGenerator.str = (_str_2 + (element.idCompo + "Value = 10; \n"));
          }
        }
        boolean _equals_3 = Objects.equal(element.blocType, "inter");
        if (_equals_3) {
          final String _switchValue = element.idt;
          if (_switchValue != null) {
            switch (_switchValue) {
              case "2010114":
                if ((Objects.equal(element.voisins.get(0).blocType, "inter") && Objects.equal(element.voisins.get(1).blocType, "inter"))) {
                  String _str_3 = ArduinoCodeGenerator.str;
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("temp");
                  int _indexOf = stack.indexOf(element);
                  _builder.append(_indexOf);
                  _builder.append(" = ");
                  _builder.append(element.idCompo);
                  _builder.append("Value(temp");
                  int _indexOf_1 = stack.indexOf(element.voisins.get(0));
                  _builder.append(_indexOf_1);
                  _builder.append(",temp");
                  int _indexOf_2 = stack.indexOf(element.voisins.get(1));
                  int _minus = (_indexOf_2 - 1);
                  _builder.append(_minus);
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                  ArduinoCodeGenerator.str = (_str_3 + _builder);
                }
                if ((Objects.equal(element.voisins.get(1).blocType, "inter") && (!Objects.equal(element.voisins.get(0).blocType, "inter")))) {
                  String _str_4 = ArduinoCodeGenerator.str;
                  StringConcatenation _builder_1 = new StringConcatenation();
                  _builder_1.append("temp");
                  int _indexOf_3 = stack.indexOf(element);
                  _builder_1.append(_indexOf_3);
                  _builder_1.append(" = ");
                  _builder_1.append(element.idCompo);
                  _builder_1.append("Value(");
                  _builder_1.append(element.voisins.get(0).idCompo);
                  _builder_1.append("Value,temp");
                  int _indexOf_4 = stack.indexOf(element.voisins.get(1));
                  int _minus_1 = (_indexOf_4 - 1);
                  _builder_1.append(_minus_1);
                  _builder_1.append(");");
                  _builder_1.newLineIfNotEmpty();
                  ArduinoCodeGenerator.str = (_str_4 + _builder_1);
                }
                if ((Objects.equal(element.voisins.get(0).blocType, "inter") && (!Objects.equal(element.voisins.get(1).blocType, "inter")))) {
                  String _str_5 = ArduinoCodeGenerator.str;
                  StringConcatenation _builder_2 = new StringConcatenation();
                  _builder_2.append("temp");
                  int _indexOf_5 = stack.indexOf(element);
                  _builder_2.append(_indexOf_5);
                  _builder_2.append(" = ");
                  _builder_2.append(element.idCompo);
                  _builder_2.append("Value(");
                  _builder_2.append(element.voisins.get(0).idCompo);
                  _builder_2.append("Value,");
                  _builder_2.append(element.voisins.get(1).idCompo);
                  _builder_2.append("Value);");
                  _builder_2.newLineIfNotEmpty();
                  ArduinoCodeGenerator.str = (_str_5 + _builder_2);
                }
                if (((!Objects.equal(element.voisins.get(0).blocType, "inter")) && (!Objects.equal(element.voisins.get(1).blocType, "inter")))) {
                  String _str_6 = ArduinoCodeGenerator.str;
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("temp");
                  int _indexOf_6 = stack.indexOf(element);
                  _builder_3.append(_indexOf_6);
                  _builder_3.append(" = ");
                  _builder_3.append(element.idCompo);
                  _builder_3.append("Value(");
                  _builder_3.append(element.voisins.get(0).idCompo);
                  _builder_3.append("Value,");
                  _builder_3.append(element.voisins.get(1).idCompo);
                  _builder_3.append("Value);");
                  _builder_3.newLineIfNotEmpty();
                  ArduinoCodeGenerator.str = (_str_6 + _builder_3);
                }
                break;
              case "2010351":
                if ((Objects.equal(element.voisins.get(0).blocType, "inter") && Objects.equal(element.voisins.get(1).blocType, "inter"))) {
                  InputOutput.<String>println("here 1");
                  String _str_7 = ArduinoCodeGenerator.str;
                  StringConcatenation _builder_4 = new StringConcatenation();
                  _builder_4.append("temp");
                  int _indexOf_7 = stack.indexOf(element);
                  _builder_4.append(_indexOf_7);
                  _builder_4.append(" = ");
                  _builder_4.append(element.idCompo);
                  _builder_4.append("Value(temp");
                  int _indexOf_8 = stack.indexOf(element.voisins.get(0));
                  int _minus_2 = (_indexOf_8 - 1);
                  _builder_4.append(_minus_2);
                  _builder_4.append(",temp");
                  int _indexOf_9 = stack.indexOf(element.voisins.get(1));
                  int _minus_3 = (_indexOf_9 - 1);
                  _builder_4.append(_minus_3);
                  _builder_4.append(");");
                  _builder_4.newLineIfNotEmpty();
                  ArduinoCodeGenerator.str = (_str_7 + _builder_4);
                }
                if ((Objects.equal(element.voisins.get(1).blocType, "inter") && (!Objects.equal(element.voisins.get(0).blocType, "inter")))) {
                  String _str_8 = ArduinoCodeGenerator.str;
                  StringConcatenation _builder_5 = new StringConcatenation();
                  _builder_5.append("temp");
                  int _indexOf_10 = stack.indexOf(element);
                  _builder_5.append(_indexOf_10);
                  _builder_5.append(" = ");
                  _builder_5.append(element.idCompo);
                  _builder_5.append("Value(");
                  _builder_5.append(element.voisins.get(0).idCompo);
                  _builder_5.append("Value,temp");
                  final Function1<Bloc, Boolean> _function = (Bloc bloc) -> {
                    return Boolean.valueOf(Objects.equal(bloc.idCompo, element.idCompo));
                  };
                  int _indexOf_11 = stack.indexOf(IterableExtensions.<Bloc>findFirst(stack, _function));
                  int _minus_4 = (_indexOf_11 - 1);
                  _builder_5.append(_minus_4);
                  _builder_5.append(");");
                  _builder_5.newLineIfNotEmpty();
                  ArduinoCodeGenerator.str = (_str_8 + _builder_5);
                }
                if ((Objects.equal(element.voisins.get(0).blocType, "inter") && (!Objects.equal(element.voisins.get(1).blocType, "inter")))) {
                  InputOutput.<String>println("here 3");
                  String _str_9 = ArduinoCodeGenerator.str;
                  StringConcatenation _builder_6 = new StringConcatenation();
                  _builder_6.append("temp");
                  int _indexOf_12 = stack.indexOf(element);
                  _builder_6.append(_indexOf_12);
                  _builder_6.append(" = ");
                  _builder_6.append(element.idCompo);
                  _builder_6.append("Value(");
                  _builder_6.append(element.voisins.get(0).idCompo);
                  _builder_6.append("Value,");
                  _builder_6.append(element.voisins.get(1).idCompo);
                  _builder_6.append("Value);");
                  _builder_6.newLineIfNotEmpty();
                  ArduinoCodeGenerator.str = (_str_9 + _builder_6);
                }
                if (((!Objects.equal(element.voisins.get(0).blocType, "inter")) && (!Objects.equal(element.voisins.get(1).blocType, "inter")))) {
                  InputOutput.<String>println("here 4");
                  String _str_10 = ArduinoCodeGenerator.str;
                  StringConcatenation _builder_7 = new StringConcatenation();
                  _builder_7.append("temp");
                  int _indexOf_13 = stack.indexOf(element);
                  _builder_7.append(_indexOf_13);
                  _builder_7.append(" = ");
                  _builder_7.append(element.idCompo);
                  _builder_7.append("Value(");
                  _builder_7.append(element.voisins.get(0).idCompo);
                  _builder_7.append("Value,");
                  _builder_7.append(element.voisins.get(1).idCompo);
                  _builder_7.append("Value);");
                  _builder_7.newLineIfNotEmpty();
                  ArduinoCodeGenerator.str = (_str_10 + _builder_7);
                }
                break;
            }
          }
        }
        boolean _equals_4 = Objects.equal(element.blocType, "out");
        if (_equals_4) {
          String _str_11 = ArduinoCodeGenerator.str;
          StringConcatenation _builder_8 = new StringConcatenation();
          _builder_8.append("digitalWrite(13,temp");
          int _indexOf_14 = stack.indexOf(element);
          int _minus_5 = (_indexOf_14 - 1);
          _builder_8.append(_minus_5);
          _builder_8.append(");");
          _builder_8.newLineIfNotEmpty();
          _builder_8.append(" \t\t\t");
          _builder_8.append("}");
          ArduinoCodeGenerator.str = (_str_11 + _builder_8);
        }
      }
    }
    return ArduinoCodeGenerator.str;
  }

  public String ArduinoCodeClear() {
    return ArduinoCodeGenerator.str = "";
  }
}
