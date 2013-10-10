package startrekj.hpbasic;

public class StringChunk implements StringExpression {
	private StringExpression expression;
	private int from;
	private int to;
	
	public StringChunk(StringExpression expression, int from, int to) {
		this.expression = expression;
		this.from = from;
		this.to = to;
	}

	public String evaluate() {
		return expression.evaluate().substring(from-1, to);
	}
	@Override
	public String toString() {
		return expression + "[" + from + "," + to + "]";
	}
}
