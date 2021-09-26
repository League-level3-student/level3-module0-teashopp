package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] rob5 = new Robot[5];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < rob5.length; i++) {
			rob5[i] = new Robot();

			// 4. make each robot start at the bottom of the screen, side by side, facing up
			rob5[i].setX(75);
			rob5[i].setY(530);
			rob5[i].setSpeed(10);
		}
		
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		// 7. declare that robot the winner and throw it a party!
		// 8. try different races with different amounts of robots.
		// 9. make the robots race around a circular track.
		int distance;
		boolean done = true;

		while (done) {
			for (int i = 0; i < rob5.length; i++) {

				// move
				Random rand = new Random();
				distance = rand.nextInt(50 - 30) + 0;
				rob5[i].move(distance);

				// turn
				if (rob5[i].getX() <= 75 && rob5[i].getY() <= 50 || rob5[i].getX() >= 1000 && rob5[i].getY() <= 50 || rob5[i].getX() >= 850 && rob5[i].getY() <= 550) {
					rob5[i].turn(90);
					rob5[i].move(50);
				}

				// winner
				if (rob5[i].getX() <= 20 && rob5[i].getY() >= 530) {
					done = false;
					int winner = i + 1;
					System.out.println("Robot " + winner + " is the winner!");
					break;
				}
			}
		}
	}
}
