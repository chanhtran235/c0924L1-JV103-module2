package ss1_io_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileText {

    // write file
    public static void writeFile(String pathFile, String line){
        File file = new File(pathFile);
        try (
                FileWriter fileWriter = new FileWriter(file,true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
                ){
               bufferedWriter.write(line);
               bufferedWriter.newLine();

        } catch (IOException e) {
           e.printStackTrace();
        }

    }
    public static List<String> readFileText(String pathFile){
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                ){
            String line = "";
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("not found file");
        } catch (IOException e) {
            System.out.println(" Error read file");
        }
        return stringList;
    }
}
