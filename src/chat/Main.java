package chat;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    static void main() {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("input.txt"), StandardCharsets.ISO_8859_1));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("file.txt"), StandardCharsets.UTF_8));

            String line;
            while((line=reader.readLine())!=null) {
                writer.write(line);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
