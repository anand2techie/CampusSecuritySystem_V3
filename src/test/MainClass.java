package test;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * CampusSecurity campusSecurity = new CampusSecurity();
		 * 
		 * // do this for every 'n' seconds, showing that display changes every time
		 * campusSecurity.alertsChanged(getNewAlertData()); showDisplay(campusSecurity);
		 */
		Threat threat = new Threat();
		NewAlertProducer newAlert = new NewAlertProducer();

		// When you opt for option "Notify me when new alert is set".Below
		// registerObserver method
		// get executed
		newAlert.registerObserver(threat);
		// Now alert data is set
		newAlert.setNewAlertData(getNewAlertData());
	}

	// call this method every 5 seconds
	static String[] getNewAlertData() {
		// write the code to get the new alert data from a collection. Collection should
		// have the sample alert data dump (may be, 10 alert data for instance)

		// array is for example, use a better DS
		return new String[] { "Weather is hot", "color level is high", "Be safe! Don't go outside!" };

	}

}
