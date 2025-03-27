package model;

import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.tetrabox.minijava.model.miniJava.MethodCall;

public class TTQProgramStateWrapper {
	
	private RuntimeStep step;
	
	public TTQProgramStateWrapper(RuntimeStep aStep) {
		step = aStep;
	}

	public boolean isAssignment() {
		
		
		return false;}
	
	public boolean isMethodCall() {		
		
		return(step.getSemanticRuleStaticTarget() instanceof MethodCall);
		
		}
	
	public boolean isInstantiation() {return false;}
	
	public TTQProgramStateWrapper build() {
		// Build the corresponding AST-equivalent object that will be queried by the TTQ
		return this;}
	
	
	/**
	 * Assignments: what they should know
	 */
	
	// variable (assignee)
	// variable value
	
	/**
	 * Message sends: what they should know
	 */
	
	// receiver 
	// selector
	// arguments

	
	
	
}

// pass over all "execution steps"
// for each step, test the kind of the step
// once tested, the step must return an object that knows about
