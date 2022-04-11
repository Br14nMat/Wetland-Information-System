package model;

/**
 * This class represents a species in the wetland.
 */
public class Species {

	/**
	 * This is the name of the species.
	 */
	private String name;

	/**
	 * This is the scientific name of the species.
	 */
	private String scientificName;

	/**
	 * This atribute indicates wheter the species is migratory or not.
	 */
	private boolean isMigratory;

	/**
	 * This is the type of the species.
	 */
	private SpeciesType type;

	/**
	 * This is the constructor of the Species class.
	 */
	public Species(String name, String scientificName, SpeciesType type, boolean isMigratory) {
		
		this.name = name;
		this.scientificName = scientificName;
		this.type = type;
		this.isMigratory = isMigratory;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public boolean isMigratory() {
		return isMigratory;
	}

	public void setMigratory(boolean isMigratory) {
		this.isMigratory = isMigratory;
	}

	public SpeciesType getType() {
		return type;
	}

	public void setType(SpeciesType type) {
		this.type = type;
	}

	public String toString() {
		return "Species [name=" + name + ", scientificName=" + scientificName + ", type=" + type.toString() + ", isMigratory=" + isMigratory + "]";
	}

}