/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!

		int coordn[] = new int[2];
		int coords[] = new int[2];
		int coorde[] = new int[2];
		int coordw[] = new int[2];

		int wwcn = 0;
		int wwcs = 0;
		int wwce = 0;
		int wwcw = 0;

		// check pos
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {

				// check for w
				if (field[i][j] == 'c') {

					// check to the right
					if ((j + 2) < field[i].length) {
						System.out.println(field[i][j + 1] + ", " + field[i][j + 2]);
						// check letter after w
						if (field[i][j + 1] == 'o' && field[i][j + 2] == 'w') {
						} else {
							System.err.println(j + ", " + i);
							coorde[0] = j;
							coorde[1] = i;
							wwce = wwce + 1;
						}
					} else {
						System.err.println(j + ", " + i);
						coordw[0] = j;
						coordw[1] = i;
						wwcw = wwcw + 1;
					}

					// check down
					if ((i + 2) < field[i].length) {
						System.out.println(field[i + 1][j] + ", " + field[i + 2][j]);
						// check letter after w
						if (field[i + 1][j] == 'o' && field[i + 2][j] == 'w') {
						} else {
							System.err.println(j + ", " + i);
							coordn[0] = j;
							coordn[1] = i;
							wwcn = wwcn + 1;
						}
					} else {
						System.err.println(j + ", " + i);
						coords[0] = j;
						coords[1] = i;
						wwcs = wwcs + 1;
					}
				}

			}
		}
		if (wwce == 1) {
			return coorde;
		}
		
		else if (wwcw == 1) {
			return coordw;
		}

		else if (wwcn == 1) {
			return coordn;
		}
		
		else {
			return coords;
		}
	}
}
