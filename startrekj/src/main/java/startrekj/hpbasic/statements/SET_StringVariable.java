package startrekj.hpbasic.statements;

import startrekj.hpbasic.Statement;
import startrekj.hpbasic.StringVariable;

public class SET_StringVariable implements Statement {
	private StringVariable variable;
	private int offset = 1;
	private Object value;
	
	private SET_StringVariable(StringVariable variable, int offset, Object value) {
		this.variable = variable;
		this.offset = offset;
		this.value = value;
	}
	
	public static SET_StringVariable SET(StringVariable variable, Object value) {
		return SET(variable, 1, value);
	}
	public static SET_StringVariable SET(StringVariable variable, int offset, Object value) {
		return new SET_StringVariable(variable, offset, value);
	}

	public void execute() {
		variable.insert(offset, getValueAsString());
	}
	
	@Override
	public String toString() {
		if (offset == 1)
			return variable.getName() + "=\"" + getValueAsString() + "\"";
		return variable.getName() + "[" + offset + "]=\"" + getValueAsString() + "\"";
	}
	
	private String getValueAsString() {
		if (value instanceof StringVariable) {
			StringVariable variable = (StringVariable)value;
			return variable.getValue();
		}
		return value.toString();
	}
}
