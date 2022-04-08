package model;

/**
 * This is a class to represent the species that live in the wetland.
 */
 
public class Species{
	
	/**
	 * The species name.
	 */
	 
	private String name;
	
	/**
	 * The scientific name of the species.
	 */
	
	private String scientificName;
	
	/**
	 * The species type.
	 */
	
	private String type;
	
	/**
	 * The species is migratory.
	 */

	private boolean isMigratory;
	
	
	/**
	 * This constructor instantiates an object of the wetland class with the species information.<br>
	 */
	
	public Species(String name, String scientificName, String type, boolean isMigratory){
		
		this.name = name;
		this.scientificName = scientificName;
		this.type = type;
		this.isMigratory = isMigratory;
		
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getScientificName(){
		return scientificName;
	}

	public void setScientificName(String scientificName){
		this.scientificName = scientificName;
	}

	public String getType(){
		return type;
	}

	public void setType(String type){
		this.type = type;
	}

	public boolean isMigratory(){
		return isMigratory;
	}

	public void setMigratory(boolean isMigratory){
		this.isMigratory = isMigratory;
	}
	
	
	public String toString(){
		
		return "Species [name=" + name + ", scientificName=" + scientificName + ", type=" + type + ", isMigratory=" + isMigratory + "]";
		
	}


}