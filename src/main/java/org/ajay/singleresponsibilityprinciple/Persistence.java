package org.ajay.singleresponsibilityprinciple;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class Persistence {
    public void saveToFile(Journal journal,
                           String filename,
                           boolean overwrite) {
        if (overwrite || new File(filename).exists()) {
            try {
                PrintStream printStream = new PrintStream(filename);
                printStream.println(journal.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}