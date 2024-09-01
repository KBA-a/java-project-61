package hexlet.code;


import java.util.Scanner;

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
                Games.even();
                break;
            case 3:
                Games.calc();
                break;
            case 4:
                Games.gsd();
                break;
            case 5:
                Games.progression();
                break;
            case 6:
                Games.prime();
                break;
            case 0:
                break;
            default:
                System.out.println("You entered something wrong. Try again!");
        }
    }
}
