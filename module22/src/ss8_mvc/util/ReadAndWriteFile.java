package ss8_mvc.util;

import ss8_mvc.model.Student;

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


    // đọc ghi file nhị phân

//    public static void writeListStudentToBinaryFile(String filePath, List<Student> studentList){
//        File file = new File(filePath);
//        FileOutputStream fileOutputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream(file);
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(studentList);
//        } catch (FileNotFoundException e) {
//            System.out.println("Không tìm thấy file");
//        } catch (IOException e) {
//            System.out.println("Lỗi ghi file");
//        }finally {
//            try {
//                objectOutputStream.close();
//                fileOutputStream.close();
//            } catch (IOException e) {
//                System.out.println("Lỗi đóng file");
//            }
//        }
//    }


//    public static List<Student> readBinaryFileToListStudent(String filePath){
//        List<Student> studentList = new ArrayList<>();
//        File file = new File(filePath);
//        FileInputStream fileInputStream =null;
//        ObjectInputStream objectInputStream = null;
//        try {
//            if (file.length()>0){
//                fileInputStream = new FileInputStream(file);
//                objectInputStream = new ObjectInputStream(fileInputStream);
//                studentList = (List<Student>) objectInputStream.readObject();
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("lỗi không tìm thấy file");
//        } catch (IOException e) {
//            System.out.println("Lỗi đọc file");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        return studentList;
//    }
    // kiểu byte cho tất ca các loại đối tượng


    public static <T> void writeListSObjectToDat(String pathFile, List<T> objectList) {
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objectList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi ghi file");
        }
    }

    public static <T> List<T> readListObjectFromDat(String pathFile){
        List<T> objectList = new ArrayList<>();
        File file =new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        if (file.length()>0){
            try {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                objectList =(List<T>)objectInputStream.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("lỗi tên file");
            } catch (IOException e) {
                System.out.println("lỗi đọc file");
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        return objectList;
    }

}
