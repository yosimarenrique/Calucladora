package org.com.co.calcula;

public class Calculadora {
	
	private double respuesta;
	
	
	public Calculadora() {
	
	}

	public double sumar(double n1, double n2){
		
		respuesta=n1+n2;
		
		return respuesta;
	}
	
	public double restar(double n1, double n2){
		
		respuesta=n1-n2;
		return respuesta;
	}


	public double multiplicar(double n1, double n2){
		
		respuesta=n1*n2;
		return respuesta;

	}
	
	public double dividir(double n1, double n2){
		
		respuesta=n1/n2;
		return respuesta;

	}
	
	public double porcentaje(double n1, double valor){
		
		
		double respuesta=(n1*valor)/100;
	
		return respuesta;

	}
	
}
