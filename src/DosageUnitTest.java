package swingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class DosageUnitTest {

	@Test
	public void testDosage() {
		System.out.println("Testing initial data set of 5 medicines...");
		Main test = new Main();
		System.out.println("Inputing 5 different medications...");
		System.out.println("Pressuming 4 tablets per medication...");
		System.out.println("Calculating result for 1 week...");
		
		@SuppressWarnings("static-access")
		int result = test.totalTablets(5);
		assertEquals(140,result);
		System.out.println("Expected output: 140");
		System.out.println("Actual output: " + result);
	}

}
