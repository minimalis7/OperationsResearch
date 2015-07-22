/**
 *  Loesungsklasse fuer die ungarische Methode (Kuhn-Kumkres-Algorithmus).
 *  OR Blatt 10, Aufgabe 1, Sommersemester 2013
 *  Daniel Grewe
 */
public class Loesung {
	
	public void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void run() {
		
		double[][] a1 = 	{{17.0, 8.0, 12.0, 9.0, 14.0, 6.0},
						 	{15.0, 13.0, 18.0, 15.0, 10.0, 4.0},
						 	{14.0, 13.0, 18.0, 15.0, 10.0, 4.0},
						 	{7.0, 16.0, 11.0, 14.0, 6.0, 10.0},
						 	{18.0, 9.0, 13.0, 5.0, 15.0, 7.0}};
		
		double[][] a2 = 	{{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0},
							{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0},
							{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0},
							{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0},
							{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0}};
		
		double[][] a3 = 	{{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0},
				 			{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0},
				 			{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0},
				 			{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0},
				 			{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0}};
		
		
		
	}
	public static void main(String[] args) {
		Loesung km = new Loesung();
		km.run();
	}
}
