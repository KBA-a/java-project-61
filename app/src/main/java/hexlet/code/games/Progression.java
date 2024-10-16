package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {
    public static void run() {

        String[][] questionsAndRightAnswer = new String[Engine.COUNT_OF_ROUNDS][2];
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
            String[] progression = getProgression(lengthProgression, elementProgression, stepProgression);

            questionsAndRightAnswer[i][1] = progression[skippedElement - 1];
            progression[skippedElement - 1] = "..";
            questionsAndRightAnswer[i][0] = String.join(" ", progression);
        }

        Engine.run(requirement, questionsAndRightAnswer);
    }

    private static String[] getProgression(int lengthProgression, int elementProgression, int stepProgression) {
        String[] questions = new String[lengthProgression];
        for (int j = 0; j < lengthProgression; j++) {
            questions[j] = String.valueOf(elementProgression + stepProgression * j);
        }
        return questions;
    }
}
