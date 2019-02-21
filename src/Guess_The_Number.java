import java.util.Random;
import java.util.Scanner;
public class Guess_The_Number {
    public static void main(String args[]){
        boolean run = true;
        boolean game_run = true;
        Scanner input = new Scanner(System.in);

        while (run){
            int times = 0;
            int guess = 0;


            System.out.println("Max number?");
            int max = input.nextInt();
            System.out.println("Min number?");
            int min = input.nextInt();
            Random r = new Random();
            int number = r.nextInt(max-min) - min;

            game_run = true;
            do{
                System.out.println("What number do you guess it is?");
                guess = input.nextInt();

                if(guess < number - 1){
                    System.out.println("Your guess is below the right number");
                    System.out.println();
                }else if(guess > number - 1){
                    System.out.println("Your guess is above the right number");
                    System.out.println();
                }else if(guess == number - 1){
                    System.out.println("You are right");
                    game_run = false;
                    break;
                }
            }while(game_run);
            System.out.println();
            System.out.println("You did it in " + times + " tries");
            System.out.println();
            System.out.println("1 - Again");
            System.out.println("2 - Quit");
            guess = input.nextInt();
            if(guess == 2){
                break;
            }
        }
    }
}
