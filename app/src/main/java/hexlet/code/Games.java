package hexlet.code;

import org.apache.commons.lang3.RandomUtils;

public class Games {

    public static void even() {

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

    public static void calc() {

        int firstNumber;
        int secondNumber;
        String[] questions = new String[3];
        String[] rightAnswers = new String[3];

        for (int i = 0; i < 3; i++) {
            switch (RandomUtils.nextInt(0, 3)) {
                case 0:
                    firstNumber = RandomUtils.nextInt(0, 100);
                    secondNumber = RandomUtils.nextInt(0, 100);
                    questions[i] = firstNumber + " + " + secondNumber;
                    rightAnswers[i] = firstNumber + secondNumber + "";
                    break;
                case 1:
                    firstNumber = RandomUtils.nextInt(0, 100);
                    secondNumber = RandomUtils.nextInt(0, 100);
                    questions[i] = firstNumber + " - " + secondNumber;
                    rightAnswers[i] = firstNumber - secondNumber + "";
                    break;
                case 2:
                    firstNumber = RandomUtils.nextInt(0, 25);
                    secondNumber = RandomUtils.nextInt(0, 25);
                    questions[i] = firstNumber + " * " + secondNumber;
                    rightAnswers[i] = firstNumber * secondNumber + "";
                    break;
                default:
                    break;
            }
        }
        Engine.gameLogic("What is the result of the expression?", questions, rightAnswers);
    }

    public static void gsd() {

        String[] questions = new String[3];
        String[] rightAnswers = new String[3];

        for (int i = 0; i < 3; i++) {

            int firstNumber = RandomUtils.nextInt(0, 100);
            int secondNumber = RandomUtils.nextInt(0, 100);

            questions[i] = firstNumber + " " + secondNumber;
            while (firstNumber != 0 && secondNumber != 0) {
                if (firstNumber > secondNumber) {
                    firstNumber = firstNumber % secondNumber;
                } else {
                    secondNumber = secondNumber % firstNumber;
                }
            }
            rightAnswers[i] = Math.max(firstNumber, secondNumber) + "";
        }
        Engine.gameLogic("Find the greatest common divisor of given numbers.", questions, rightAnswers);
    }

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

    public static void prime()  {

        String[] question = new String[3];
        String[] rightAnswer = new String[3];
        int number;

        for (int i = 0; i < 3; i++) {
            number = RandomUtils.nextInt(2, 1000);
            question[i] = number + "";
            rightAnswer[i] = "yes";
            if (number % 2 == 0 && number != 2) {
                rightAnswer[i] = "No";
            }
            for (int j = 3; j < number; j += 2) {
                if (number % j == 0) {
                    rightAnswer[i] = "no";
                    break;
                }
            }
        }
        Engine.gameLogic("Answer 'yes' if given number is prime. Otherwise answer 'no'.",
                question, rightAnswer);
    }
}
