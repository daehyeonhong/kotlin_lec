package lec07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaFilePrinter {
    public void readFile(final String path) throws IOException {
        try (final BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println(reader.readLine());
        }
    }
}
