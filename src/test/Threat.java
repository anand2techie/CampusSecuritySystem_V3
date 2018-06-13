package test;

import java.util.Observable;
import java.util.Observer;

public class Threat implements Observer {

	private String weather;
	private String nationalThreatLevel;
	private String campusThreats;

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getNationalThreatLevel() {
		return nationalThreatLevel;
	}

	public void setNationalThreatLevel(String nationalThreatLevel) {
		this.nationalThreatLevel = nationalThreatLevel;
	}

	public String getCampusThreats() {
		return campusThreats;
	}

	public void setCampusThreats(String campusThreats) {
		this.campusThreats = campusThreats;
	}

	public void update(Observable arg0, Object arg1) {
		String[] newAlertData=(String[]) arg1;
		
		System.out.println("weather: " + newAlertData[0]);
		System.out.println("national threat level: " + newAlertData[1]);
		System.out.println("campus threats: " + newAlertData[2]);
	}

}
