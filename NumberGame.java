import java.util.Scanner;

public class NumberGame{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Generate a random number between 1 to 100
         
        int num = (int)(Math.random()*100)+1;

        //Guesses allowed
        int numOfGuess = 4;

        System.out.println("Welcome to the Number Guessing Game!");

        while(numOfGuess >0){
                    System.out.printf("Guess a number between 1 and 100 (you have %d guesses remaining):", numOfGuess);
                    int guess = scanner.nextInt();

                    if(guess == num){
                        System.out.println("You've correctly quessed the number!");
                        break;
                    }
                    else if(guess < num){
                        System.out.println("Your guess is too low");
                    }
                    else{
                        System.out.println("Your guess is too high");
                    }

                    numOfGuess--;
        }
    
    if(numOfGuess == 0){
        System.out.println("You are out of guesses. the number was: " + num);     
    }
    scanner.close();
}
}