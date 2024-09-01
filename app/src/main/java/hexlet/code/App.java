package hexlet.code;


import java.util.Scanner;
import hexlet.code.Games.Even;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Gsd;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;

class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.\

                1 - Greet
                2 - Even
                3 - Calc
                4 - GSD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        int choiceOfGame = input.nextInt();
        switch (choiceOfGame) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String userName = input.nextLine();
                System.out.println("Hello, " + userName + "!");
                break;
            case 2:
                Even.game();
                break;
            case 3:
                Calc.game();
                break;
            case 4:
                Gsd.game();
                break;
            case 5:
                Progression.game();
                break;
            case 6:
                Prime.game();
                break;
            case 0:
                break;
            default:
                System.out.println("You entered something wrong. Try again!");
        }
    }
}
