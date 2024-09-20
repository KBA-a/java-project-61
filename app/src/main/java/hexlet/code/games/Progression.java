package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;

public class Progression {
    public static void progression() {

        String[] rightAnswers = new String[Engine.COUNT_OF_ROUNDS];
        String[] questions = new String[Engine.COUNT_OF_ROUNDS];
        final int maxLengthProgression = 15;
        final int minLengthProgression = 8;
        final int maxStepProgression = 10;
        final int minStepProgression = 1;
        final int minFirstElementProgression = 0;
        final int maxFirstElementProgression = 47;
        final String requirement = "What number is missing in the progression?";


        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int lengthProgression = RandomUtils.nextInt(minLengthProgression, maxLengthProgression);
            int stepProgression = RandomUtils.nextInt(minStepProgression, maxStepProgression);
            int skippedElement = RandomUtils.nextInt(1, lengthProgression);
            int elementProgression = RandomUtils.nextInt(minFirstElementProgression, maxFirstElementProgression);
            String[] progression = progressionBuilder(lengthProgression, elementProgression, stepProgression);

            rightAnswers[i] = progression[skippedElement - 1];
            progression[skippedElement - 1] = "..";
            questions[i] = Arrays.toString(progression);
            questions[i] = questions[i].replace(",", "");
            questions[i] = questions[i].replace("[", "");
            questions[i] = questions[i].replace("]", "");
        }

        Engine.gameLogic(requirement, questions, rightAnswers);
    }

    public static String[] progressionBuilder(int lengthProgression, int elementProgression, int stepProgression) {
        String[] questions = new String[lengthProgression];
        for (int j = 0; j < lengthProgression; j++) {
            elementProgression = elementProgression + stepProgression;
            questions[j] = elementProgression + "";
        }
        return questions;
    }
}
