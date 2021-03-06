import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.junit5demo.service.CalculatorService;
import com.cg.junit5demo.service.CalculatorServiceImpl;

class CalculatorServiceTest {

	CalculatorService service;
	
	@BeforeEach
	public void beforeAll() {
		service=new CalculatorServiceImpl();
	}
	
	@Test
	public void test() {
		assertEquals(40.0, service.addNumber(20.0, 20.0),"Add Two Numbers");
		assertEquals(40.0, service.subNumber(60.0, 20.0),"Subtract Two Numbers");
		assertEquals(40.0, service.mulNumber(20.0, 2.0),"Multiply Two Numbers");
		assertEquals(1.0, service.divNumber(20.0, 20.0),"Divide Two Numbers");
	}
	
	@Test
	public void testException() {
		assertThrows(ArithmeticException.class, () -> service.divNumber(10.0, 0.0), "Divide by zero should throw Exception");
	}
	
	@AfterEach
	public void afterAll() {
		service=null;
	}
}
