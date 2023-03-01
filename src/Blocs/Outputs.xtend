package Blocs

import org.xtext.example.mydsl.Bloc

class Outputs {
	def setup_output(Bloc b){
	return 
		'''
		pinMode(«b.idCompo»,OUTPUT);
		'''
	}
	
	def call_output(Bloc b){
		
	}
}