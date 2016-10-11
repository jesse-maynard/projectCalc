package _001_Calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jessemaynard on 10/11/16.
 */
public class ClearCommandLine extends Calculator {

    int i;

    ClearCommandLine() {
        try {
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            outFile.print("");
            outFile.close();
        } catch (IOException i){

        }
    }
}
