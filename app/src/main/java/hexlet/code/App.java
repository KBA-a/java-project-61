package hexlet.code;


import java.util.Scanner;

class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n0 - Exit");
        int choiceOfGame = input.nextInt();
        switch(choiceOfGame) {
            case 1: {
                Cli.userGreeting();
            }
            case 0:
                break;
            }
    }

}
