package zadaci_5_2_2016;

/*
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:
 Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
 denote the fan speed.
 A private int data field named speed that specifies the speed of the fan (the
 default is SLOW).
 A private boolean data field named on that specifies whether the fan is on (the
 default is false).
 A private double data field named radius that specifies the radius of the fan
 (the default is 5).
 A string data field named color that specifies the color of the fan (the default
 is blue).
 The accessor and mutator methods for all four data fields.
 A no-arg constructor that creates a default fan.
 A method named toString() that returns a string description for the fan. If
 the fan is on, the method returns the fan speed, color, and radius in one combined
 string. If the fan is not on, the method returns the fan color and radius
 along with the string “fan is off” in one combined string.
 */

public class Fan {

	//Podatci iz zadatka
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	private int speed;
	private boolean on;
	private double radius;
	private String color;

	//Konstruktor sa default vrijednostima
	public Fan() {
		speed = 1;
		radius = 5;
		color = "white";
	}

	//Vraca trenutnu brzinu ventilatora
	public int getSpeed() {
		return speed;
	}

	//Postavlja brzinu
	public void setSpeed(int sSpeed) {
		speed = sSpeed;
	}

	//Vraca da li je ventilator upaljen
	public boolean isOn() {
		return on;
	}

	//Paljenje, ako je true upaljen je
	public void setOn(boolean sOn) {
		on = sOn;
	}

	//Vraca trenutni precnik ventilatora
	public double getRadius() {
		return radius;
	}

	//Postavlja precnik ventilatora
	public void setRadius(double setRadius) {
		radius = setRadius;
	}

	//Vraca boju ventialtora
	public String getColor() {
		return color;
	}

	//Postavlja boju ventilatora
	public void setColor(String setColor) {
		color = setColor;
	}

	//Metoda koja upisuje sve osobine u jedan string
	public String toString() {
		//Ako je vent upaljen, vraca brzinu, boju i radius
		if (isOn()) {
			return "Speed: " + getSpeed() + ". Color: " + getColor()
					+ ". Radius: " + getRadius();
		} else {
			//Ako je ugasen, vraca boju, radius i ispis da je ugasen 
			return "Color: " + getColor() + ". Radius: " + getRadius()
					+ ". Fan is off.";
		}
	}

}