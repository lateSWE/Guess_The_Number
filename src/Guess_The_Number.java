import java.util.Scanner;
public class Guess_The_Number {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        while (true) {                                  //most outer loop
            int times = 0;
            double max;
            double min;
            double guess;
            int case1;

            while (true) {
                System.out.println("Max number?");      //asks the user what the max number should be
                max = input.nextLong();
                System.out.println("Min number?");      //asks the user what the min number should be
                min = input.nextLong();
                if (max > min) {
                    break;
                } else {
                    System.out.println("Error some thing went wrong, try again"); //tells the user that something went wrong
                    System.out.println();
                }
            }
            double number = Math.random() * Math.floor(max) + min; //generates a double variable (a double because it can be a longer)

            do {
                System.out.println("What number do you guess it is?\n" +    //asks the user what he/she guesses
                        "If you want to quit this game press [-1]");        //gives the user an option to quit without guessing the right number
                guess = input.nextDouble();                                 //lets the user guess a number

                if ((guess < number - 1) && (guess >= 0)) {                 //looks at if the guessed number is the right one
                    System.out.println("Your guess is below the right number");
                    System.out.println();
                } else if ((guess > number - 1) && (guess >= 0)) {          //looks at if the guessed number is the right one
                    System.out.println("Your guess is above the right number");
                    System.out.println();
                } else if ((guess == number - 1) && (guess >= 0)) {         //looks at if the guessed number is the right one
                    System.out.println("You are right");
                    times++;
                    break;
                } else if (guess == -1){                                    //so people can exit without guessing the right number
                    break;
                }
                times++;
            } while (true);
            if (!(guess == -1)) {
                System.out.println();
                System.out.println("\n You did it in " + times + " tries");
            } else{
                System.out.println("\n You quited!");
            }

            System.out.println();                                   //|shows the choices to the user
            System.out.println("1 - Again");                        //|
            System.out.println("2 - Quit");                         //|

            case1 = input.nextInt();    //takes a input from
            switch (case1) {
                case 1:                                             //if the player wants to play again
                    System.out.println("Go ahead, play again \n");
                    break;

                case 2:                                             //if the user want sto quit
                    System.out.println("Bye, bye!");
                    break;

                default:                //if an error occurs
                    System.out.println("Not an action!(error)");
                    break;
            }
            if (case1 == 2) break;                                  //makes it so it breaks the most outer loop
        }
    }
}


