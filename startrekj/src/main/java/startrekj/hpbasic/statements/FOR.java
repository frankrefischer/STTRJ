package startrekj.hpbasic.statements;

import startrekj.hpbasic.HPBasicProgram;
import startrekj.hpbasic.NumericVariable;
import startrekj.hpbasic.Statement;

public class FOR implements Statement {
	private NumericVariable variable;
	private int from;
	private int to;
	
	private FOR(NumericVariable variable, int from, int to) {
		this.variable = variable;
		this.from = from;
		this.to = to;
	}
	
	public static FOR FOR(NumericVariable variable, int from, int to) {
		return new FOR(variable, from, to);
	}
	
	public String toString() {
		return "FOR " + variable.getName() + "=" + from + " TO " + to;
	}

	public void execute() {
		String varName = variable.getName();
		int lineNumber = HPBasicProgram.nextLineNumber;
		HPBasicProgram.lineNumberForLoopVariable.put(varName, lineNumber);
		HPBasicProgram.maxValueForLoopVariable.put(varName, to);
		
		variable.setValue(from);
	};
}
