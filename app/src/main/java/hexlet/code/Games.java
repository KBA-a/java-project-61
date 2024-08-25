package hexlet.code;

import java.util.Scanner;
import org.apache.commons.lang3.RandomUtils;

public class Games {

    public static void even() {

        Scanner input = new Scanner(System.in);
        byte counterRightAnswer = 0;
        String answer;

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        do {
            int randomNumber = RandomUtils.nextInt(1, 100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            answer = input.nextLine();
            if ((randomNumber % 2 == 0 && answer.equalsIgnoreCase("yes"))
                    || (randomNumber % 2 != 0 && answer.equalsIgnoreCase("no"))) {
                counterRightAnswer++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!\nEnd game!");
                return;
            }
        } while (counterRightAnswer < 3);
        System.out.println("Congratulations, " + userName + ", you win!!!");
    }
}
