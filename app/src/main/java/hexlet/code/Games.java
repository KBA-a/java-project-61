package hexlet.code;

import java.util.Scanner;
import org.apache.commons.lang3.RandomUtils;

public class Games {

    public static void even() {

        String[] questions = new String[3];
        String[] rightAnswers = new String[3];
        int randomNumber;

        for (int i = 0; i < 3; i++) {
            randomNumber = RandomUtils.nextInt(0, 100);
            questions[i] = randomNumber + "";
            if (randomNumber % 2 == 0) {
                rightAnswers[i] = "yes";
            } else {
                rightAnswers[i] = "no";
            }
        }
        Engine.gameLogic("Answer 'yes' if the number is even, otherwise answer 'no'",
                questions, rightAnswers);

    }

    public static void calc() {

        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        String[] questions = new String[3];
        String[] rightAnswers = new String[3];

        for (int i = 0; i < 3; i++) {
            switch (RandomUtils.nextInt(0, 3)) {
                case 0:
                    firstNumber = RandomUtils.nextInt(0, 100);
                    secondNumber = RandomUtils.nextInt(0, 100);
                    questions[i] = firstNumber + " + " + secondNumber;
                    rightAnswers[i] = firstNumber + secondNumber + "";
                    break;
                case 1:
                    firstNumber = RandomUtils.nextInt(0, 100);
                    secondNumber = RandomUtils.nextInt(0, 100);
                    questions[i] = firstNumber + " - " + secondNumber;
                    rightAnswers[i] = firstNumber - secondNumber + "";
                    break;
                case 2:
                    firstNumber = RandomUtils.nextInt(0, 25);
                    secondNumber = RandomUtils.nextInt(0, 25);
                    questions[i] = firstNumber + " * " + secondNumber;
                    rightAnswers[i] = firstNumber * secondNumber + "";
                    break;
                default:
                    break;
            }
        }
        Engine.gameLogic("What is the result of the expression?", questions, rightAnswers);
    }
}
