package _001_Calculator;

import java.util.Scanner;

/**
 * Created by jessemaynard on 10/11/16.
 */

public class Help{

        public void help(){

            // Variables
            boolean helpMe = true;
            char helpCommand;
            // Scanner
            Scanner helpInput = new Scanner(System.in);

            while (helpMe) {
                System.out.println("Calculator allows you to perform simple arithmetic operations.");
                System.out.println("Tip Calculator allows you to determine the value of the tip you want to leave your server.");
                System.out.println("Grocery Calculator allows you to determine the amount of those pesky state taxes while you're at the store. Well, if you're in Kentucky that is.");
                System.out.println("Command Log allows you to view the commands that you have entered.");
                System.out.println("Return to the menu?");
                System.out.println("y/n");

                helpCommand = helpInput.next().charAt(0);

                if (helpCommand == 'y'){
                    helpMe =false;
                } else if (helpCommand == 'n'){
                    System.out.println("Take your time.");
                }

            }
        }


        }
