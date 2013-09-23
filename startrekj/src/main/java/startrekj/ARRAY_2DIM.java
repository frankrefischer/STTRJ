package startrekj;

import java.util.Arrays;

public class ARRAY_2DIM<T> {
	private Object[][] array;
	public ARRAY_2DIM(int i, int j) {
		array = new Object[i][j];
	}
	public ARRAY_2DIM<T> set(int i, int j, Integer k) {
		array[i-1][j-1] = k;
		return this;
	}
	public T get(int i, int j) {
		return (T) array[i-1][j-1];
	}
	public void setAllTo(T value) {
		for(int i = 0; i < array.length; ++i)
			Arrays.fill(array[i], value);
	}

}
