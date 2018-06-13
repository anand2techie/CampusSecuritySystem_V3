package test;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class NewAlertProducer extends Observable {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String[] newAlertData;
	private String weatherData;
	private String nationalAlert;
	private String campusAlert;

	public String getWeatherData() {
		return weatherData;
	}

	public String getNationalAlert() {
		return nationalAlert;
	}

	public String getCampusAlert() {
		return campusAlert;
	}


	public String[] getNewAlertData() {
		return newAlertData;
	}

	public void setNewAlertData(String[] newAlertData) {
		this.newAlertData = newAlertData;
		setChanged();
		notifyObservers(this, newAlertData);
	}

	public ArrayList getObservers() {
		return observers;
	}

	public void setObservers(ArrayList observers) {
		this.observers = observers;
	}

	public void notifyObservers(Observable observable, String[] newAlertData) {
		System.out.println("Notifying to all the subscribers when new alert data comes in");
		for (Observer ob : observers) {
			ob.update(observable, this.newAlertData);
		}

	}

	public void registerObserver(Observer observer) {
		observers.add(observer);

	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}
}
