package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final byte COUNT_OF_ROUNDS = 3;

    public static void gameLogic(String requirement, String[][] questionsAndRightAnswer) {

        Scanner input = new Scanner(System.in);
        String usersAnswer;

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(requirement);
        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {
            System.out.print("Question: " + questionsAndRightAnswer[i][0] + "\nYour answer: ");
            usersAnswer = input.nextLine();
            if (usersAnswer.equalsIgnoreCase(questionsAndRightAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usersAnswer + "' " + "is wrong answer ;(. Correct answer was "
                        + "'" + questionsAndRightAnswer[i][1] + "' " + "\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

}
