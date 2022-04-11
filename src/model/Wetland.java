package model;

/**
 * This class represents a wetland.
 */

public class Wetland {

	/**
	 * This is the name of the wetland.
	 */
	private String name;

	/**
	 * This atribute indicates wheter the wetland is located in the urban area or not.
	 */
	private boolean isInUrbanArea;

	/**
	 * This atribute indicates wheter the wetland is public or not.
	 */
	private boolean isPublic;

	/**
	 * This atribute indicates wheter the wetland is protected or not.
	 */
	private boolean isProtected;

	/**
	 * This is the area of the wetland in km2.
	 */
	private double km2;

	/**
	 * This is the photo url of the wetland.
	 */
	private String photoUrl;

	/**
	 * This is the name of the location where the wetland is located.
	 */
	private String locationName;

	/**
	 * This is the percentage of compliance with the environmental management plan.
	 */
	private double percentageEnvironmentalManagement;

	/**
	 * This array contains the species of the wetland.
	 */
	private Species species[];

	/**
	 * This array contains the events of the wetland.
	 */
	private Event events[];


	/**
	 * This is the constructor of the Wetland class.
	 */
	public Wetland(String name, boolean isInUrbanArea, boolean isPublic, boolean isProtected, double km2, String locationName, String photoUrl) {
		
		this.name = name;
		this.isInUrbanArea = isInUrbanArea;
		this.isPublic = isPublic;
		this.isProtected = isProtected;
		this.km2 = km2;
		this.locationName = locationName;
		this.photoUrl = photoUrl;
		this.percentageEnvironmentalManagement = 0.0;

		this.species = new Species[100];
		this.events = new Event[100];

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isInUrbanArea() {
		return isInUrbanArea;
	}

	public void setInUrbanArea(boolean isInUrbanArea) {
		this.isInUrbanArea = isInUrbanArea;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public double getKm2() {
		return km2;
	}

	public void setKm2(double km2) {
		this.km2 = km2;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public boolean isProtected() {
		return isProtected;
	}

	public void setProtected(boolean isProtected) {
		this.isProtected = isProtected;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public double getPercentageEnvironmentalManagement() {
		return percentageEnvironmentalManagement;
	}

	public void setPercentageEnvironmentalManagement(double percentageEnvironmentalManagement) {
		this.percentageEnvironmentalManagement = percentageEnvironmentalManagement;
	}

	/**
	 * This method adds a species to the wetland.
	 * @param species Specie, the species to be added.
	 * @return message String, message that indicates if the species was added or not.
	 */
	public String addSpecies(Species species) {
		
		boolean hasSpace = false;

		for(int i = 0; i < this.species.length && !hasSpace; i++) {
			
			if(this.species[i] == null) {
				
				this.species[i] = species;
				
				hasSpace = true;
				
			}
		}

		return hasSpace
				? "Species added"
				: "No space available";
		
	}

	/**
	 * This method finds a species in the wetland by its name.
	 * @param name String, the name of the species to be found.
	 * @return species Species, the species found.
	 */
	public Species findSpecies(String name) {
		
		Species speciesFound = null;
		boolean stopFlag = false;

		for(int i = 0; i < species.length && !stopFlag; i++) {
			
			if(species[i] != null && species[i].getName().equals(name)) {
				
				speciesFound = species[i];
				stopFlag = true;
				
			}
		}

		return speciesFound;

	}

	/**
	 * This method adds an event to the wetland.
	 * @param event Event, the event to be added.
	 * @return message String, message that indicates if the event was added or not.
	 */
	public String addEvent(Event event) {
		
		boolean hasSpace = false;

		for(int i = 0; i < events.length && !hasSpace; i++) {
			
			if(events[i] == null) {
				
				events[i] = event;
				
				hasSpace = true;
				
			}
		}

		return hasSpace
				? "Event added"
				: "No space available";
	}

	/**
	 * This method finds an event in the wetland by its id.
	 * @param id String, the id of the event to be found.
	 * @return event Event, the event found.
	 */
	public Event findEvent(String id) {
		
		Event eventFound = null;
		boolean stopFlag = false;

		for(int i = 0; i < events.length && !stopFlag; i++) {
			
			if(events[i] != null && events[i].getId().equals(id)) {
				
				eventFound = events[i];
				stopFlag = true;
				
			}
		}

		return eventFound;
		
	}


	/**
	 * This method calculates the number of maintenances that the wetland has in a given year.
	 * @param year int, the given year.
	 * @return maintenancesNumber int, the number of maintenances that the wetland has in a given year.
	 */
	public int maintenancesNumberIn(int year) {
		
		int maintenancesNumber = 0;

		for(int i = 0; i < events.length; i++) {
			
			if(	events[i] != null 
				&& events[i].getType() == EventType.MAINTENANCE 
				&& events[i].getEventDate().getYear() == year)
					maintenancesNumber++;
		}

		return maintenancesNumber;
	}

	/**
	 * This method calculates the number of flora species in the wetland.<br>
	 * @return floraSpecies int, the number of flora species in the wetland.
	 */

	public int calculateFloraSpecies() {
		
		int floraSpecies = 0;

		for(int i = 0; i < species.length; i++) {
			
			if(	species[i] != null
				&&(species[i].getType() == SpeciesType.TERRESTRIAL_FLORA ||
				species[i].getType() == SpeciesType.AQUATIC_FLORA))
					floraSpecies++;

		}

		return floraSpecies;

	}

	/**
	 * This method calculates the number of species by type in the wetland.<br>
	 * @return String speciesByType, the String that contains the number of species by type in the wetland.<br>
	 */
	public String calculateSpeciesByType() {
		
		String speciesByType = "";
		int terrestrialFlora = 0, aquaticFlora = 0, bird = 0, mammal = 0, aquatic = 0;

		for(int i = 0; i < species.length; i++){

			if(species[i] != null){

				switch(species[i].getType()){

					case TERRESTRIAL_FLORA:
						terrestrialFlora++;
						break;

					case AQUATIC_FLORA:
						aquaticFlora++;
						break;

					case BIRD:
						bird++;
						break;

					case MAMMAL:
						mammal++;
						break;

					case AQUATIC:
						aquatic++;
						break;

				}

			}

		}

		speciesByType = "Terrestrial flora: " + terrestrialFlora + "\n" +
						"Aquatic flora: " + aquaticFlora + "\n" +
						"Bird: " + bird + "\n" +
						"Mammal: " + mammal + "\n" +
						"Aquatic: " + aquatic;

		return speciesByType;

	}

	/**
	 * This method calculate the number of animals in the wetland.<br>
	 * @return animals int, the number of animals in the wetland.
	 */
	public int animalsNumber() {
		
		int animalsNumber = 0;

		for(int i = 0; i < species.length; i++) {
			
			if( species[i] != null
				&& (species[i].getType() == SpeciesType.MAMMAL
				|| species[i].getType() == SpeciesType.BIRD
				|| species[i].getType() == SpeciesType.AQUATIC))
					animalsNumber++;
		}

		return animalsNumber;

	}

	@Override
	public String toString() {
		return "Wetland [name=" + name + ", isInUrbanArea=" + isInUrbanArea + ", isPublic=" + isPublic
				+ ", isProtected=" + isProtected + ", km2=" + km2 + ", photoUrl=" + photoUrl + ", locationName="
				+ locationName + ", percentageEnvironmentalManagement=" + percentageEnvironmentalManagement + "]";
	}
	

}