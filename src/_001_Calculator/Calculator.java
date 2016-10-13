package _001_Calculator;

/**
 * Created by jessemaynard on 10/10/16.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator{

    ArrayList<Double> numsArray = new ArrayList<>();
    ArrayList<Double> answersArray = new ArrayList<>();

    public void calc() {

        char yesNo, oper;

        Scanner menu = new Scanner(System.in);

        System.out.println("Welcome to the Calculator of DOOM!");

        System.out.println("Please select the type of Operation you would like to perform: ");
        System.out.print("+ ");
        System.out.print("- ");
        System.out.print("* ");
        System.out.println("/");

        oper = menu.next().charAt(0);
        System.out.println("You have selected " + oper + "." + "\n" + "Is that correct?");

        System.out.println("y / n");
        yesNo = menu.next().charAt(0);

        if (yesNo == 'y'){
            switch (oper){
                case ('+'): addition(numsArray);
                    break;
                case ('-'): subtraction(numsArray);
                    break;
                case ('*'): multiplication(numsArray);
                    break;
                case ('/'): division(numsArray);
                    break;
            }
        } else {
            System.out.println("Oopsy Daisy");
        }
    }

    public void addition(ArrayList<Double> numsArray){

        //Variables
        boolean addTrue = true;
        int i;
        double num, sum = 0;
        char yesNo2;

        //Scanner
        Scanner numInput = new Scanner(System.in);

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
                        answersArray.add(sum);
                        System.out.println("Want to do some MORE addition?");
                        System.out.println("y / n");
                        yesNo2 = numInput.next().charAt(0);

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

    public void subtraction(ArrayList<Double> numsArray){
        //Variables
        int i;
        double num, sum = 0;
        char yesNo2;
        boolean subTrue = true;
        //Scanner
        Scanner numInput = new Scanner(System.in);

        try {
            while (subTrue) {
                boolean moreNums = true;

                System.out.println("Alrighty then, let's do some subtraction.");
                System.out.println("Please enter your first number: ");
                num = numInput.nextInt();
                numsArray.add(num);

                System.out.println("Superb, you need at least one more number though: ");
                num = numInput.nextInt();
                numsArray.add(num * -1);

                while (moreNums) {
                    System.out.println("Excellent, do you want to add another number?");
                    System.out.println("y / n");
                    yesNo2 = numInput.next().charAt(0);

                    if (yesNo2 == 'y') {
                        System.out.println("Neat, what is the next number: ");
                        num = numInput.nextInt();
                        numsArray.add(num * -1);
                    } else if (yesNo2 == 'n') {

                        moreNums = false;

                        for (i = 0; i < numsArray.size(); ++i) {
                            sum += numsArray.get(i);
                        }

                        System.out.println(sum + " is your answer :D");
                        answersArray.add(sum);
                        System.out.println("Wanna subtract some more numbers?");
                        System.out.println("y/n");
                        yesNo2 = numInput.next().charAt(0);

                        if (yesNo2 == 'y') {
                            numsArray.clear();
                            sum = 0;
                        } else if (yesNo2 == 'n') {
                            subTrue = false;
                            numsArray.clear();
                            sum = 0;
                        }
                    }
                }
            }
        } catch(InputMismatchException im){System.out.println("And that sir and or madam, is not a number. Do it again.");}
    }

    public void multiplication(ArrayList<Double> numsArray){
        //Variables
        int i;
        double num, sum = 1;
        char yesNo2;
        boolean multTrue = true;
        //Scanner
        Scanner numInput = new Scanner(System.in);

        try {
            while (multTrue) {
                boolean moreNums = true;

                System.out.println("Alrighty then, let's do some multiplication.");
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

                    if (yesNo2 == 'y') {
                        System.out.println("Neat, what is the next number: ");
                        num = numInput.nextInt();
                        numsArray.add(num);
                    } else if (yesNo2 == 'n') {
                        moreNums = false;

                        for (i = 0; i < numsArray.size(); ++i) {
                            sum *= numsArray.get(i);
                        }

                        System.out.println(sum + " is your answer :D");
                        answersArray.add(sum);
                        System.out.println("Would you like to get another product?");
                        System.out.println("y/n");
                        yesNo2 = numInput.next().charAt(0);

                        if (yesNo2 == 'y') {
                            numsArray.clear();
                            sum = 0;
                        } else if (yesNo2 == 'n') {
                            numsArray.clear();
                            multTrue = false;
                            sum = 0;
                        }
                    }
                }
            }
        } catch(InputMismatchException im){System.out.println("And that sir and or madam, is not a number. Do it again.");}
    }

    public void division(ArrayList<Double> numsArray){
        //Variables
        int i;
        char yesNo2;
        double num;
        boolean divTrue = true;
        //Scanner
        Scanner numInput = new Scanner(System.in);

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
                        answersArray.add(sum);
                        System.out.println("Would you like to some more division?");
                        System.out.println("y/n");
                        yesNo2 = numInput.next().charAt(0);

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