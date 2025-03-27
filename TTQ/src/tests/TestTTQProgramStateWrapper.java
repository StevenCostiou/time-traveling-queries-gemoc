package tests;

import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.TTQMethodCall;
import model.TTQProgramState;

public class TestTTQProgramStateWrapper {

	@Test
	public void testIsMethodCall() {
	
		RuntimeStep methodCallStep = TTQTestResources.miniJavaMethodCallStepExample();
		TTQProgramState ps = new TTQMethodCall(methodCallStep);
	
		Assertions.assertTrue(ps.isMethodCall());
		
	}
	
	
}
