import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {


        String content = new String(Files.readAllBytes(Paths.get("src/harry.txt")));
        content = content.toLowerCase(Locale.ROOT).replaceAll("[^A-Za-z ]", "");
        String[] words = content.split(" +");
        StringBuilder uniqueAsString = new StringBuilder();

        for (String word : words) {
            if (!uniqueAsString.toString().contains(word)) {
                uniqueAsString.append(word).append(" ");
            }
        }

        String[] uniqueAsArray = uniqueAsString.toString().split(" ");

        Arrays.sort(uniqueAsArray);
        for (String s : uniqueAsArray) {
            System.out.println(s);
        }

    }
}