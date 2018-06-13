package test;

public class CampusSecurity {
	
	String weatherData;
	String nationalAlert;
	String campusAlert;

	public String getWeatherData() {
		return weatherData;
	}

	public String getNationalAlert() {
		return nationalAlert;
	}

	public String getCampusAlert() {
		return campusAlert;
	}

	public void alertsChanged(String[] data) { 
		this.weatherData=data[0];
		this.nationalAlert=data[1];
		this.campusAlert=data[2];
	}
}
