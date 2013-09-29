package startrekj;

public class ExeceptionalGOTO extends RuntimeException {

	private Runnable nextRunnable;

	public ExeceptionalGOTO(Runnable LINE_230) {
		this.nextRunnable = LINE_230;
	}

	public Runnable getNextRunnable() {
		return nextRunnable;
	}

}
