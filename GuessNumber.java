package Task1;

import java.util.Scanner;

public class GuessNumber {

   
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
     

        int randomNumber =(int)(Math.random()*100)+1;
        int maxAttempts = 5;
        int attempts = 0;
        boolean notGuessCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

       
        while (attempts < maxAttempts && !notGuessCorrectly) {
            System.out.print("Enter your guess: ");
            int Guess = sc.nextInt();
            attempts++;

            if (Guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                notGuessCorrectly = true;
            } else if (Guess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

      
        if (!notGuessCorrectly) {
            System.out.println("Sorry, attempts are over. The correct number was: " + randomNumber);
        }

        System.out.println("Game Over. Thanks for playing!");
        sc.close();
    }
}



