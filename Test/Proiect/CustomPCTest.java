package Proiect;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomPCTest {

	@Test
	public void testbuildPlacaVideo() {
		PC pc = new PC();
		pc.setPlacaVideo("RTX");
		assertNotNull(pc);
	}
   @Test
	public void testbuildRAM() {
		PC pc1 = new PC();
		pc1.setRam("16GB");
		assertNotNull(pc1);
	}
	@Test
	public void testbuildTIPRACIRE() {
		PC pc2 = new PC();
		pc2.setRam("4xCooler");
		assertNotNull(pc2);
	}
}
