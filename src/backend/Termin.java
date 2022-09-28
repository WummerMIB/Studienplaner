package backend;

public class Termin {
	
	private String date;
	private String text;
	
	public Termin(String date, String text) {
		this.date = date;
		this.text = text;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String toString() {
		return date + " " + text;
	}

}
