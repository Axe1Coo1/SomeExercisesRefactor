package homework.moduleFour.taskThree;

//Дан файл, содержащий буквы текст на кириллице. Кодировка файла utf-8. Прочитайте
//информацию из файла и перепишите ее в файл в кодировкой utf-16.

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        try (FileReader in = new FileReader
                ("C:\\java\\untitled\\untitled\\src\\main\\resources" + "\\fileInput.txt");
             BufferedWriter writer = Files.newBufferedWriter(Path.of("fileOutput.txt"), StandardCharsets.UTF_16)){
            StringBuilder str = new StringBuilder();
            int c;
            while ((c = in.read()) != -1 ){
                str.append((char) c);
            }
            System.out.println(str);
            writer.write(String.valueOf(str));
            writer.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
