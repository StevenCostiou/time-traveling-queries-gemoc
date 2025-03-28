package model;

import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.tetrabox.minijava.model.miniJava.MethodCall;

public class TTQMethodCall extends TTQProgramState {

	private MethodCall methodCall;
	public TTQMethodCall(RuntimeStep s) {
		step = s;
		//methodCall = (MethodCall) s.getSemanticRuleStaticTarget();
	}

	public boolean isMethodCall() {
		
		return (step.getSemanticRuleStaticTarget() instanceof MethodCall);
	}

}
