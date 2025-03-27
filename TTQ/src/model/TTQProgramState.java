package model;

import org.eclipse.gemoc.trace.simple.RuntimeStep;

public class TTQProgramState {
	
	protected RuntimeStep step;
	
	// Assignment is given as queryable language element
	public boolean isAssignment() {
		return false;
	}
	
	// MethodCall is given as queryable language element
	public boolean isMethodCall() {
		return false;
	}

}
