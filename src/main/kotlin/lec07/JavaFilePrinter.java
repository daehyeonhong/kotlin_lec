package lec07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaFilePrinter {
    public void readFile() throws IOException {
        final File currentFile = new File(".");
        final File file = new File(currentFile.getAbsolutePath() + "/a.txt");
        final BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());
        reader.close();
    }
}
