package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final byte countOfRounds = 3;

    public static void gameLogic(String requirement, String[] questions, String[] rightAnswers) {

        Scanner input = new Scanner(System.in);
        String usersAnswer;

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(requirement);
        for (int i = 0; i < countOfRounds; i++) {
            System.out.print("Question: " + questions[i] + "\nYour answer: ");
            usersAnswer = input.nextLine();
            if (usersAnswer.equalsIgnoreCase(rightAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usersAnswer + "' " + "is wrong answer ;(. Correct answer was "
                        + "'" + rightAnswers[i] + "' " + "\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

}
