package startrekj.hpbasic.operators;

import startrekj.hpbasic.BooleanExpression;
import startrekj.hpbasic.CONST;
import startrekj.hpbasic.NumericExpression;

import static startrekj.hpbasic.Arithmetic.*;

public class GTE implements BooleanExpression {
	private NumericExpression expression1;
	private NumericExpression expression2;
	
	private GTE(NumericExpression expression1, NumericExpression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
	
	public static GTE GTE(NumericExpression expression1, Number number) {
		return GTE(expression1, new CONST(number));
	}
	public static GTE GTE(NumericExpression expression1, NumericExpression expression2) {
		return new GTE(expression1, expression2);
	}
	public boolean evaluate() {
		return greaterThanOrEqual(expression1.evaluate(), expression2.evaluate());
	}
	@Override
	public String toString() {
		return expression1 + ">=" + expression2;
	}
}
