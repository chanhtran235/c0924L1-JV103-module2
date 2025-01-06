package ss8_mvc.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    // 2 phương thức đọc và ghi file
    // tên file, dữ liều
    public static void writeFile(String filePath, List<String> stringList,boolean  append){
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        //tham khảo try-catch-resource để đóng mở file cho ngọn hơn
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String line: stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("lỗi đóng file");
            }
        }
    }
    public static List<String> readFile(String filePath){
        List<String> stringList = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader= new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while ((line= bufferedReader.readLine())!=null){
                   stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }finally {
            // đóng luồng file
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println("lỗi đóng file");
            }

        }
        return stringList;
    }
}
