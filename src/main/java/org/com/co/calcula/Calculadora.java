package org.com.co.calcula;

public class Calculadora {
	
	int respuesta;
	private int limite;
	
	public Calculadora(int limite) {
	super();
	this.limite = limite;
}

	public int sumar(int n1, int n2){
		
		respuesta=n1+n2;
		if(respuesta>100){
			throw new Overflowexception();
			
		}
		return respuesta;
	}
	
public int restar(int n1, int n2){
		
		respuesta=n1-n2;
		return respuesta;
	}

}
