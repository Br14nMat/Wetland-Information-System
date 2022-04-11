package model;

/**
 * This class represents a date.
 */
public class Date {

	private int day;
	private int month;
	private int year;

	/**
	 * This is the constructor for the Date class.
	 */
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMoth() {
		return month;
	}

	public void setMoth(int moth) {
		this.month = moth;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

}