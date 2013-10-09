package startrekj.hpbasic.statements;

import java.util.Scanner;

import startrekj.hpbasic.Statement;
import startrekj.hpbasic.StringVariable;

public class INPUT implements Statement {

	private StringVariable variable;

	private INPUT(StringVariable variable) {
		this.variable = variable;
	}

	public static INPUT INPUT(StringVariable variable) {
		return new INPUT(variable);
	}
	
	@Override
	public String toString() {
		return "INPUT " + variable.getName();
	}

	public void execute() {
		String lineRead = new Scanner(System.in).nextLine();
		variable.setValue(lineRead.trim());
	}
}
