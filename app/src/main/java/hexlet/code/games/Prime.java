package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static void prime()  {

        String[] question = new String[Engine.COUNT_OF_ROUNDS];
        String[] rightAnswer = new String[Engine.COUNT_OF_ROUNDS];
        int number;
        final int maxNumber = 1000;
        final String requirement = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            number = RandomUtils.nextInt(2, maxNumber);
            question[i] = number + "";
            if (isPrime(number)) {
                rightAnswer[i] = "yes";
            } else {
                rightAnswer[i] = "no";
            }
        }
        Engine.gameLogic(requirement, question, rightAnswer);
    }

    public static boolean isPrime(int number) {
        final int startNumberSearching = 3;
        if (number < 2) {
            return false;
        }
        for (int j = startNumberSearching; j < number; j += 2) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
