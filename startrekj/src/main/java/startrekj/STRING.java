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

	public STRING slice(int i, int j) {
		STRING slice = new STRING(i-j+1);
		StringBuilder x;
		return slice;
	}

}
