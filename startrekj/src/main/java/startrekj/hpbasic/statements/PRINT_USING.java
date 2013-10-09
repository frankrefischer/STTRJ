package startrekj.hpbasic.statements;

import startrekj.hpbasic.HPBasicProgram;
import startrekj.hpbasic.Statement;

public class PRINT_USING implements Statement {

	private int lineNumber;
	
	private PRINT_USING(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public static PRINT_USING PRINT_USING(int lineNumber) {
		return new PRINT_USING(lineNumber);
	}
	
	@Override
	public String toString() {
		return "PRINT USING " + lineNumber;
	}

	public void execute() {
		String imageString = HPBasicProgram.getImageString(lineNumber);
		String formatString = getFormatString(imageString);
		System.out.printf(formatString);
	}

	private String getFormatString(String imageString) {
		return imageString;
	}
}
