package org.com.co.test;

import org.com.co.calcula.Calculadora;
import org.com.co.calcula.Overflowexception;
import org.junit.Test;
import junit.framework.*;

public class CalculadoraTest {


	Calculadora cal=new Calculadora(100);
	
	@Test
	public void Sumardosmastres(){
		
		
		int suma=cal.sumar(2,8);
		
		Assert.assertEquals(10, suma);
		
	}
	
@Test
	
	public void Sumarsmastres(){
		
		
		int suma=cal.sumar(4,8);
		
		Assert.assertEquals(12, suma);
		
	}

@Test

public void Restar5menos3(){

	
	int resta=cal.restar(5,3);
	
	Assert.assertEquals(2, resta);
	
}

}
