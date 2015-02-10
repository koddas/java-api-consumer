package koddas.web.consumer.beans;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * DayBean is a class that encapsulates information about a specific day.
 * 
 * @author Johan Holmberg
 */
public class DayBean {
	
	@SerializedName("datum")
	private String date;
	@SerializedName("veckodag")
	private String dayOfWeek;
	@SerializedName("arbetsfri dag")
	private String dayOff;
	@SerializedName("röd dag")
	private String holiday;
	@SerializedName("namnsdag")
	public List<String> todaysNames;
	
	/**
	 * Being a bean, the class needs an empty, public constructor.
	 */
	public DayBean() {
		
	}
	
	/**
	 * Tells whether the day is off or not.
	 * 
	 * @return true if the current day is a day off, otherwise false.
	 */
	public boolean dayIsOff() {
		return dayOff != null && dayOff.equals("Ja");
	}
	
	/**
	 * Tells whether the day is a holiday or not.
	 * 
	 * @return true if the current day is a holiday, otherwise false.
	 */
	public boolean isHoliday() {
		return holiday != null && holiday.equals("Ja");
	}
	
	/**
	 * Returns the date of this day.
	 * 
	 * @return The date.
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets the date of this day.
	 * 
	 * @param date The date.
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Returns the weekday as a string.
	 * 
	 * @return The name of the day.
	 */
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	/**
	 * Sets the name of the day.
	 * 
	 * @param dayOfWeek The name of the day.
	 */
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	/**
	 * Returns the value of "day off". Typically "Ja" or "Nej".
	 * 
	 * @return Typically "Ja" or "Nej".
	 */
	public String getDayOff() {
		return dayOff;
	}

	/**
	 * Sets the value of "day off". Typically "Ja" or "Nej".
	 * 
	 * @param dayOff Typically "Ja" or "Nej".
	 */
	public void setDayOff(String dayOff) {
		this.dayOff = dayOff;
	}

	/**
	 * Returns the holiday value. Typically "Ja" or "Nej".
	 * 
	 * @return Typically "Ja" or "Nej".
	 */
	public String getHoliday() {
		return holiday;
	}

	/**
	 * Sets the holiday value. Typically "Ja" or "Nej".
	 * 
	 * @param holiday Typically "Ja" or "Nej".
	 */
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
}
