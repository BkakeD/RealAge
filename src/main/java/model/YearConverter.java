/**
 * @author Blake Dykstra - bdykstra
 * CIS175 - Spring 2024
 * Feb 8, 2024
 */
package model;

/**
 * 
 */
public class YearConverter {
	
	private int years;
	private int days;
	private int hours;
	private int minutes;
	private int seconds;
	
	public YearConverter() {
		super();
	}
	
	public YearConverter(int years) {
		super();
		this.years = years;
		setTime(years);
	}
	
	public void setYears(int years) {
		this.years = years;
		setTime(years);
	}
	
	public void setDays(int days) {
		this.days = days;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public int getYears() {
		return years;
	}
	
	public int getDays() {
		return days;
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setTime(int years) {
		final int DAYS = 365;
		final int HOURS = 24;
		final int MINUTES = 60;
		final int SECONDS = 60;
		int currTime = years;
		
		setDays(years * DAYS);
		currTime *= DAYS;
		
		setHours(currTime * HOURS);
		currTime *= HOURS;
		
		setMinutes(currTime * MINUTES);
		currTime *= MINUTES;
		
		setSeconds(currTime * SECONDS);
	}
	
	@Override
	public String toString() {
		return "You have lived for: " + years + " years, or " + days + " days, or " + hours + " hours, or " + minutes + " minutes, or " + seconds + " seconds.";
	}
}
