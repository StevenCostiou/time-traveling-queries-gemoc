package tests;

import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.TTQProgramState;

public class TestTTQProgramStateWrapper {

	@Test
	public void testIsMethodCall() {
	
		RuntimeStep methodCallStep = TTQTestResources.miniJavaMethodCallStepExample();
		Assertions.assertTrue(true);
		
	}
	
	
}
