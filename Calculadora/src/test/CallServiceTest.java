package ec.edu.espol;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;



public class CallServiceTest {
	CallService callService;
	
	@Before
	public void setup() {
		ICalculator cal = Mockito.mock (ICalculator.class);
		Mockito.when(cal.add(3, 3)).thenReturn(6);
		callService = new CallService();
		callService.setCal(cal);
	}
	
	@Test
	public void testAddTwoNumbers() {
		Assert.assertEquals(6, callService.addTwoNumbers(3, 3));
	}
}
