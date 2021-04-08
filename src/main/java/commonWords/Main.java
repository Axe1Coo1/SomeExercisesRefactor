package commonWords;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void commonWords() {
        String x = new String();
        x = reader(x);
        Map<Object, Integer> words = new HashMap<>();
        List text = Arrays.asList(x.split(" "));
        sort(text, words);
        output(words);
    }

    private static String reader(String str) {
//        URL resource = Main.class.getResource("WarAndPeace.txt");
//        System.out.println(resource);
        File file = new File("C:\\java\\untitled\\untitled\\src\\main\\resources\\WarAndPeace.txt");
        String absolutePath = file.getAbsolutePath();
        try (FileReader reader = new FileReader(absolutePath)) {
            int c;
            while ((c = reader.read()) != -1) {
                str += (char) c;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return (str = str.replaceAll("[,.!?()1234567890«»]", "").toUpperCase());
    }

    private static void sort(List text, Map<Object, Integer> words) {
        for (int i = 0; i < text.size(); i++) {
            if (words.containsKey(text.get(i)) != true) {
                words.put(text.get(i), Collections.frequency(text, text.get(i)));
            }
        }
    }

    private static void output(Map<Object, Integer> words) {
        words.entrySet().stream()
                .sorted(Map.Entry.<Object, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
