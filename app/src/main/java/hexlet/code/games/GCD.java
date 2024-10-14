package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class GCD {
    public static void gcd() {

        String[][] questionsAndRightAnswer = new String[Engine.COUNT_OF_ROUNDS][2];
        final int maxNumber = 100;
        final String requirement = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            int firstNumber = RandomUtils.nextInt(0, maxNumber);
            int secondNumber = RandomUtils.nextInt(0, maxNumber);

            questionsAndRightAnswer[i][0] = firstNumber + " " + secondNumber;
            questionsAndRightAnswer[i][1] = searchingGSD(firstNumber, secondNumber) + "";
        }
        Engine.gameLogic(requirement, questionsAndRightAnswer);
    }

    private static int searchingGSD(int firstNumber, int secondNumber) {
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
