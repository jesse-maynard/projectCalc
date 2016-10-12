package _001_Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by jessemaynard on 10/11/16.
 */

public class GroceryCalculator{

    public void grocCalc(){
        //Variables
        int i;
        Double groceryCost, stateTax = .06, subTotal = 0.00, grandTotal = 0.00;
        boolean grocTime = true;
        char yesNo3;
        //Scanner
        Scanner priceInput = new Scanner(System.in);

        ArrayList<Double> grocArray = new ArrayList<>();

        try {
            System.out.println("So you're buying groceries. Time to adjust for TAXES!");

            System.out.println("Please enter the price of your item: ");
            groceryCost = priceInput.nextDouble();
            grocArray.add(groceryCost);

            while (grocTime) {
                System.out.println("Do you have more items?");
                System.out.println("y/n");
                yesNo3 = priceInput.next().charAt(0);

                if (yesNo3 == 'y') {
                    System.out.println("Please enter the price of your item: ");
                    groceryCost = priceInput.nextDouble();
                    grocArray.add(groceryCost);
                }
                if (yesNo3 == 'n') {
                    System.out.println("Well, looks like you're done.");
                    for (i = 0; i < grocArray.size(); ++i) {
                        subTotal += grocArray.get(i);
                    }
                    grandTotal = subTotal * stateTax;

                    System.out.println("Sub Total: " + Math.ceil(subTotal * 100) / 100);
                    System.out.println("Total: " + Math.ceil(grandTotal * 100) / 100);

                    System.out.println("Want to start over?");
                    System.out.println("y/n");
                    yesNo3 = priceInput.next().charAt(0);

                    if (yesNo3 == 'y') {
                        grocArray.clear();
                    }
                    if (yesNo3 == 'n') {
                        grocArray.clear();
                        grocTime = false;
                    }
                }
            }
        } catch(InputMismatchException im){System.out.println("And that sir and or madam, is not a number. Do it again.");}

    }
}

