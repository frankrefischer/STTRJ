package startrekj;

import java.util.Arrays;

public class ARRAY<T> {

	private Object[] array;

	public ARRAY(int i) {
		this.array = new Object[i];
	}

	public void setAllTo(T value) {
		Arrays.fill(array, value);
	}

}
