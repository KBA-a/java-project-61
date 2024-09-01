package hexlet.code.Games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {
    public static void game() {

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
