package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class GSD {
    public static void gsd() {

        String[] questions = new String[Engine.COUNT_OF_ROUNDS];
        String[] rightAnswers = new String[Engine.COUNT_OF_ROUNDS];
        final int maxNumber = 100;

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            int firstNumber = RandomUtils.nextInt(0, maxNumber);
            int secondNumber = RandomUtils.nextInt(0, maxNumber);

            questions[i] = firstNumber + " " + secondNumber;
            rightAnswers[i] = searchingGSD(firstNumber, secondNumber) + "";
        }
        Engine.gameLogic("Find the greatest common divisor of given numbers.", questions, rightAnswers);
    }

    public static int searchingGSD(int firstNumber, int secondNumber) {
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }
        return Math.max(firstNumber, secondNumber);
    }
}
