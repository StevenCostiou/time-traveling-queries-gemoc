package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.TTQProgramState;

public class TTQProgramStateTest {
	@Test
	public void testIsMethodCall() {
		TTQProgramState ps = new TTQProgramState();
		Assertions.assertFalse(ps.isMethodCall());
	}
	
	@Test
	public void testIsAssignment() {
		TTQProgramState ps = new TTQProgramState();
		Assertions.assertFalse(ps.isAssignment());
	}

}
