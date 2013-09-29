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

	public T get(int i) {
		return (T)array[i];
	}

	public void set(int i, T value) {
		array[i] = value;
	}

}
