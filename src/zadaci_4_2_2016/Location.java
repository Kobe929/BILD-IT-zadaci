package zadaci_4_2_2016;

public class Location {

	
	public double maxValue;
	public int column;
	public int row;

	//Konstruktor
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	//Metoda za lociranje
	public static Location locateLargest(double[][] a) {

		int row = 0;
		int column = 0;
		double maxValue = a[row][column];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (maxValue < a[i][j]) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		return new Location(row, column, maxValue);
	}
}