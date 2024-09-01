package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {
    public static void progression() {


        String[] rightAnswers = new String[3];
        String[] questions = new String[3];

        for (int i = 0; i < 3; i++) {
            int lengthProgression = RandomUtils.nextInt(8, 15);
            int stepProgression = RandomUtils.nextInt(1, 10);
            int missingElement = RandomUtils.nextInt(0, lengthProgression - 1);
            int elementProgression = RandomUtils.nextInt(0, 47);

            if (missingElement == 0) {
                questions[i] = "..";
                rightAnswers[i] = elementProgression + "";
            }   else {
                questions[i] = elementProgression + "";
            }
            for (int j = 1; j < lengthProgression; j++) {
                elementProgression += stepProgression;
                if (missingElement == j) {
                    rightAnswers[i] = elementProgression + "";
                    questions[i] = questions[i] + " ..";
                } else {
                    questions[i] = questions[i] + " " + elementProgression;
                }
            }

        }
        Engine.gameLogic("What number is missing in the progression?", questions, rightAnswers);
    }
}
