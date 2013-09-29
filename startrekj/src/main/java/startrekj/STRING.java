package startrekj;

public class STRING {
	private char[] chars;
	
	public STRING(int i) {
		chars = new char[i]
;	}

	public void set(String string) {
		setWithOneBasedIndex(1, string);
	}

	public void setWithOneBasedIndex(int i, String string) {
		setCharsWithZeroBasedOffset(i, string.toCharArray());
	}

	private void setCharsWithZeroBasedOffset(int i, char[] charArray) {
		for(int j = 0; j < charArray.length; ++j)
			chars[j+i-1] = charArray[j];
	}

	public STRING slice(int start, int end) {
		STRING slice = new STRING(end-start+1);
		for(int i=0; i<slice.chars.length; ++i)
			slice.chars[i] = chars[i+start-1];
		return slice;
	}
	@Override
	public boolean equals(Object other) {
		STRING otherSTRING = (STRING) other;
		if ( otherSTRING.chars.length != chars.length )
			return false;
		for(int i = 0; i < chars.length; ++i)
			if ( chars[i] != otherSTRING.chars[i] )
				return false;
		return true;
	}

	public void replace(int start, int end, STRING string) {
		for(int i = start; i < end - start + 1; ++i)
			chars[i] = string.chars[i-start+1];
	}
	@Override
	public String toString() {
		return String.valueOf(chars);
	}
}
