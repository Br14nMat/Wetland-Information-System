package model;

/**
 * This is the driver class of the model package. This is a class to represent a wetland with its information.
 */

public class Wetland{
	
	/**
	 * This array contains the objects of the Event class.
	 */
	 
	private Event [] events;
	
	/**
	 * This array contains the objects of the Species class.
	 */
	
	private Species [] species;
	
	/**
	 * This object contains the information of wetland environmental management.
	 */
	
	private EnvironmentalManagement environmentalManagement;
	
	/**
	 * The wetland name.
	 */
		 
	private String name;
	
	/**
	 * The wetland is in the urban area.
	 */
	
	private boolean isInUrbanArea;
	
	/**
	 * The wetland is public.
	 */

	private boolean isPublic;
	
	/**
	 * kilometers number of the wetland.
	 */
	
	private double km2;
	
	/**
	 * photo url wetland.
	 */
	
	private String photoUrl;
	
	/**
	 * The wetland is protected
	 */
	
	private boolean isProtected;
	
	/**
	 * The town name, in case the wetland is located in the rural area
	 */
	
	private String townName;
	
	/**
	 * The neighbourhood name, in case the wetland is located in the urban area
	 */
	
	private String neighbourhoodName;
	
	/**
	 * This constructor instantiates an object of the wetland class with the wetland name.<br>
	 */
	
	public Wetland(String name){
		
		this.name = name;
		
		species = new Species[1000];
		events = new Event[1000];
		
	}


	/**
	 * This constructor instantiates an object of the wetland class with the wetland information.<br>
	 */
	
	public Wetland(String name, boolean isInUrbanArea, boolean isPublic, boolean isProtected, double km2, String townName, String neighbourhoodName){
		
		this.name = name;
		this.isInUrbanArea = isInUrbanArea;
		this.isPublic = isPublic;
		this.isProtected = isProtected;
		this.km2 = km2;
		this.townName = townName;
		this.neighbourhoodName = neighbourhoodName;
		
		species = new Species[1000];
		events = new Event[1000];
		
	}


	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public boolean isInUrbanArea(){
		return isInUrbanArea;
	}

	public void setInUrbanArea(boolean isInUrbanArea){
		this.isInUrbanArea = isInUrbanArea;
	}

	public boolean isPublic(){
		return isPublic;
	}

	public void setPublic(boolean isPublic){
		this.isPublic = isPublic;
	}

	public double getKm2(){
		return km2;
	}

	public void setKm2(double km2){
		this.km2 = km2;
	}

	public String getPhotoUrl(){
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl){
		this.photoUrl = photoUrl;
	}

	public boolean isProtected(){
		return isProtected;
	}

	public void setProtected(boolean isProtected){
		this.isProtected = isProtected;
	}

	public String getTownName(){
		return townName;
	}

	public void setTownName(String townName){
		this.townName = townName;
	}

	public String getNeighbourhoodName(){
		return neighbourhoodName;
	}

	public void setNeighbourhoodName(String neighbourhoodName){
		this.neighbourhoodName = neighbourhoodName;
	}

	public EnvironmentalManagement getEnvironmentalManagement(){
		return environmentalManagement;
	}

	public void setEnvironmentalManagement(EnvironmentalManagement environmentalManagement){
		this.environmentalManagement = environmentalManagement;
	}

	
	public String toString(){
		return "Wetland [isInUrbanArea=" + isInUrbanArea + ", isPublic=" + isPublic + ", isProtected=" + isProtected + ", km2="
				+ km2 + ", photoUrl=" + photoUrl + ", townName=" + townName + ", neighbourhoodName=" + neighbourhoodName + 
				", environmentalManagementPercentage=" + environmentalManagement.getPercentage() + "]";
	}
	
	/*
	
	public void addSpecies(Species species){
		
		//do something
		
	}
	
	public void addEvent(Event event) {
		
		// do something
		
	}	
	
	public Species findSpecies(String speciesName){
		
		// find species
		
	}
	
	public Event findEvent(String eventId){
		
		// find species
		
	}
	
	public boolean hasSpace(){
		
		//return true;
		
	}
	
	*/
	
}