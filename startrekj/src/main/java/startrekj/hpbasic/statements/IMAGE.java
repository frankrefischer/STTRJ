package startrekj.hpbasic.statements;

import startrekj.hpbasic.Statement;

public class IMAGE implements Statement {
	private String imageString;
	
	private IMAGE(String imageString) {
		this.imageString = imageString;
	}
	
	public static IMAGE IMAGE(String imageString) {
		return new IMAGE(imageString);
	}
	
	@Override
	public String toString() {
		return "IMAGE " + imageString;
	}

	public void execute() {
	}

	public String getImageString() {
		return imageString;
	}
}
