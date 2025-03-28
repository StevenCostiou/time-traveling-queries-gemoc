package model;

import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.tetrabox.minijava.model.miniJava.Assignment;
import org.tetrabox.minijava.model.miniJava.MethodCall;

public class TTQProgramState {
	
	protected RuntimeStep step;
	
	// Assignment is given as queryable language element
	public boolean isAssignment() {
		return false;
	}
	
	// MethodCall is given as queryable language element
	public static boolean isMethodCall(RuntimeStep step) {
		return (step.getSemanticRuleStaticTarget() instanceof MethodCall);
	}
	
	// MethodCall is given as queryable language element
	public static boolean isAssignment(RuntimeStep step) {
		return (step.getSemanticRuleStaticTarget() instanceof Assignment);
	}

}
