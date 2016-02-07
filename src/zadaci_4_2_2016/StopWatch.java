package zadaci_4_2_2016;

public class StopWatch {

	private long startTime;
	private long endTime;

	//Konstruktor
	public StopWatch() {
		startTime = System.currentTimeMillis();
	}

	//Metoda koja biljezi pocetno vrijeme
	public void start() {
		startTime = System.currentTimeMillis();

	}

	//Metoda koja biljezi vrijeme kada je niz sortiran
	public void stop() {
		endTime = System.currentTimeMillis();

	}

	//Dobijanje vremena koje je bilo potrebno
	public long getElapsedTime() {

		return endTime - startTime;
	}

}

