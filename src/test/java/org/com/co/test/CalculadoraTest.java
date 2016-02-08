package org.com.co.test;

import org.com.co.calcula.Calculadora;
import org.com.co.calcula.Overflowexception;
import org.junit.Test;
import junit.framework.*;

public class CalculadoraTest {


	Calculadora cal=new Calculadora();
	
	@Test
	public void Sumardosmastres(){
		
		
		double suma=cal.sumar(2.0,8.0);
		
		Assert.assertEquals(10.0, suma);
		
	}
	
@Test
	
	public void Sumarsmastres(){
		
		
		double suma=cal.sumar(4.0,8.0);
		
		Assert.assertEquals(12.0, suma);
		
	}

@Test

public void Restar5menos3(){

	
	double resta=cal.restar(5.0,3.0);
	
	Assert.assertEquals(2.0, resta);
	
}

}
