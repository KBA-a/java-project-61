package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void even() {

        String[] questions = new String[Engine.countOfRounds];
        String[] rightAnswers = new String[Engine.countOfRounds];
        final int maxNumber = 100;
        int randomNumber;

        for (int i = 0; i < Engine.countOfRounds; i++) {
            randomNumber = RandomUtils.nextInt(0, maxNumber);
            questions[i] = randomNumber + "";
            if (randomNumber % 2 == 0) {
                rightAnswers[i] = "yes";
            } else {
                rightAnswers[i] = "no";
            }
        }
        Engine.gameLogic("Answer 'yes' if the number is even, otherwise answer 'no'.",
                questions, rightAnswers);

    }
}
