package _001_Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by jessemaynard on 10/10/16.
 */
public class Addition extends Calculator {

    int num, sum, i;
    private char yesNo2;
    boolean addTrue =true;
    Scanner numInput = new Scanner(System.in);

    public Addition() {

        try {
            while (addTrue) {

                boolean moreNums = true;

                System.out.println("Alrighty then, let's do some addition.");
                System.out.println("Please enter your first number: ");
                num = numInput.nextInt();
                numsArray.add(num);

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
                        for (i = 0; i < numsArray.size(); ++i) {
                            sum += numsArray.get(i);
                        }

                        System.out.println(sum + " is your answer :D");
                        System.out.println("Want to do some MORE addition?");
                        System.out.println("y / n");
                        yesNo2 = numInput.next().charAt(0);
                        commandsArray.add(String.valueOf(yesNo2));

                        if (yesNo2 == 'y') {
                            numsArray.clear();
                            sum = 0;
                        } else if (yesNo2 == 'n') {
                            addTrue = false;
                            numsArray.clear();
                            sum = 0;
                        }
                    }
                }
            }
        } catch(InputMismatchException im){System.out.println("And that sir and or madam, is not a number. Do it again.");}
    }
}
