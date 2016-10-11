package _001_Calculator;

/**
 * Created by jessemaynard on 10/10/16.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator{

    static  String fileName = "commandLog.txt";
    static ArrayList<Integer> numsArray = new ArrayList<>();
    static ArrayList<Double> tipsArray = new ArrayList<>();
    static ArrayList<String> commandsArray = new ArrayList<>();
    static ArrayList<Double> grocArray = new ArrayList<>();

    public static void main(String[] args) {


        char yesNo, oper;
        boolean calc = true;
        int menuOption, i;




        Scanner menu = new Scanner(System.in);

        while(calc) {
            System.out.println("Welcome to the menu. Please select an option: ");
            System.out.println("1. Calculator");
            System.out.println("2. Tip Calculator");
            System.out.println("3. Grocery Calculator");
            System.out.println("4. Help!");
            System.out.println("5. Command Log");
            System.out.println("6. Clear Command Log");
            System.out.println("7. Quit!");

            menuOption = menu.nextInt();
            commandsArray.add(String.valueOf(menuOption));

            if (menuOption == 1) {
                System.out.println("Welcome to the Calculator of DOOM!");
                Scanner operInput = new Scanner(System.in);


                System.out.println("Please select the type of Operation you would like to perform: ");
                System.out.print("+ ");
                System.out.print("- ");
                System.out.print("* ");
                System.out.println("/");

                oper = operInput.next().charAt(0);
                commandsArray.add(String.valueOf(oper));
                System.out.println("You have selected " + oper + "." + "\n"
                        + "Is that correct?");

                System.out.println("y / n");
                yesNo = operInput.next().charAt(0);

                if (yesNo == 'y' && oper == '+')
                    new Addition();
                if (yesNo == 'y' && oper == '-')
                    new Subtraction();
                if (yesNo == 'y' && oper == '*')
                    new Multiplication();
                if (yesNo == 'y' && oper == '/')
                    new Division();
                if (yesNo == 'n')
                    System.out.print("Oopsy Daisy");

            }
            if (menuOption == 2) {
                new TipCalculator();
            }
            if (menuOption == 3) {
            }
            if (menuOption == 4) {
                new Help();
            }
            if (menuOption == 5) {
                new CommandLog();
            }
            if (menuOption == 6) {
                commandsArray.clear();
                new ClearCommandLine();
            }
            if (menuOption == 7) {
                System.exit(0);
            }
        }

    }

}
