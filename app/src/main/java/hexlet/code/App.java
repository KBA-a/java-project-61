package hexlet.code;


import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
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
            case "1" -> Cli.userGreeting();
            case "2" -> Even.even();
            case "3" -> Calc.calc();
            case "4" -> GCD.gcd();
            case "5" -> Progression.progression();
            case "6" -> Prime.prime();
            case "0" -> {
            }
            default -> System.out.println("You entered something wrong. Try again!");
        }
    }
}
