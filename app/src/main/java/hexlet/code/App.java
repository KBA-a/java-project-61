package hexlet.code;


import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GSD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

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
        String choiceOfGame = input.nextLine();
        switch (choiceOfGame) {
            case "1": {
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String userName = input.nextLine();
                System.out.println("Hello, " + userName + "!");
            }
                break;
            case "2":
                Even.even();
                break;
            case "3":
                Calc.calc();
                break;
            case "4":
                GSD.gsd();
                break;
            case "5":
                Progression.progression();
                break;
            case "6":
                Prime.prime();
                break;
            case "0":
                break;
            default:
                System.out.println("You entered something wrong. Try again!");
        }
    }
}
