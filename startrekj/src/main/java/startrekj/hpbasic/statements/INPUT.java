package startrekj.hpbasic.statements;

import java.util.Scanner;

import startrekj.hpbasic.NumericVariable;
import startrekj.hpbasic.Statement;
import startrekj.hpbasic.StringVariable;

public class INPUT implements Statement {

	private NumericVariable variable;

	private INPUT(NumericVariable variable) {
		this.variable = variable;
	}

	public static INPUT INPUT(NumericVariable variable) {
		return new INPUT(variable);
	}
	
	@Override
	public String toString() {
		return "INPUT " + variable.getName();
	}

	public void execute() {
		String lineRead = new Scanner(System.in).nextLine();
		Number numberRead = parseDouble(lineRead);
		if(variable.evaluate() instanceof Integer)
			variable.setValue(numberRead.intValue());
		else
			variable.setValue(numberRead);
		return;
	}
	private Double parseDouble(String line) {
		try {
			return Double.parseDouble(line);
		} catch (NumberFormatException e) {
			return Double.NaN;
		}
	}
}
