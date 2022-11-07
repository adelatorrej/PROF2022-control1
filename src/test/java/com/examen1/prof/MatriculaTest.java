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

public class MatriculaTest
{
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Executed before any test has been run");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Executed after all tests have been run");
	}
	
	/*PREGUNTA 7*/
	@Test
	public void is_null_vector2() throws NullVectorException{
		Matricula m = new Matricula(null);
		assertThrows(NullVectorException.class, () -> m.getImporte());
	}
	
	/*PREGUNTA 8*/
	@Test
	public void myTestMethod() throws Exception{
		  Matricula m = mock(Matricula.class);
		  when(m.getImporte()).thenReturn(0.0);

		  assertEquals(0.0, m.getImporte());
	}
    
	/*
	@Test
	public void is_null_vector() throws NullVectorException{
		//Vector<Asignatura> vec= new Vector<Asignatura>();
		Matricula m = new Matricula(null);
		assertEquals(0,m.vectorAsignaturas.size());
	}
	*/
	
}
