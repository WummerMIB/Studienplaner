package api;

import backend.Terminplaner;
import ui.TerminErstellen;

public class API {
	
	private Terminplaner tP;
	
	public API() {
		tP = new Terminplaner();
	}

	public void saveTermin(String date, String text) {
		tP = new Terminplaner();
		tP.saveTermin(date,text);
	}

}
