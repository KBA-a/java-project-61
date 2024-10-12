package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {
    public static void calc() {

        String[][] questionsAndRightAnswer = new String[Engine.COUNT_OF_ROUNDS][2];
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
            questionsAndRightAnswer[i][0] = buildQuestion(operators[usedOperator], firstNumber, secondNumber);
            questionsAndRightAnswer[i][1] = String.valueOf(calculateAnswer(operators[usedOperator],
                    firstNumber, secondNumber));
        }
        Engine.gameLogic(requirement, questionsAndRightAnswer);
    }

    public static String buildQuestion(String operator, int firstNumber, int secondNumber) {
        return firstNumber + operator + secondNumber;
    }

    public static int calculateAnswer(String operator, int firstNumber, int secondNumber) {
        return switch (operator) {
            case " + " -> firstNumber + secondNumber;
            case " - " -> firstNumber - secondNumber;
            case " * " -> firstNumber * secondNumber;
            default -> throw new RuntimeException("Something went wrong!");
        };
    }
}
