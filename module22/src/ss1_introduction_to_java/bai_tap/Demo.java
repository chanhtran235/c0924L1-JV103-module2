package ss1_introduction_to_java.bai_tap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class Demo {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/ss1_introduction_to_java/bai_tap/test2.docx"));
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
