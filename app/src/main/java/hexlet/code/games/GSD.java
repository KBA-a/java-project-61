package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class GSD {
    public static void gsd() {

        String[] questions = new String[3];
        String[] rightAnswers = new String[3];

        for (int i = 0; i < 3; i++) {

            int firstNumber = RandomUtils.nextInt(0, 100);
            int secondNumber = RandomUtils.nextInt(0, 100);

            questions[i] = firstNumber + " " + secondNumber;
            while (firstNumber != 0 && secondNumber != 0) {
                if (firstNumber > secondNumber) {
                    firstNumber = firstNumber % secondNumber;
                } else {
                    secondNumber = secondNumber % firstNumber;
                }
            }
            rightAnswers[i] = Math.max(firstNumber, secondNumber) + "";
        }
        Engine.gameLogic("Find the greatest common divisor of given numbers.", questions, rightAnswers);
    }
}
