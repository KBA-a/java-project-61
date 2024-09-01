package hexlet.code.Games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static void game()  {

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
