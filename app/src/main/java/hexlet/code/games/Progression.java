package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {
    public static void progression() {

        final byte countOfRounds = 3;
        String[] rightAnswers = new String[countOfRounds];
        String[] questions = new String[countOfRounds];
        final int maxLengthProgression = 15;
        final int minLengthProgression = 8;
        final int maxStepProgression = 10;
        final int minStepProgression = 1;
        final int minFirstElementProgression = 0;
        final int maxFirstElementProgression = 47;


        for (int i = 0; i < countOfRounds; i++) {
            int lengthProgression = RandomUtils.nextInt(minLengthProgression, maxLengthProgression);
            int stepProgression = RandomUtils.nextInt(minStepProgression, maxStepProgression);
            int skippedElement = RandomUtils.nextInt(0, lengthProgression - 1);
            int elementProgression = RandomUtils.nextInt(minFirstElementProgression, maxFirstElementProgression);

            rightAnswers[i] = String.valueOf(elementProgression + skippedElement * stepProgression);
            questions[i] = progressionBuilder(lengthProgression, skippedElement,
                    elementProgression, stepProgression);
        }

        Engine.gameLogic("What number is missing in the progression?", questions, rightAnswers);
    }

    public static String progressionBuilder(int lengthProgression, int skippedElement,
                                            int elementProgression, int stepProgression) {
        String questions = "";
        for (int j = 0; j < lengthProgression - 1; j++) {
            if (skippedElement == j) {
                questions = questions + ".." + " ";
            } else {
                questions = questions + elementProgression + " ";
            }
            elementProgression += stepProgression;
        }
        return questions;
    }
}
