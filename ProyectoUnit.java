
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



 public class ProyectoUnit {
	
	static Calculadora a;
	//a
	
	@Before
	public void before() {
		System.out.println("Antes");
		a.clear();
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Antes de cada clase");
		a = new Calculadora();
	}
	
		
	@AfterClass
	public static void afterClass() {
		System.out.println("Despues de cada clase");
		
	}
	
	@After
	public void after() {
		System.out.println("Despues");
		a.clear();
	}
	
	
	@Test
	public void Suma() {
		Calculadora a = new Calculadora();
		int resultado = a.add(10, 5);
		int esperado= 15;
		assertEquals(esperado, resultado);
		}
	
	@Test
	public void Negativo() {
		Calculadora a = new Calculadora();
		int resultado = a.add(-10, 3);
		int esperado= -7;
		assertEquals(esperado, resultado);
		}
	
	@Test
	public void Resta() {
		Calculadora a = new Calculadora();
		int resultado = a.add(10 - 3);
		int esperado= 7;
		assertEquals(esperado, resultado);
		}
	
	@Test(timeout = 2)
	public void Time() {
		a.operacionTime();
	}
}