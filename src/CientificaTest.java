import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CientificaTest {
	static Cientifica operaciones;
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("BeforeClass()");
		operaciones=new Cientifica();
	}
	@Before
	public void before() {
		System.out.println("before()");
		
	}
	@AfterClass
	public void After() {
		System.out.println("After()");
		Cientifica.limpiar();
	}
	

	
	@SuppressWarnings("deprecation")
	@Test
	public void testSuma() {
		
			double resultado = operaciones.suma(10, 5);
			double normal =15;
			double delta=0;
		assertEquals(normal, resultado,delta);
	}



	@Test
	public void testDividir() {
		
		double resultado=operaciones.division(50, 4);
		double normal=12;
		double delta=2;
		assertEquals(resultado, normal, delta);
	}
	@Test(expected = ArithmeticException.class)
	public void testMultix1() {
		
		operaciones.multiplicacion(5, 2);
	}
	@Test(timeout=200)
	public void testTiempo() {

		operaciones.tiempoTranscurrido();
	}
}