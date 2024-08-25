package hexlet.code;


import java.util.Scanner;

class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
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
            case 0:
                break;
        }
    }
}
