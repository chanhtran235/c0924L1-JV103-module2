package ss4_object_class;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Student[] students = new Student[10];

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Chọn chức năng \n" +
                    "1. Xem danh sách\n" +
                    "2. Thêm mới\n" +
                    "3.  Xoá \n" +
                    "4. Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // code hiển thị danh sách
                    System.out.println("--------------Hiển thị danh sách-------");
                    for (int i = 0; i <students.length ; i++) {
                        if (students[i]!=null){
                            System.out.println(students[i].toString());
                        }

                    }

                    break;
                case 2 :
                    // code thêm mới
                    System.out.println("---------------Thêm mới----------");
                    System.out.println("nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập tên");
                    String name = scanner.nextLine();
                    System.out.println("nhập điểm");
                    float score = Float.parseFloat(scanner.nextLine());
                    Student student = new Student(id, name,score);
                    for (int i = 0; i <students.length ; i++) {
                        if (students[i]==null){
                            students[i]=student;
                            break;
                        }
                    }

                    break;
                case 3:
                    System.out.println("------------- xoá ----------------------");
                    break;
                case 4:
                    System.out.println("-------- Kết thúc----------------------");
                    System.exit(0);
            }
        }
    }
}
