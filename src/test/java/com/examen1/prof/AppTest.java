package com.examen1.prof;

/*
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
*/

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.Vector;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest //extends TestCase
{
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Executed before any test has been run");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Executed after all tests have been run");
	}
		
	@Test
	public void is_null_vector() throws NullVectorException{
		//Vector<Asignatura> vectorAsignaturas= new Vector<Asignatura>();
		Matricula m = new Matricula(null);
		assertEquals(0,m.vectorAsignaturas.size());
	}
	
	/*
	@Test
	public void myTestMethod(){
		  Matricula m = mock(Matricula.class);
		  when(m.getImporte()).thenReturn(<value>);

		  // THIS SHOULD BE TRUE
		  assertEquals(<value>, c.<method>());
	}
	*/
    
}
