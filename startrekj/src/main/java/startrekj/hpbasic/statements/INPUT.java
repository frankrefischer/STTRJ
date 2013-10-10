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
		while(true) {
			try {
				String lineRead = new Scanner(System.in).nextLine();
				Number numberRead = Double.parseDouble(lineRead);
				if(variable.evaluate() instanceof Integer)
					variable.setValue(numberRead.intValue());
				else
					variable.setValue(numberRead);
				return;
			} catch (NumberFormatException e) {
				System.out.println("error: not number");
			}
		}
	}
}
