
/*Lab 5: Create an application that simulates dice rolling.
 * Ask the user to enter the number of sides for a pair of dice. 
 * Prompt the user to roll the dice 
 * "Roll two n-sided dice, display the results of each, and then ask the user 
 * if he/she wants to roll the dice again.
 * @author DanielChristiansen 
 */
import java.util.Scanner;
import java.util.Random;  

public class DiceRoller {

	public static void main(String[] args) {

		System.out.println("Welcome to the Grand Circus Casino Dice Roller!");
		System.out.println();

		Scanner scan = new Scanner(System.in);

		String answer = "y";
		while (answer.equalsIgnoreCase("y")) {

			// prompt user to enter number of sides
			System.out.print("How many sides does your die have?: ");
			int sides = scan.nextInt();
			System.out.println();

			System.out.print("Ready to roll? (y/n)");
			answer = scan.next();
			System.out.println();

			if (sides <= 0) { // doesn't allow user to enter 0 or a negative int
				System.out.println("Please enter a valid number. ");
				System.out.println();
			} else {
				int die1 = dieRoll(sides);
				int die2 = dieRoll(sides);

				System.out.print("ROLL RESULT:" + "\n============" + "\n Die 1 = " + die1 + "\n Die 2 = " + die2);
				System.out.println();
				System.out.println();

				System.out.print("Roll Again? (y/n): "); //prompt user if they want to go again
				answer = scan.next();
				System.out.println();
			}

		}
		
		System.out.println("Goodbye!");
		scan.close();
	}

	public static int dieRoll(int die) {
		Random num = new Random();  //random number generator
		int result = num.nextInt(die) + 1; // prevents a return of 0 with +1
		return result;
	}
}