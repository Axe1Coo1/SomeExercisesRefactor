package homework.moduleFour.taskOne;


// Прочитайте файл, содержащий код на языке Java. Определите, какие ключевые слова
//языка Java это код содержит. Выведите эти слова и их количество в другой файл.

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void taskOne() throws IOException {
        HashMap<String, Integer> keyWords = new HashMap();
        String[] s = ("byte short int long char float double boolean if else switch case default while do break" +
                " continue for try catch finally throw throws private protected public import package class " +
                "interface extends implements static final void abstract native new return this super synchronized " +
                "volatile const goto instanceof enum assert transient").split(" ");
        for (String i : s) {
            keyWords.put(i, 0);
        }

        System.out.println(keyWords);

        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        try {
            fileIn = new FileInputStream("C:\\java\\untitled\\untitled\\src\\main\\resources\\fileInput.txt");
            fileOut = new FileOutputStream("C:\\java\\untitled\\untitled\\src\\main\\resources\\fileOutput.txt");
            String acc = "";
            List splitString = new ArrayList();

            int a;
            while ((a = fileIn.read()) != -1) {
                acc += (char) a;
            }
            String[] newAcc = acc.split(" ");

            for (String i : newAcc) {
                if (keyWords.containsKey(i)) {
                    keyWords.put(i, keyWords.get(i) + 1);
                }
            }
            System.out.println(keyWords);

            for (int i = 0; i < splitString.size(); i++) {
                System.out.println(splitString.get(i));
            }

            FileWriter writer = new FileWriter("C:\\java\\untitled\\untitled\\src\\" +
                    "main\\resources\\copied_file.txt", false);
            writer.write(String.valueOf(keyWords));
            writer.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }
}
