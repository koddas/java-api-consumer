package koddas.web.consumer.beans;

import java.util.Map;
import java.util.TreeMap;

import com.google.gson.annotations.SerializedName;

/**
 * A simple bean that encapsulates some rather uninteresting data.
 * 
 * @author Johan Holmberg
 */
public class EnvelopeBean {

	@SerializedName("cachetid")
	private String cached;
	private String version;
	private String uri;
	@SerializedName("startdatum")
	private String startDate;
	@SerializedName("slutdatum")
	private String endDate;
	@SerializedName("dagar")
	public Map<String, DayBean> days = new TreeMap<String, DayBean>();

	/**
	 * Being a bean, the class needs an empty, public constructor.
	 */
	public EnvelopeBean() {
		
	}
	
	/**
	 * Returns the date when the page was cached.
	 * 
	 * @return The date as a string.
	 */
	public String getCached() {
		return cached;
	}

	/**
	 * Sets the cache date and time.
	 * 
	 * @param cached The date as a string.
	 */
	public void setCached(String cached) {
		this.cached = cached;
	}

	/**
	 * Returns the API version.
	 * 
	 * @return The API version.
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the API version.
	 * 
	 * @param version The API version.
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Returns the called URI.
	 * 
	 * @return The URI.
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Sets the called URI.
	 * 
	 * @param uri The URI.
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * Returns the start date.
	 * 
	 * @return The start date.
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 * 
	 * @param startDate The start date.
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * Returns the end date.
	 * 
	 * @return The end date.
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date.
	 * 
	 * @param endDate The end date.
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
