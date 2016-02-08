package zadaci_6_2_2016;

/*
 * (The Time class) Design a class named Time. The class contains:
 The data fields hour, minute, and second that represent a time.
  A no-arg constructor that creates a Time object for the current time. (The
values of the data fields will represent the current time.)
  A constructor that constructs a Time object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds. (The values of the data
fields will represent this time.)
 A constructor that constructs a Time object with the specified hour, minute,
and second.
  Three getter methods for the data fields hour, minute, and second,
respectively.
  A method named setTime(long elapseTime) that sets a new time
for the object using the elapsed time. For example, if the elapsed time is
555550000 milliseconds, the hour is 10, the minute is 19, and the second is
10.
 */

public class Time {
	
	//Varijable za cuvanje vremena
	public long hour;
	public long minute;
	public long second;

	//Konstruktor za trenutno vrijeme
	public Time() {
		//Racunanje vremena od pocetka unix epohe
		long totalSeconds = System.currentTimeMillis() / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		//dodavanje vrijednosti 
		this.hour = totalHours % 24;
		this.minute = totalMinutes % 60;
		this.second = totalSeconds % 60;

	}

	
	//Konstruktor za porteklo vrijeme u milisekundama
	public Time(long elapseTime) {
		long totalSeconds = elapseTime / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		this.hour = totalHours % 24;
		this.minute = totalMinutes % 60;
		this.second = totalSeconds % 60;
		
	}
	
	//Konstruktor za objekt sa unesenim vremenom
	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}


	//Getteri za vrijeme
	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

}
