package zadaci_4_2_2016;

public class Zadatak3 {

	public static void main(String[] args) {

		// Kreiranje niza sa 1000000 mjesta
		int[] randomArray = new int[100000];

		// Popunjavanje niza
		System.out.println("Novi niz od 100000 clanova;");
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 100000);
		}

		// KReiranje objekta stopwatch
		StopWatch stopWatch = new StopWatch();

		System.out.println("Sortiranje . . .");
		stopWatch.start();
		selectionSort(randomArray);
		stopWatch.stop();

		/*
		 * Ispis niza, zauzima previse prostora u konzoli pa je nepregledno
		 * 
		 * for (int i = 0; i < randomArray.length; i++) {
		 * 
		 * 
		 * System.out.printf("%6d ", randomArray[i]); if ((i + 1) % 10 == 0)
		 * System.out.printf("\n");
		 * 
		 * }
		 */

		// Ispis
		System.out.println("Niz je sortiran za otprilike " +stopWatch.getElapsedTime()+ " millisekundi.");

	}
	// MEtoda za sortiranje
		public static void selectionSort(int[] m) {

			for (int i = 0; i < m.length - 1; i++) {

				int min = m[i];
				int index = i;

				for (int j = i + 1; j < m.length; j++) {

					if (min > m[j]) {
						min = m[j];
						index = j;
					}
				}

				if (index != i) {
					m[index] = m[i];
					m[i] = min;
				}
			}
		}
	}