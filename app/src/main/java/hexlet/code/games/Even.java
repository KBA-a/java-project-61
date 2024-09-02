package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void even() {

        byte countOfRounds = 3;
        String[] questions = new String[countOfRounds];
        String[] rightAnswers = new String[countOfRounds];
        int maxNumber = 100;
        int randomNumber;

        for (int i = 0; i < countOfRounds; i++) {
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
