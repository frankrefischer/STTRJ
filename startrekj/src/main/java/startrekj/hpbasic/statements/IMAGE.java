package startrekj.hpbasic.statements;

import startrekj.hpbasic.Statement;

public class IMAGE implements Statement {
	private StringBuilder imageString = new StringBuilder();
	private StringBuilder formatString = new StringBuilder();
	
	private IMAGE() {
	}
	
	public static IMAGE IMAGE() {
		return new IMAGE();
	}
	public IMAGE FORMAT(String imageString) {
		this.imageString.append(imageString);
		formatString.append(convertToFormatString(imageString));
		return this;
	}
	public IMAGE STRING(String imageString) {
		this.imageString.append(imageString);
		formatString.append(imageString);
		return this;
	}
	public String getFormatString() {
		return formatString.toString();
	}
	private String convertToFormatString(String imageString) {
		String formatString = imageString;
		formatString = formatString.replace("8(X,3A)", " %3s %3s %3s %3s %3s %3s %3s %3s");
		formatString = formatString.replace("8X", "        ");
		formatString = formatString.replace("9X", "         ");
		formatString = formatString.replace("11X", "           ");
		formatString = formatString.replace("5D", "%5s");
		formatString = formatString.replace("6A", "%6s");
		formatString = formatString.replace("6D", "%6s");
		formatString = formatString.replace("3D", "%3s");
		formatString = formatString.replace("D", "%1s");
		return formatString;
	}

	@Override
	public String toString() {
		return "IMAGE " + imageString;
	}

	public void execute() {
	}

	public String getImageString() {
		return imageString.toString();
	}
}
