package _001_Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by jessemaynard on 10/10/16.
 */
public class Division extends Calculator {
    int num, i;
    private char yesNo2;
    boolean divTrue = true;
    Scanner numInput = new Scanner(System.in);

    public Division() {
        try {
        while (divTrue) {
            boolean moreNums = true;

            System.out.println("Alrighty then, let's do some division.");
            System.out.println("Please enter your first number: ");
            num = numInput.nextInt();
            numsArray.add(num);

            double sum = numsArray.get(0);

            System.out.println("Superb, you need at least one more number though: ");
            num = numInput.nextInt();
            numsArray.add(num);

            while (moreNums) {
                System.out.println("Excellent, do you want to add another number?");
                System.out.println("y / n");
                yesNo2 = numInput.next().charAt(0);
                commandsArray.add(String.valueOf(yesNo2));

                if (yesNo2 == 'y') {
                    System.out.println("Neat, what is the next number: ");
                    num = numInput.nextInt();
                    numsArray.add(num);
                } else if (yesNo2 == 'n') {
                    moreNums = false;

                    for (i = 1; i < numsArray.size(); ++i) {
                        sum /= numsArray.get(i);
                    }

                    System.out.println(sum + " is your answer :D");

                    System.out.println("Would you like to some more division?");
                    System.out.println("y/n");
                    yesNo2 = numInput.next().charAt(0);
                    commandsArray.add(String.valueOf(yesNo2));

                    if (yesNo2 == 'y'){
                        numsArray.clear();
                        sum = 0;
                    } else if (yesNo2 == 'n'){
                        numsArray.clear();
                        sum = 0;
                        divTrue = false;
                    }
                }
            }
        }
    } catch(InputMismatchException im){System.out.println("And that sir and or madam, is not a number. Do it again.");}
    }
}
