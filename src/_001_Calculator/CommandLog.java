package _001_Calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jessemaynard on 10/11/16.
 */
public class CommandLog extends Calculator {
    int i;

    CommandLog() {
        try {
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));

            System.out.println(commandsArray);

            for (i = 0; i < commandsArray.size(); ++i) {
                outFile.println(commandsArray.get(i));
            }
            outFile.close();
        } catch (IOException i){

        }
    }
}
