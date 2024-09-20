package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void even() {

        String[] questions = new String[Engine.COUNT_OF_ROUNDS];
        String[] rightAnswers = new String[Engine.COUNT_OF_ROUNDS];
        final int maxNumber = 100;
        int randomNumber;
        final String requirement = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            randomNumber = RandomUtils.nextInt(0, maxNumber);
            questions[i] = randomNumber + "";
            rightAnswers[i] = isEven(randomNumber) ? "yes" : "no";

        }
        Engine.gameLogic(requirement, questions, rightAnswers);

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
