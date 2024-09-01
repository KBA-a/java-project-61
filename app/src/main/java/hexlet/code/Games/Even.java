package hexlet.code.Games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {

    public static void game() {
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
}
