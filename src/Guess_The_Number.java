import java.util.Scanner;
public class Guess_The_Number {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int times = 0;
            double max;
            double min;
            double guess;
            int caset;

            while (true) {
                System.out.println("Max number?");
                max = input.nextLong();
                System.out.println("Min number?");
                min = input.nextLong();
                if (max > min) {
                    break;
                } else {
                    System.out.println("Error some thing went wrong, try again");
                    System.out.println();
                }
            }
            double number = Math.random() * Math.floor(max) + min;

            do {
                System.out.println("What number do you guess it is?");
                guess = input.nextDouble();

                if (guess < number - 1) {
                    System.out.println("Your guess is below the right number");
                    System.out.println();
                } else if (guess > number - 1) {
                    System.out.println("Your guess is above the right number");
                    System.out.println();
                } else if (guess == number - 1) {
                    System.out.println("You are right");
                    times++;
                    break;
                }
                times++;
            } while (true);
            System.out.println();
            System.out.println("You did it in " + times + " tries");
            System.out.println();
            System.out.println("1 - Again");
            System.out.println("2 - Quit");
            caset = input.nextInt();
            switch (caset) {
                case 1:
                    System.out.println("Go ahead, play again\n\n");

                case 2:
                    System.out.println("Bye, bye!");
                    break;
            }
        }
    }
}


