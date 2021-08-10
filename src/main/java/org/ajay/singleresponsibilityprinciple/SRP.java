package org.ajay.singleresponsibilityprinciple;
import java.io.IOException;

public class SRP {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        String filename = "D:\\Java Projects\\Java Design Patterns\\journal.txt";
        persistence.saveToFile(journal, filename, true);

        try {
            Runtime.getRuntime().exec("notepad.exe " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
