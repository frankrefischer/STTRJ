package startrekj.hpbasic.operators;

import startrekj.hpbasic.StringVariable;

public class SUBSTRING {
	private StringVariable variable;
	private int from;
	private int to;
	
	private SUBSTRING(StringVariable variable, int from, int to) {
		this.variable = variable;
		this.from = from;
		this.to = to;
	}
	
	public static SUBSTRING SUBSTRING(StringVariable variable, int from, int to) {
		return new SUBSTRING(variable, from, to);
	}
	
	@Override
	public String toString() {
		return variable.getName() + "[" + from + "," + to + "]";
	}
}
