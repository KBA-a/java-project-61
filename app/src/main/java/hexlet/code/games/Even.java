package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void run() {

        String[][] questionsAndRightAnswer = new String[Engine.COUNT_OF_ROUNDS][2];
        final int maxNumber = 100;
        int randomNumber;
        final String requirement = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            randomNumber = RandomUtils.nextInt(0, maxNumber);
            questionsAndRightAnswer[i][0] = randomNumber + "";
            questionsAndRightAnswer[i][1] = isEven(randomNumber) ? "yes" : "no";

        }
        Engine.run(requirement, questionsAndRightAnswer);

    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
