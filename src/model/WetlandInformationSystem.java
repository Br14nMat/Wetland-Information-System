package model;

/**
 * This class represents the information system.
 */

public class WetlandInformationSystem {

	/**
	 * This array contains the wetlands of the information system.
	 */
	private Wetland wetlands[];

	/**
	 * This is the constructor of the WetlandInformationSystem class. It initializes the array to store 80 wetlands.
	 */
	public WetlandInformationSystem() {
		
		wetlands = new Wetland[80];
	}

	/**
	 * This method adds a new wetland to the system.<br>
	 * @param wetland Wetland, the wetland to be added.<br>
	 * @return message String, message that informs the user if the wetland was added or not.<br>
	 */
	public String addWetland(Wetland wetland) {
		
		boolean hasSpace = false;

		for (int i = 0; i < wetlands.length && !hasSpace; i++) {
			
			if (wetlands[i] == null) {
				
				wetlands[i] = wetland;
				
				hasSpace = true;
				
			}
		}

		return hasSpace  
				? "Wetland added" 
				: "No space available";

	}

	/**
	 * This method finds a wetland by its name.<br>
	 * @param name String, the name of the wetland to be found.<br>
	 * @return Wetland, the wetland found.<br>
	 */
	public Wetland findWetland(String name) {
		
		Wetland wetlandFound = null;
		boolean stopFlag = false;

		for(int i = 0; i < wetlands.length && !stopFlag; i++) {
			
			if(wetlands[i] != null && wetlands[i].getName().equals(name)) {			
				wetlandFound = wetlands[i];
				stopFlag = true;
			}
		}

		return wetlandFound;

	}

	/**
	 * This method finds the wetland and adds a species to it.<br>
	 * @param wetlandName String, the name of the wetland to be found.<br>
	 * @param species Species, the species to be added.<br>
	 * @return message String, message that informs the user if the species was added or not.<br>
	 */
	public String addSpecies(String wetlandName, Species species) {
		
		String message;
		Wetland wetland = findWetland(wetlandName);

		message = wetland != null 
				? wetland.addSpecies(species) 
				: "Wetland not found";

		return message;

	}

	/**
	 * This method finds the wetland and adds a event to it.<br>
	 * @param wetlandName String, the name of the wetland to be found.<br>
	 * @param event Event, the event to be added.<br>
	 * @return message String, message that informs the user if the event was added or not.<br>
	 */
	public String addEvent(String wetlandName, Event event) {
		
		String message;
		Wetland wetland = findWetland(wetlandName);

		message = wetland != null 
				? wetland.addEvent(event) 
				: "Wetland not found";

		return message;

	}

	/**
	 * This method concatenates the wetland name and the number of maintenances in a given year for each wetland. This information is returned in a text String.<br>
	 * @param year int, the given year.<br>
	 * @return information String, the String that contains the information.<br>
	 */
	public String maintenancesNumberIn(int year) {

		String information = "";

		for(int i = 0; i < wetlands.length; i++) {
			
			if(wetlands[i] != null) {
				
				information += wetlands[i].getName() + ": " + wetlands[i].maintenancesNumberIn(year) + "\n";
			}
		}

		return information;
	}
	
	/**
	 * This method calculates the lowest number of flora in the wetlands.<br>
	 * @return name String, the name of the wetland with the lowest number of flora.<br>
	 */

	public String showWetlandLeastFlora() {
		
		String wetlandLeastFlora = "";
		int lowerNumFlora = 99999;

		for(int i = 0; i < wetlands.length; i++) {
			
			if(wetlands[i] != null && wetlands[i].calculateFloraSpecies() < lowerNumFlora) {
				wetlandLeastFlora = wetlands[i].getName();
				lowerNumFlora = wetlands[i].calculateFloraSpecies();
			}
		}

		return wetlandLeastFlora;

	}

	/**
	 * This method concatenates the name of the wetlands that have a given species.<br>
	 * @param speciesName String, the given species name.<br>
	 * @return nameOfWetlands String, the name of the wetlands that have a given species.<br>
	 */
	public String wetlandsThatHave(String speciesName) {

		String nameOfWetlands = "";

		for(int i = 0; i < wetlands.length; i++) {
			
			if(wetlands[i] != null && wetlands[i].findSpecies(speciesName) != null)
				nameOfWetlands += wetlands[i].getName() + "\n";
			
		}

		if(nameOfWetlands.equals(""))
			nameOfWetlands = "No wetlands have this species";
	
		return nameOfWetlands;
	}

	/**
	 * This method returns the information of the wetlands. This information includes the number of species by type.<br>
	 * @return information String, the information of the wetlands.<br>
	 */

	public String showWetlandsInfo() {
		
		String information = "";

		for(int i = 0; i < wetlands.length; i++) {
			
			if(wetlands[i] != null) {
				
				information += wetlands[i].toString() + "\n";

				information += "Species by type: \n" + wetlands[i].calculateSpeciesByType() + "\n";
			}
		}

		return information;

	}

	/**
	 * This method calculates the largest number of animals in the wetlands.<br>
	 * @return wetlandMostAnimals String, the name of the wetland with the largest number of animals.<br>
	 */
	public String showWetlandMostAnimals() {
		
		int largestNumAnimals = -1;
		String wetlandMostAnimals = "";

		for(int i = 0; i < wetlands.length; i++) {
			
			if(wetlands[i] != null && wetlands[i].animalsNumber() > largestNumAnimals) {
				wetlandMostAnimals = wetlands[i].getName();
				largestNumAnimals = wetlands[i].animalsNumber();
			}

		}

		return wetlandMostAnimals;

	}

}