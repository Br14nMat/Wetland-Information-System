package model;

/**
 * This is a class to represent the events that take place in the wetland.
 */

public class Event{
	
	/**
	 * The event id.
	 */
	
	private String id;
	
	/**
	 * The event organizer.
	 */
	
	private String eventOrganizer;
	
	/**
	 * The event type.
	 */
	
	private String type;
	
	/**
	 * The event value.
	 */
	
	private double value;
	
	
	/**
	 * The event description.
	 */
	 
	private String description;
	
	/**
	 * The event date.
	 */
	
	private Date eventDate;
	
	
	/**
	 * This constructor instantiates an object of the wetland class with the event id.<br>
	 */
	 
	public Event(String id){
		
		this.id = id;
		
	}
	
	/**
	 * This constructor instantiates an object of the wetland class with the event information.<br>
	 */
	
	public Event(String id, String eventOrganizer, String type, double value, String description) {
		
		this.id = id;
		this.eventOrganizer = eventOrganizer;
		this.type = type;
		this.value = value;
		this.description = description;
		
	}

	public String getId(){
		return id;
	}
	
	public String getEventOrganizer(){
		return eventOrganizer;
	}

	public void setEventOrganizer(String eventOrganizer){
		this.eventOrganizer = eventOrganizer;
	}

	public String getType(){
		return type;
	}

	public void setType(String type){
		this.type = type;
	}

	public double getValue(){
		return value;
	}

	public void setValue(double value){
		this.value = value;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String description){
		this.description = description;
	}
	
	public Date getEventDate(){
		return eventDate;
	}

	public void setEventDate(Date eventDate){
		this.eventDate = eventDate;
	}
	
	
	public String toString(){
		
		return "Event [id =" + id + ", eventOrganizer=" + eventOrganizer + ", type=" + type + ", value=" + value + ", description=" + description + "]";
		
	}
	
}