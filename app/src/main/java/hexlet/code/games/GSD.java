package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class GSD {
    public static void gsd() {

        String[] questions = new String[Engine.countOfRounds];
        String[] rightAnswers = new String[Engine.countOfRounds];
        final int maxNumber = 100;

        for (int i = 0; i < Engine.countOfRounds; i++) {

            int firstNumber = RandomUtils.nextInt(0, maxNumber);
            int secondNumber = RandomUtils.nextInt(0, maxNumber);

            questions[i] = firstNumber + " " + secondNumber;
            rightAnswers[i] = searchingGSD(firstNumber, secondNumber);
        }
        Engine.gameLogic("Find the greatest common divisor of given numbers.", questions, rightAnswers);
    }

    public static String searchingGSD(int firstNumber, int secondNumber) {
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }
        return Math.max(firstNumber, secondNumber) + "";
    }
}
