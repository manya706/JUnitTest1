package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunction JUnit =new JUnitFunction();
		
		String result = JUnit.AddString("manya", "sharma");
		assertEquals("manyasharma",result);
		
	}

}
