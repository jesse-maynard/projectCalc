package _001_Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by jessemaynard on 10/10/16.
 */
public class TipCalculator {

    public void tipCalc(){

        //Variables
        int i;
        double num, sum = 0.00, tipOption, tip, grandTotal;
        char yesNo2;
        boolean tipCalc = true;

        ArrayList<Double> tipsArray = new ArrayList<>();

        //Scanner
        Scanner numInput = new Scanner(System.in);

        try {
            while (tipCalc) {
                boolean moreNums = true;

                System.out.println("Cool, time to determine your tip!.");
                System.out.println("Alrighty, whats your bill total?: ");
                num = numInput.nextDouble();
                tipsArray.add(num);

                while (moreNums) {
                    System.out.println("Got any friends or family?");
                    System.out.println("y / n");
                    yesNo2 = numInput.next().charAt(0);

                    if (yesNo2 == 'y') {
                        System.out.println("Awesome! Add them too!: ");
                        num = numInput.nextDouble();
                        tipsArray.add(num);
                    } else if (yesNo2 == 'n') {
                        moreNums = false;
                        System.out.println("How much is your tip?");
                        System.out.println("1: 5% - What's your deal?");
                        System.out.println("2: 10% - Well, that a 'little' better");
                        System.out.println("3: 20% - Your waiter/waitress is okay with that");
                        System.out.println("4: 30% - Aaaaaaannnnddddd, now they love you :^)");

                        tipOption = numInput.nextInt();

                        if (tipOption == 1) {
                            System.out.println("Hey, I don't judge.");
                            for (i = 0; i < tipsArray.size(); ++i) {
                                sum += tipsArray.get(i);
                            }
                            tip = sum * .05;
                            grandTotal = Math.ceil((tip + sum) * 100) / 100;

                            System.out.println("Your Subtotal is $" + Math.ceil(sum * 100) / 100);
                            System.out.println("Your tip is $" + Math.ceil(tip * 100) / 100);
                            System.out.println("And your Grand Total is $" + grandTotal);
                            System.out.println("And finally, your total per person iiiiiissssss..." + Math.ceil((grandTotal / tipsArray.size()) * 100) / 100);

                            System.out.println("Well, that's that, wanna determine another tip?");
                            System.out.println("y/n");
                            tipOption = numInput.next().charAt(0);

                            if (tipOption == 'y') {
                                tipsArray.clear();
                                sum = 0;
                            }
                            if (tipOption == 'n') {
                                tipsArray.clear();
                                sum = 0;
                                tipCalc = false;
                            }
                        }
                        if (tipOption == 2) {
                            System.out.println("I see you're a penny pincher.");
                            for (i = 0; i < tipsArray.size(); ++i) {
                                sum += tipsArray.get(i);
                            }
                            tip = sum * .1;
                            grandTotal = Math.ceil((tip + sum) * 100) / 100;

                            System.out.println("Your Subtotal is $" + Math.ceil(sum * 100) / 100);
                            System.out.println("Your tip is $" + Math.ceil(tip * 100) / 100);
                            System.out.println("And your Grand Total is $" + grandTotal);
                            System.out.println("And finally, your total per person iiiiiissssss..." + Math.ceil((grandTotal / tipsArray.size()) * 100) / 100);

                            System.out.println("Well, that's that, wanna determine another tip?");
                            System.out.println("y/n");
                            tipOption = numInput.next().charAt(0);

                            if (tipOption == 'y') {
                                tipsArray.clear();
                                sum = 0;
                            }
                            if (tipOption == 'n') {
                                tipsArray.clear();
                                sum = 0;
                                tipCalc = false;
                            }
                        }
                        if (tipOption == 3) {
                            System.out.println("Now you're on the right track!");
                            for (i = 0; i < tipsArray.size(); ++i) {
                                sum += tipsArray.get(i);
                            }
                            tip = sum * .2;
                            grandTotal = Math.ceil((tip + sum) * 100) / 100;


                            System.out.println("Your Subtotal is $" + Math.ceil(sum * 100) / 100
                            );
                            System.out.println("Your tip is $" + Math.ceil(tip * 100) / 100);
                            System.out.println("And your Grand Total is $" + grandTotal);
                            System.out.println("And finally, your total per person iiiiiissssss..." + Math.ceil((grandTotal / tipsArray.size()) * 100) / 100);

                            System.out.println("Well, that's that, wanna determine another tip?");
                            System.out.println("y/n");
                            tipOption = numInput.next().charAt(0);

                            if (tipOption == 'y') {
                                tipsArray.clear();
                                sum = 0;
                            }
                            if (tipOption == 'n') {
                                tipsArray.clear();
                                sum = 0;
                                tipCalc = false;
                            }
                        }
                        if (tipOption == 4) {
                            System.out.println("Good on ya mate :)");
                            for (i = 0; i < tipsArray.size(); ++i) {
                                sum += tipsArray.get(i);
                            }
                            tip = sum * .3;
                            grandTotal = Math.ceil((tip + sum) * 100) / 100;

                            System.out.println("Your Subtotal is $" + Math.ceil(sum * 100) / 100);
                            System.out.println("Your tip is $" + Math.ceil(tip * 100) / 100);
                            System.out.println("And your Grand Total is $" + grandTotal);
                            System.out.println("And finally, your total per person iiiiiissssss..." + Math.ceil((grandTotal / tipsArray.size()) * 100) / 100);

                            System.out.println("Well, that's that, wanna determine another tip?");
                            System.out.println("y/n");
                            tipOption = numInput.next().charAt(0);

                            if (tipOption == 'y') {
                                tipsArray.clear();
                                sum = 0;
                            }
                            if (tipOption == 'n') {
                                tipsArray.clear();
                                sum = 0;
                                tipCalc = false;
                            }
                        }
                    }
                }
            }
        } catch(InputMismatchException im){System.out.println("And that sir and or madam, is not a number. Do it again.");}

    }


}