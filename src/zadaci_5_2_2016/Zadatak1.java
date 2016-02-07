package zadaci_5_2_2016;

/*@author Filip Dautovic
 * Write a test
 program that creates two Fan objects. Assign maximum speed, radius 10, color
 yellow, and turn it on to the first object. Assign medium speed, radius 5, color
 blue, and turn it off to the second object. Display the objects by invoking their
 toString method.
 */

public class Zadatak1 {

	public static void main(String[] args) {
		
		//Kreiranje prvog objekta sa osobinama:
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);

		//Kreiranje drugog objekta sa osobinama:
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);

		//Stampanje osobina
		System.out.println("Fan #1: " + fan1.toString());
		System.out.println("Fan #2: " + fan2.toString());
	}
}