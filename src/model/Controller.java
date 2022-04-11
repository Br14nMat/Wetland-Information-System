package model;

 /**
  * This is the controller class that communicates the view and the model.
  */

public class Controller {

	/**
	 * This atribute is used to communicate with the Wetland Information System.
	 */

	private WetlandInformationSystem wis;

	/**
	 * This is the constructor of the Controller class. It initializes the communication with the Wetland Information System.
	 */
	public Controller() {
		
		wis = new WetlandInformationSystem();
		
	}

	/**
	 * This method creates a new Wetland and sends it to the Wetland Information System.
	 * @param name String, the name of the wetland.<br>
	 * @param isInUrbanArea boolean, whether the wetland is in an urban area.<br>
	 * @param isPublic boolean, whether the wetland is public.<br>
	 * @param isProtected boolean, whether the wetland is protected.<br>
	 * @param km2 double, the area of the wetland in km2.<br>
	 * @param locationName String, the name of the location where the wetland is located.<br>
	 * @param photoUrl String, the url of the photo of the wetland.<br>
	 * @return message String, message that informs the user if the wetland was registered or not.
	 */
	public String registerWetland(String name, boolean isInUrbanArea, boolean isPublic, boolean isProtected, double km2, String locationName, String photoUrl) {
		
		Wetland wetland = new Wetland(name, isInUrbanArea, isPublic, isProtected, km2, locationName, photoUrl);

		String message = wis.addWetland(wetland);

		return message;

	}

	/**
	 * This method creates a new Species and sends it to the Wetland Information System.<br>
	 * @param wetlandName String, the name of the wetland where the species is located.<br>
	 * @param speciesName String, the name of the species.<br>
	 * @param scientificName String, the scientific name of the species.<br>
	 * @param type int, the type of the species.<br>
	 * @param isMigratory boolean, whether the species is migratory.<br>
	 * @return message String, message that informs the user if the species was registered or not.
	 */
	public String registerSpecies(String wetlandName, String speciesName, String scientificName, int type, boolean isMigratory) {
		
		SpeciesType speciesType = null;

		switch(type) {
			case 1:
				speciesType = SpeciesType.TERRESTRIAL_FLORA;
				break;
			case 2:
				speciesType = SpeciesType.AQUATIC_FLORA;
				break;
			case 3:
				speciesType = SpeciesType.BIRD;
				break;
			case 4:
				speciesType = SpeciesType.MAMMAL;
				break;
			case 5:
				speciesType = SpeciesType.AQUATIC;
				break;
		}
				

		Species species = new Species(speciesName, scientificName, speciesType, isMigratory);

		String message = wis.addSpecies(wetlandName, species);

		return message;

	}

	/**
	 * This method creates a new Event and sends it to the Wetland Information System.<br>
	 * @param wetlandName String, the name of the wetland where was carried out.<br>
	 * @param eventId String, the id of the event.<br>
	 * @param type int, the type of the event.<br>
	 * @param eventOrganizer String, the name of the event organizer.<br>
	 * @param value double, the value of the event.<br>
	 * @param description String, the description of the event.<br>
	 * @return message String, message that informs the user if the event was registered or not.
	 */
	public String registerEvent(String wetlandName, String eventId, String eventDate, int type, String eventOrganizer, double value, String description) {
		
		EventType eventType = null;

		switch(type) {
			case 1:
				eventType = EventType.MAINTENANCE;
				break;
			case 2:
				eventType = EventType.SCHOOL_VISIT;
				break;
			case 3:
				eventType = EventType.IMPROVEMENT_ACTIVITIES;
				break;
			case 4:
				eventType = EventType.CELEBRATION;
				break;
		}
		
		String dateSplit[] = eventDate.split("/");
		Date date = new Date(Integer.parseInt(dateSplit[0]), Integer.parseInt(dateSplit[1]), Integer.parseInt(dateSplit[2]));

		Event event = new Event(eventId, date, eventType, eventOrganizer, value, description);

		String message = wis.addEvent(wetlandName, event);

		return message;

	}

	/**
	 * This method sends the year entered by the user to the Wetland Information System.<br>
	 * @param year int, the year entered by the user.<br>
	 * @return information String, the response from the Wetland Information System.
	 */
	public String maintenancesNumberIn(int year) {

		return wis.maintenancesNumberIn(year);
	}

	/**
	 * This method calls the method of the Wetland Information System to get the name of the wetland with least flora.<br>
	 * @return wetlandName String, the name of the wetland with least number of flora.<br>
	 */
	public String showWetlandLeastFlora() {
		
		return wis.showWetlandLeastFlora();
	}

	/**
	 * This method sends the name of the species entered by the user to the Wetland Information System.<br>
	 * @param speciesName String, the name of the species entered by the user.<br>
	 * @return wetlandsName String, the name of the wetlands that have the species entered by the user.<br>
	 */
	public String wetlandsThatHave(String speciesName) {

		return wis.wetlandsThatHave(speciesName);
		
	}

	/**
	 * This method calls the method of the Wetland Information System to get the wetlands information.<br>
	 * @return information String, the information of the wetlands.<br>
	 */
	public String showWetlandsInfo() {

		return wis.showWetlandsInfo();
		
	}

	/**
	 * This method calls the method of the Wetland Information System to get the name of the wetland with largest number of animals.<br>
	 * @return wetlandName String, the name of the wetland with largest number of animals.<br>
	 */

	public String showWetlandMostAnimals() {
		
		return wis.showWetlandMostAnimals();

	}

}