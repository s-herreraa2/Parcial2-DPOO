package parcial2.mundo;

import static org.junit.jupiter.api.Assertions.*;
import parcial2.mundo.*;
import parcial2.excepciones.*;

import org.junit.jupiter.api.Test;

class TestParcial2 {

	@Test
	void TestCasoNormal() throws Exception{
		Parcial p = new Parcial(1, -5, 6);
		String resultado = p.FormulaEstudiante();
		assertEquals("x1 = " + 3 + ", x2 = " + 2, resultado);
	}
	
	@Test
	void TestACero() throws Exception{
		Parcial p = new Parcial(0, -2, 3);
		assertThrows(ACeroException.class, () -> {p.FormulaEstudiante();});
	}
	
	@Test
	void TestImaginario() throws Exception{
		Parcial p = new Parcial(2, 3, 5);
		assertThrows(ImaginarioException.class, () -> {p.FormulaEstudiante();});
	}

}
