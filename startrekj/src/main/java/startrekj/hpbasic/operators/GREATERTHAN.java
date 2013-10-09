package startrekj.hpbasic.operators;

import startrekj.hpbasic.BooleanExpression;
import startrekj.hpbasic.NUMBER;
import startrekj.hpbasic.NumericExpression;

import static startrekj.hpbasic.Arithmetic.*;

public class GREATERTHAN implements BooleanExpression {
	private NumericExpression expression1;
	private NumericExpression expression2;
	
	private GREATERTHAN(NumericExpression expression1, NumericExpression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
	
	public static GREATERTHAN GREATERTHAN(NumericExpression expression1, Number number) {
		return GREATERTHAN(expression1, new NUMBER(number));
	}
	public static GREATERTHAN GREATERTHAN(NumericExpression expression1, NumericExpression expression2) {
		return new GREATERTHAN(expression1, expression2);
	}
	public boolean evaluate() {
		return greaterThan(expression1.evaluate(), expression2.evaluate());
	}
	@Override
	public String toString() {
		return expression1 + ">" + expression2;
	}
}
