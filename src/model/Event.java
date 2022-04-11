package model;

/**
 * This class represents wetland event.
 */
public class Event {

	/**
	 * This is the id of the event.
	 */
	private String id;

	/**
	 * This is the event organizer of the event.
	 */
	private String eventOrganizer;

	/**
	 * This is the value of the event
	 */
	private double value;

	/**
	 * This is the description of the event.
	 */
	private String description;

	/**
	 * This the date of the event.
	 */
	private Date eventDate;

	/**
	 * This is the type of the event.
	 */
	private EventType type;

	/**
	 * This is the constructor of the Event class.
	 */
	public Event(String id, Date eventDate, EventType type, String eventOrganizer, double value, String description) {
		
		this.id = id;
		this.eventDate = eventDate;
		this.type = type;
		this.eventOrganizer = eventOrganizer;
		this.value = value;
		this.description = description;
		

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventOrganizer() {
		return eventOrganizer;
	}

	public void setEventOrganizer(String eventOrganizer) {
		this.eventOrganizer = eventOrganizer;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", eventDate="+ eventDate.toString() + ", type=" + type.toString() + ", eventOrganizer=" + eventOrganizer + ", value=" + value + ", description="
				+ description + "]";
	}
	

}