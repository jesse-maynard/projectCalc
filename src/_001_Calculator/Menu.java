package _001_Calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jessemaynard on 10/11/16.
 */
public class Menu {
    // Array to store commands
    ArrayList<String> commandsArray = new ArrayList<>();
    String fileName = "commandLog.txt";
    //Access methods from other classes
    Calculator accessCalc = new Calculator();
    TipCalculator accessTipCalc = new TipCalculator();
    GroceryCalculator accessGrocCalc = new GroceryCalculator();
    Help accessHelp = new Help();

    public void  menuOptions(){

        // Variables
        boolean calc = true;
        int menuOption;



        //Scanner for menu input
        Scanner menu = new Scanner(System.in);

        while(calc) {
            System.out.println("Welcome to the menu. Please select an option: ");
            System.out.println("1. Calculator");
            System.out.println("2. Tip Calculator");
            System.out.println("3. Grocery Calculator");
            System.out.println("4. Help!");
            System.out.println("5. Command Log/Answer Log");
            System.out.println("6. Clear Command Log/Answer Log");
            System.out.println("7. Quit!");

            menuOption = menu.nextInt();
            commandsArray.add(String.valueOf(menuOption));

            //Switch to redirect user
            switch (menuOption){

                case (1): accessCalc.calc();
                    break;
                case (2): accessTipCalc.tipCalc();
                    break;
                case (3): accessGrocCalc.grocCalc();
                    break;
                case (4): accessHelp.help();
                    break;
                case (5): commandLog();
                    break;
                case (6): clearCommandLog();
                    break;
                case (7): System.exit(0);
                    break;

            }
        }


    }

    public void commandLog(){
        //Variables
        int i;

        try {
            // Writer
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            //Print the commands stored in the Array to the console and to a text file.
            System.out.println("Commands: " + commandsArray);
            System.out.println("Answers: " + accessCalc.answersArray);
            for (i = 0; i < commandsArray.size(); ++i) {
                outFile.println(commandsArray.get(i));
            }
            outFile.close();
        } catch (IOException ie){
        }
    }

    public void clearCommandLog() {
        try {
            commandsArray.clear();
            accessCalc.answersArray.clear();
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            outFile.print("");
            outFile.close();
        } catch (IOException i){

        }
    }
}

