import static org.junit.Assert.*;

import org.junit.Test;

public class CientificaTest {
	
	Cientifica operaciones;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSuma() {
		operaciones=new Cientifica();
			double resultado = operaciones.suma(10, 5);
			double normal =15;
		assertEquals(normal, resultado);
	}
	@Test
	public void testMultiplicar() {
		operaciones=new Cientifica();
			double resultado = operaciones.multiplicacion(20,5);
			double normal =100;
			assertEquals(normal, resultado);


}
}