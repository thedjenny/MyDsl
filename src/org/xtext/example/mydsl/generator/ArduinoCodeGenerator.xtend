package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.Bloc
import java.util.List
import Blocs.Inputs
import Blocs.Maths
import org.xtext.example.mydsl.Voisin
import java.util.Stack

class ArduinoCodeGenerator {
	var str = ""
  
  def initCode(Stack<Bloc> stack){
  	
  	for (element : stack) {
  		if(element.blocType=="in"){
  			str =str+ "double " + element.idCompo + "Var ; \n"
  		}
  		
  		if(element.blocType=="out"){
  			str = str + "boolean "+ element.idCompo + "Var ; \n"
  		}
  		
  		if(element.blocType=="inter"){
  			switch(element.idt){
  				//ADD_2
  				case "2010114":  {
  					str +=  '''
  					double temp«stack.indexOf(element)»;
  					void «element.idCompo»Value(double var1, double var2 , double &temp«stack.indexOf(element)» ){
  						temp«stack.indexOf(element)» = var1+var2;
  					}
  					'''
  				}
  				//Inferior
  				case "2010351" :{
  					str += '''
  					boolean temp«stack.indexOf(element)»;
  					 void «element.idCompo»Value(double var1, double var2, boolean &temp«stack.indexOf(element)» ){
  						temp«stack.indexOf(element)» = var1 < var2;
  					}
  					'''
  				}
  			}
  		}
  		
  	}
  	return str
  }
  
  def setupCode(Stack<Bloc> stack){
  	str = "\n" + initCode(stack)
  	str += '''
  	void setup(){
  		Serial.begin(9600);
  	''' 
  	for (element : stack) {
  		if(element.blocType=="in"){
  			if(element.idt=="2010122"){
  				// to be implemented
  			}
  			if(element.idt=="2010121"){
  			str += "\n pinMode("+ element.idCompo+"Var ,INPUT);"	
  			}
  			
  		}
  		if(element.blocType=="out"){
  			str += "\n pinMode(13,OUTPUT);"
  		}
  	}
  	str += "} \n"
	return str;
  }
  
 def ArduinoCodeGen(Stack<Bloc> stack){
 	str = "\n" + setupCode(stack)
 	str += "void loop(){ \n"
 	for (element : stack) {
 		if(element.blocType=="in"){
 			if(element.idt=="2010121"){
 				//to be revised
 				str+=element.idCompo+"Var = 6; \n"
 			}
 			if(element.idt=="2010122"){
 				str+=element.idCompo+"Var = 10; \n"
 			}
 			 			
 		}
 		
 		
 		if(element.blocType=="inter"){
 				switch(element.idt){
  				//ADD_2
  				case "2010114":  {
  					if(element.voisins.get(0).type=="inter" && element.voisins.get(1).type=="inter" ){
  					//println("here 1")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(temp«stack.indexOf(element.voisins.get(0))»,temp«stack.indexOf(element.voisins.get(1))»);
  					'''  						
  					}
  					if(element.voisins.get(1).type=="inter" && element.voisins.get(0).type!="inter" ){
  					//println("here 2")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,temp«stack.indexOf(element.voisins.get(1))»);
  					'''  						
  					}
  					if(element.voisins.get(0).type=="inter" && element.voisins.get(1).type!="inter"){
  					//println("here 3")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					}
  					if(element.voisins.get(0).type!="inter" && element.voisins.get(1).type!="inter"){
  					//println("here 4")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					}
  					
  				}
  				//Inferior
  				case "2010351" :{
  					if(element.voisins.get(0).type=="inter" && element.voisins.get(1).type=="inter" ){
  					println("here 1")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(temp«stack.indexOf(element.voisins.get(0))»,temp«stack.indexOf(element.voisins.get(1))»);
  					'''  						
  					}
  					if(element.voisins.get(1).type=="inter" && element.voisins.get(0).type!="inter" ){
  					println("here 2")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,temp«stack.indexOf(element.voisins.get(1))»);
  					'''  						
  					}
  					if(element.voisins.get(0).type=="inter" && element.voisins.get(1).type!="inter"){
  					println("here 3")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					}
  					if(element.voisins.get(0).type!="inter" && element.voisins.get(1).type!="inter"){
  					println("here 4")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					} 
  				}
  			}
 			}
 			
 			
 			if(element.blocType=="out"){
 				str+='''digitalWrite(13,temp«(stack.indexOf(element)-1)»);
 			}'''
 			}
 	}
   return str;
 } 
 def ArduinoCodeClear(){
 	this.str = ""
 }
}
