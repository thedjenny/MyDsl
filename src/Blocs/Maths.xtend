package Blocs

import org.xtext.example.mydsl.Bloc

class Maths {
	def init_Inferior(Bloc b1, Bloc b2){
	return
		'''
		boolean inferiority (double b1 , double b2){
			return b1<b2;
		} 
		'''
	}
	
	
	def init_Add_pp(Bloc b1, Bloc b2){
	return	
		'''
		double Add_PP(double D1 , double D2)
		{
			return d1+d2;
		}
		'''
	}
}