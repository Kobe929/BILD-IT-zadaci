package zadaci_6_2_2016;

/*
 *Write
a test program that creates two Time objects (using new Time() and new
Time(555550000)) and displays their hour, minute, and second in the format
hour:minute:second. 
 */

public class Zadatak1 {

	public static void main(String[] args) {
		
		
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		System.out.println(time1.hour + ":" + time1.minute + ":" + time1.second);
		System.out.println(time2.hour + ":" + time2.minute + ":" + time2.second);
	}

}