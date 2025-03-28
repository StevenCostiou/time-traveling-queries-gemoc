package model;

import java.util.List;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.eclipse.gemoc.trace.simple.SimpleTrace;

public class TTQAllMethodCalls {
	
	SimpleTrace trace;
	public TTQAllMethodCalls(SimpleTrace aTrace) {
		
		trace = aTrace;
		 
		
	}
	
	public List<RuntimeStep> execute() {
		
		EList<RuntimeStep> steps = trace.getRootSteps().get(1).getSubSteps();
		Predicate<RuntimeStep> allMethodCalls = step -> TTQProgramState.isMethodCall(step);
		
		return steps.stream().filter(allMethodCalls).toList();	
	}
	

}
