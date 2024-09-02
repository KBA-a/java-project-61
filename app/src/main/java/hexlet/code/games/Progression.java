package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {
    public static void progression() {

        byte countOfRounds = 3;
        String[] rightAnswers = new String[countOfRounds];
        String[] questions = new String[countOfRounds];
        int maxLengthProgression = 15;
        int minLengthProgression = 8;git
        int maxStepProgression = 10;
        int minStepProgression = 1;
        int maxFirstElementProgression = 47;

        for (int i = 0; i < countOfRounds; i++) {
            int lengthProgression = RandomUtils.nextInt(minLengthProgression, maxLengthProgression);
            int stepProgression = RandomUtils.nextInt(minStepProgression, maxStepProgression);
            int missingElement = RandomUtils.nextInt(0, lengthProgression - 1);
            int elementProgression = RandomUtils.nextInt(0, maxFirstElementProgression);

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
