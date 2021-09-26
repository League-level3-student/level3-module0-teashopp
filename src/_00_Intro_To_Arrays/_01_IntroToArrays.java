package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		String s5[] = new String[5];

		s5[0] = "Mike";
		s5[1] = "Marv";
		s5[2] = "Melvin";
		s5[3] = "Mert";
		s5[4] = "Mark";

		// 2. print the third element in the array
		System.out.println(s5[2]);

		// 3. set the third element to a different value
		// ok

		// 4. print the third element again
		// ok

		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		for (int i = 0; i < s5.length; i++) {
			String s5v2 = s5[i];

			// 6. use a for loop to print all the values in the array
			// BE SURE TO USE THE ARRAY'S length VARIABLE
			System.out.println("Name at " + i + " is " + s5[i]);
		}
		
		System.out.println("\n");

		// 7. make an array of 50 integers
		int[] i50 = new int[50];

		// 8. use a for loop to make every value of the integer array a random
		// number
		for (int i = 0; i < i50.length; i++) {
			Random rand = new Random();
			int randnum = rand.nextInt(50 - 1) + 1;
			i50[i] = randnum;
		}

		// 9. without printing the entire array, print only the smallest number
		// on the array
		int smallest = i50[0];
		for (int i = 0; i < i50.length; i++) {
			if(i50[i] < smallest) {
				smallest = i50[i];
			}
		}
			System.out.println("Smallest Value: " + smallest);
			System.out.println("\n");
		
		// 10 print the entire array to see if step 8 was correct
			for (int i = 0; i < i50.length; i++) {
				System.out.println(i50[i]);
			}
			
			System.out.println("\n");

		// 11. print the largest number in the array.
			int largest = i50[0];
			for (int i = 0; i < i50.length; i++) {
				if(i50[i] > largest) {
					largest = i50[i];
				}
			}
			System.out.println("Largest Value: " + largest);
			System.out.println("\n");
			
		// 12. print only the last element in the array
			System.out.println("Final Value: " + i50[49]);
	}
}
