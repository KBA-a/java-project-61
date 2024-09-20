package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {
    public static void calc() {

        String[] questions = new String[Engine.COUNT_OF_ROUNDS];
        String[] rightAnswers = new String[Engine.COUNT_OF_ROUNDS];
        String[] operators = new String[]{" + ", " - ", " * "};
        final int maxOperand = 100;
        final int lastOperator = 3;
        final String requirement = "What is the result of the expression?";
        int firstNumber;
        int secondNumber;

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            firstNumber = RandomUtils.nextInt(0, maxOperand);
            secondNumber = RandomUtils.nextInt(0, maxOperand);
            int usedOperator = RandomUtils.nextInt(0, lastOperator);
            questions[i] = buildQuestion(operators[usedOperator], firstNumber, secondNumber);
            rightAnswers[i] = String.valueOf(calculateAnswer(operators[usedOperator], firstNumber, secondNumber));
        }
        Engine.gameLogic(requirement, questions, rightAnswers);
    }

    public static String buildQuestion(String operator, int firstNumber, int secondNumber) {
        return firstNumber + operator + secondNumber;
    }

    public static int calculateAnswer(String operator, int firstNumber, int secondNumber) {
        return switch (operator) {
            case " + " -> firstNumber + secondNumber;
            case " - " -> firstNumber - secondNumber;
            default -> firstNumber * secondNumber;
        };
    }
}
