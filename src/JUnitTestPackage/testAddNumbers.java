package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunction JUnit =new JUnitFunction(); 
		int result = JUnit.AddNumber(200, 300);
		assertEquals(500,result);
	}

}
