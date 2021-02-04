import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)

public class CientificaParamTest {

	@Parameters
	public static Iterable<Object[]> getData() {
		List<Object[]> obj = new ArrayList<>();
		obj.add(new Object[] { 3, 1, 4 });
		obj.add(new Object[] { 2, 3, 5 });
		obj.add(new Object[] { 3, 3, 6 });
		return obj;

	}

	private int num1, num2, esper;

	public CientificaParamTest(int num1, int num2, int esper) {
		this.num1 = num1;
		this.num2 = num2;
		this.esper = esper;

	}

	@Test
	public void testSuma() {
		Cientifica operaciones = new Cientifica();
		int resul = (int) operaciones.suma(num1, num2);
		assertEquals(esper, resul);

	}

}
