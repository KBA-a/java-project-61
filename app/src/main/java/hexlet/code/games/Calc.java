package hexlet.code.games;

import hexlet.code.*;
import org.apache.commons.lang3.RandomUtils;

public class Calc {
    public static void calc() {

        String[] questions = new String[Engine.countOfRounds];
        String[] rightAnswers = new String[Engine.countOfRounds];
        final int maxOperandSumDiff = 100;
        int firstNumber;
        int secondNumber;

        for (int i = 0; i < Engine.countOfRounds; i++) {
            firstNumber = RandomUtils.nextInt(0, maxOperandSumDiff);
            secondNumber = RandomUtils.nextInt(0, maxOperandSumDiff);
            switch (RandomUtils.nextInt(0, Engine.countOfRounds)) {
                case 0:
                    questions[i] = buildQuestion(" + ", firstNumber, secondNumber);
                    rightAnswers[i] = buildRightAnswer(" + ", firstNumber, secondNumber);
                    break;
                case 1:
                    questions[i] = buildQuestion(" - ", firstNumber, secondNumber);
                    rightAnswers[i] = buildRightAnswer(" - ", firstNumber, secondNumber);
                    break;
                case 2:
                    questions[i] = buildQuestion(" * ", firstNumber, secondNumber);
                    rightAnswers[i] = buildRightAnswer(" * ", firstNumber, secondNumber);
                    break;
                default:
                    break;
            }
        }
        Engine.gameLogic("What is the result of the expression?", questions, rightAnswers);
    }

    public static String buildQuestion(String operator, int firstNumber, int secondNumber) {
        return firstNumber + operator + secondNumber;
    }

    public static String buildRightAnswer(String operator, int firstNumber, int secondNumber) {
        return switch (operator) {
            case " + " -> firstNumber + secondNumber + "";
            case " - " -> firstNumber - secondNumber + "";
            case " * " -> firstNumber * secondNumber + "";
            default -> "Ops";
        };
    }
}
