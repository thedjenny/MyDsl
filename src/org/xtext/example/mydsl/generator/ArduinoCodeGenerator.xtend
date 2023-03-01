package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.Bloc
import java.util.List
import org.xtext.example.mydsl.Voisin
import java.util.Stack

class ArduinoCodeGenerator {
	static var str = ""
  
  def initCode(Stack<Bloc> stack){
  	ArduinoCodeClear()
  	for (element : stack) {
  		if(element.blocType=="in"){
  			str =str+ "double " + element.idCompo + "Value ; \n"
  		}
  		
  		if(element.blocType=="out"){
  			str = str + "boolean "+ element.idCompo + "Value ; \n"
  		}
  		
  		if(element.blocType=="inter"){
  			switch(element.idt){
  				//ADD_2
  				case "2010114":  {
  					str +=  '''
  					double temp«stack.indexOf(element)»;
  					double «element.idCompo»Value(double var1, double var2 ){
  						return var1+var2;
  					}
  					'''
  				}
  				//Inferior
  				case "2010351" :{
  					str += '''
  					boolean temp«stack.indexOf(element)»;
  					 boolean «element.idCompo»Value(double var1, double var2){
  						return (var1 < var2);
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
  			str += "\n pinMode("+ element.idCompo+"Value ,INPUT);"	
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
 				str+=element.idCompo+"Value = 6; \n"
 			}
 			if(element.idt=="2010122"){
 				str+=element.idCompo+"Value = 10; \n"
 			}
 			 			
 		}
 		
 		
 		if(element.blocType=="inter"){
 				switch(element.idt){
  				//ADD_2
  				case "2010114":  {
  					if(element.voisins.get(0).blocType=="inter" && element.voisins.get(1).blocType=="inter" ){
  					//println("here 1")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(temp«stack.indexOf(element.voisins.get(0))»,temp«stack.indexOf(element.voisins.get(1))-1»);
  					'''  						
  					}
  					if(element.voisins.get(1).blocType=="inter" && element.voisins.get(0).blocType!="inter" ){
  					//println("here 2")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,temp«stack.indexOf(element.voisins.get(1))-1»);
  					'''  						
  					}
  					if(element.voisins.get(0).blocType=="inter" && element.voisins.get(1).blocType!="inter"){
  					//println("here 3")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					}
  					if(element.voisins.get(0).blocType!="inter" && element.voisins.get(1).blocType!="inter"){
  		
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					}
  					
  				}
  				//Inferior
  				case "2010351" :{
  					if(element.voisins.get(0).blocType=="inter" && element.voisins.get(1).blocType=="inter" ){
  					println("here 1")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(temp«stack.indexOf(element.voisins.get(0))-1»,temp«stack.indexOf(element.voisins.get(1))-1»);
  					'''  						
  					}
  					if(element.voisins.get(1).blocType=="inter" && element.voisins.get(0).blocType!="inter" ){
  					
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,temp«stack.indexOf(stack.findFirst[bloc | bloc.idCompo == element.idCompo])-1»);
  					'''  						
  					}
  					if(element.voisins.get(0).blocType=="inter" && element.voisins.get(1).blocType!="inter"){
  					println("here 3")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					}
  					if(element.voisins.get(0).blocType!="inter" && element.voisins.get(1).blocType!="inter"){
  					println("here 4")
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					} 
  				}
  			}
 			}
 			
 			
 			if(element.blocType=="out"){
 				str+='''digitalWrite(13,temp«(stack.indexOf(element))-1»);
 			}'''
 			}
 	}
   return str;
 } 
 def ArduinoCodeClear(){
 	str = ""
 }
}
