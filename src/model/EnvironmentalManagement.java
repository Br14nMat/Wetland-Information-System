package model;

/**
 * This is a class to represent the environmental management plan with its information.
 */

public class EnvironmentalManagement{
	
	/**
	 * The environmental management percentage
	 */
	private double percentage;
	
	/**
	 * The number of restauration activities
	 */
	
	private int restaurationActivities;
	
	/**
	 * The number of maintenance activities
	 */
	
	private int maintenanceActivities;
	
	/**
	 * The number of conservation activities
	 */
	
	private int conservationActivities;
	
	/**
	 * This constructor instantiates an object of the wetland class without the environmental management information.<br>
	 */
	
	public EnvironmentalManagement(){
		
	}
	
	/**
	 * This constructor instantiates an object of the wetland class with the environmental management information.<br>
	 */
	
	public EnvironmentalManagement(int restaurationActivities, int maintenanceActivities, int conservationActivities) {
		
		this.restaurationActivities = restaurationActivities;
		this.maintenanceActivities = maintenanceActivities;
		this.conservationActivities = conservationActivities;
		
	}
	
	
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getRestaurationActivities() {
		return restaurationActivities;
	}

	public void setRestaurationActivities(int restaurationActivities) {
		this.restaurationActivities = restaurationActivities;
	}

	public int getMaintenanceActivities() {
		return maintenanceActivities;
	}

	public void setMaintenanceActivities(int maintenanceActivities) {
		this.maintenanceActivities = maintenanceActivities;
	}

	public int getConservationActivities() {
		return conservationActivities;
	}

	public void setConservationActivities(int conservationActivities) {
		this.conservationActivities = conservationActivities;
	}
	
	
	public String toString() {
		return "EnvironmentalManagement [percentage=" + percentage + ", restaurationActivities=" + restaurationActivities
				+ ", maintenanceActivities=" + maintenanceActivities + ", conservationActivities="
				+ conservationActivities + "]";
	}

}