package startrekj.hpbasic.operators;

import startrekj.hpbasic.BooleanExpression;
import startrekj.hpbasic.StringVariable;

public class NOTEQUAL_String implements BooleanExpression {
	private StringVariable lefthandSide;
	private String righthandSide;
	
	private NOTEQUAL_String(StringVariable lefthandSide, String righthandSide) {
		this.lefthandSide = lefthandSide;
		this.righthandSide = righthandSide;
	}
	public static NOTEQUAL_String NOTEQUAL(StringVariable lefthandSide, String righthandSide) {
		return new NOTEQUAL_String(lefthandSide, righthandSide);
	}
	public boolean evaluate() {
		return !lefthandSide.getValue().equals(righthandSide);
	}
	@Override
	public String toString() {
		return lefthandSide.getName() + " <> \"" + righthandSide + "\"";
	}
}
