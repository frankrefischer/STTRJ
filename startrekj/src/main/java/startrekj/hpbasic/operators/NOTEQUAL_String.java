package startrekj.hpbasic.operators;

import startrekj.hpbasic.BooleanExpression;
import startrekj.hpbasic.CONST_String;
import startrekj.hpbasic.StringExpression;
import startrekj.hpbasic.StringVariable;

public class NOTEQUAL_String implements BooleanExpression {
	private StringExpression expression1;
	private StringExpression expression2;
	
	private NOTEQUAL_String(StringExpression expression1, StringExpression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
	public static NOTEQUAL_String NOTEQUAL(StringExpression expression1, String string) {
		return new NOTEQUAL_String(expression1, new CONST_String(string));
	}
	public static NOTEQUAL_String NOTEQUAL(StringExpression expression1, StringExpression expression2) {
		return new NOTEQUAL_String(expression1, expression2);
	}
	public boolean evaluate() {
		return !expression1.evaluate().equals(expression2);
	}
	@Override
	public String toString() {
		return expression1 + " <> " +expression2;
	}
}