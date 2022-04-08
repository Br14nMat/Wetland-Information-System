package model;

import java.util.Scanner;

/**
 * This is the main class of the Wetland Information System.
 * @author Br14n
 */

public class WetlandInformationSystem{
	
	/**
	 * sc is an object of the scanner class for reading input.
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * This array contains the objects of the Wetland class.
	 */
	
	private static Wetland [] wetlands;
		
	
	/**
	 * This method adds a Wetland class object to the array containing the wetlands.<br>
	 * <b>pre:</b> The wetlands array must be initialized.<br>
	 * <b>pos:</b> Wetland class object is added to the wetlands array.<br>
	 * @param wetland Wetland, Wetland class object.<br>
	 */
	
	public void addWetland(String name, boolean isInUrbanArea, boolean isPublic, boolean isProtected, double km2, String townName, String neighbourhoodName){
		
		//do something
		
	}
	
	/**
	 * This method finds a Wetland class object in the array containing the wetlands.<br>
	 * <b>pre:</b> The wetlands array must be initialized.<br>
	 * @param wetland Wetland, The wetland name to search for.<br>
	 * @return msg String, The Wetland class object found or null.
	 */
	
	
	public Wetland findWetland(String wetlandName){
		
		//find wetland
		
		return null;
		
	}
	
	/**
	 * This method adds a new species to the wetland.<br>
	 * <b>pre:</b> The findWetland method must be declared.<br>
	 * @param wetlandName String, The wetland name.<br>
	 * @param speciesName String, The new species name.<br>
	 * @param scientificName String, The scientific name of the new species.<br>
	 * @param type String, The new species type.<br>
	 * @param isMigratory boolean, The new species is migratory.<br>
	 */
	
	public void addNewSpecies(String wetlandName, String speciesName, String scientificName, String type, boolean isMigratory){
				
		//wetlandFound = findWetland(...);
		
		//wetlandFound.addSpecies(...);
		
	}
	
	/**
	 * This method adds a new event to the wetland.<br>
	 * <b>pre:</b> The findWetland method must be declared.<br>
	 * @param wetlandName String, The wetland name.<br>
	 * @param eventOrganizer String, The event organizer id.<br>
	 * @param eventValue double, The event value.<br>
	 * @param eventDescription String, The event description.<br>
	 * @param eventType String, The event type.<br>
	 */
	
	public void addEvent(String wetlandName, String eventId, String eventOrganizer, double eventValue, String eventDescription, String eventType){
		
		//do something
		
	}
	
	/**
	 * This method returns the quantity of maintenance performed in a year.<br>
	 * <b>pre:</b> The wetlands array must be initialized.<br>
	 * @param year int, The year entered by the user.<br>
	 * @return maintenances int, The maintenance quantity in a year.
	 */
	

	public int maintenancesQuantityIn(int year){
		
		//do something
		
		return 0;
		
	}
	
	/**
	 * This method shows the wetland name with the least flora.<br>
	 * <b>pre:</b> The wetlands array must be initialized.<br>
	 */
	
	public void showWetlandLeastFlora(){
		
		//do something
		
	}
	
	/**
	 * This method shows the wetlands that have a specific species.<br>
	 * <b>pre:</b> The wetlands array must be initialized.<br>
	 * @param speciesName String, The species name.<br>
	 */
	
	public void showSpeciesInWetland(String speciesName){
		
		//do something
		
	}
	
	/**
	 * This method shows the information for all wetlands, including wetlands, including the total number of species by type.<br>
	 * <b>pre:</b> The wetlands array must be initialized.<br>
	 */
	
	public void showWetlandInfo(){
		
		//do something
		
	}
	
	/**
	 * This method shows the wetland name with the highest number of animals.<br>
	 * <b>pre:</b> The wetlands array must be initialized.<br>
	 */
	
	public void showWetlandMoreAnimals(){
		
		//do something
		
	}
	
}
