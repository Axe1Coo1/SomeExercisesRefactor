package homework.moduleFour.taskTwo;

//Прочитайте файл, содержащий код на языке Java. Определите, какие ключевые слова
//языка Java это код содержит. Выведите эти слова и их количество в другой файл. Используйте
//только символьные потоки ввода-вывода.


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        try (FileReader in = new FileReader("fileInput.txt");
             FileWriter out = new FileWriter("fileOutput.txt")) {

            String str = read(in);

            String[] splitStr = str.split(" ");

            List<String> specialWords = new ArrayList(Arrays.asList(("byte short int long char float" +
                    " double boolean if else switch case default while do break continue for try catch finally" +
                    " throw throws private protected public import package class interface extends implements" +
                    " static final void abstract native new return this super synchronized volatile const goto" +
                    " instanceof enum assert transient").split(" ")));


            Map<String, Integer> res = alg(splitStr, specialWords);

            write(out, res);
        }
    }

    private static void write(FileWriter out, Map<String, Integer> res) throws IOException {
        out.write(String.valueOf(res));
        out.flush();
    }

    private static String read(FileReader in) throws IOException {
        String str = "";
        int c;
        while ((c = in.read()) != -1) {
            str += (char) c;
        }
        return str;
    }

    protected static Map<String, Integer> alg(String[] splitStr, List<String> specialWords) {
        Map<String, Integer> res = new HashMap();
        for (int i = 0; i < splitStr.length; i++) {
            String acc = splitStr[i];
            if (specialWords.contains(acc)) {
                if (res.containsKey(splitStr[i])) {
                    res.put(acc, res.get(acc) + 1);
                } else {
                    res.put(acc, 1);
                }
            }

        }
        return res;
    }
}
