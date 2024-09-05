package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static void prime()  {

        String[] question = new String[Engine.countOfRounds];
        String[] rightAnswer = new String[Engine.countOfRounds];
        int number;
        final int maxNumber = 1000;


        for (int i = 0; i < Engine.countOfRounds; i++) {
            number = RandomUtils.nextInt(2, maxNumber);
            question[i] = number + "";
            rightAnswer[i] = checkingForPrimeNUmber(number);
        }
        Engine.gameLogic("Answer 'yes' if given number is prime. Otherwise answer 'no'.",
                question, rightAnswer);
    }

    public static String checkingForPrimeNUmber(int number) {

        final int startNUmberSearching = 3;
        String rightAnswer = "yes";

        if (number % 2 == 0 && number != 2) {
            rightAnswer = "no";
            return rightAnswer;
        }
        for (int j = startNUmberSearching; j < number; j += 2) {
            if (number % j == 0) {
                rightAnswer = "no";
                return rightAnswer;
            }
        }
        return rightAnswer;
    }
}
