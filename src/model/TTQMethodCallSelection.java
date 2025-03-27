package model;

public class TTQMethodCallSelection {
	
	
	TTQProgramStateWrapper programState;
	
	public TTQMethodCallSelection(TTQProgramStateWrapper ps)
	{
		programState = ps;
	}
	
	public boolean select() {
		
		return programState.isMethodCall();
	}

}
