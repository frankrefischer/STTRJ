package startrekj.hpbasic;


public class NUMBER implements NumericExpression {
	private Number number;
	public NUMBER(Number number) {
		this.number = number;
	}
	public Number evaluate() {
		return number;
	}
	@Override
	public String toString() {
		return number.toString();
	}
}
