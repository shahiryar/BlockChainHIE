package blockchainhie.Operations;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class IO {

    public static void write(String filename, String text) {
        text += System.lineSeparator();
        try {
            Files.write(Paths.get(filename), text.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("!!>Exception in IO class Write method<!!");
            System.out.println("Exception : " + e.toString());
        }
    }

    public static List<String> read(String filename) {
        if (new File(filename).exists()) {
            try {
                return Files.readAllLines(Paths.get(filename));
            } catch (Exception e) {
                System.out.println("!!>Exception in IO class read method<!!");
                System.out.println("Exception : " + e.toString());
                return null;
            }
        } else {
            return null;
        }
    }
}
