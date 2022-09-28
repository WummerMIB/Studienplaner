package backend;

import api.API;

public class Terminplaner {
	
	private API api;
	
	public Terminplaner() {
		api = new API();
	}
	
	public void saveTermin(String date, String text) {			
		checkRightTermin(date);
	}

	private String checkRightTermin(String date) {
		if(date == null) {
			return "";
		}
		
		String[] dateChecker = date.split("\\.");
		if(dateChecker.length != 3) {
			return "";
		}
		
		int day = Integer.parseInt(dateChecker[0]);
		System.out.println(day);
		int month = Integer.parseInt(dateChecker[1]);
		System.out.println(month);
		int year = Integer.parseInt(dateChecker[2]);
		
		
		return "";	
	}

}
