package startrekj.hpbasic.statements;

import startrekj.hpbasic.HPBasicProgram;
import startrekj.hpbasic.Statement;

public class GOTO implements Statement {
	private int lineNumber;
	
	private GOTO(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public static GOTO GOTO(int lineNumber) {
		return new GOTO(lineNumber);
	}
	
	public void execute() {
		HPBasicProgram.nextLineNumber = lineNumber;
	}
	@Override
	public String toString() {
		return "GOTO " + lineNumber;
	}
}
