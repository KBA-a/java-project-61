package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void gameLogic(String requirement, String[] questions, String[] rightAnswers) {

        byte counterRightAnswer = 0;
        Scanner input = new Scanner(System.in);
        String usersAnswer;
        byte countOfRounds = 3;

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(requirement);
        do {
            System.out.print("Question: " + questions[counterRightAnswer] + "\nYour answer: ");
            usersAnswer = input.nextLine();
            if (usersAnswer.equalsIgnoreCase(rightAnswers[counterRightAnswer])) {
                System.out.println("Correct!");
                counterRightAnswer++;
            } else {
                System.out.println("'" + usersAnswer + "' " + "is wrong answer ;(. Correct answer was "
                        + "'" + rightAnswers[counterRightAnswer] + "' " + "\nLet's try again, " + userName + "!");
                return;
            }
        } while (counterRightAnswer < countOfRounds);
        System.out.println("Congratulations, " + userName + "!");
    }

}
