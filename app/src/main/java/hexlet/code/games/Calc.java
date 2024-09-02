package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {
    public static void calc() {

        int firstNumber;
        int secondNumber;
        byte countOfRounds = 3;
        String[] questions = new String[countOfRounds];
        String[] rightAnswers = new String[countOfRounds];
        int maxOperandSumDiff = 100;
        int maxOperandMult = 25;

        for (int i = 0; i < countOfRounds; i++) {
            switch (RandomUtils.nextInt(0, countOfRounds)) {
                case 0:
                    firstNumber = RandomUtils.nextInt(0, maxOperandSumDiff);
                    secondNumber = RandomUtils.nextInt(0, maxOperandSumDiff);
                    questions[i] = firstNumber + " + " + secondNumber;
                    rightAnswers[i] = firstNumber + secondNumber + "";
                    break;
                case 1:
                    firstNumber = RandomUtils.nextInt(0, maxOperandSumDiff);
                    secondNumber = RandomUtils.nextInt(0, maxOperandSumDiff);
                    questions[i] = firstNumber + " - " + secondNumber;
                    rightAnswers[i] = firstNumber - secondNumber + "";
                    break;
                case 2:
                    firstNumber = RandomUtils.nextInt(0, maxOperandMult);
                    secondNumber = RandomUtils.nextInt(0, maxOperandMult);
                    questions[i] = firstNumber + " * " + secondNumber;
                    rightAnswers[i] = firstNumber * secondNumber + "";
                    break;
                default:
                    break;
            }
        }
        Engine.gameLogic("What is the result of the expression?", questions, rightAnswers);
    }
}
