package Blocs

import org.xtext.example.mydsl.Bloc

class Inputs {
	 def initInput(Bloc bloc){
  	 return '''
        // Input bloc
          int «bloc.idCompo»Pin = 12;
          int «bloc.idCompo»Value = 0;
        //fin Input  '''
  }
  
  
  def setupInput(Bloc bloc){
  	return '''
  	pinMode(«bloc.idCompo»,INPUT);
  	'''
  }
  
  
  def Const(Bloc bloc){
  	return '''
  	double «bloc.idCompo» = «bloc.value» ;
  	'''
  }
 
}