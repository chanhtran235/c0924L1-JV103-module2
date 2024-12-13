package ss8_mvc.view;

import ss8_mvc.controller.StudentController;
import ss8_mvc.controller.TeacherController;

import java.util.Scanner;

public class View {

    // nới bắt đầu chạy chương trinhf
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        while (true){
            System.out.println("Chọn chức năng \n" +
                    "1. Quản lý sinh viên\n" +
                    "2. Quản lý giáo viên\n" +
                    "3. Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentController.displayStudentMenu();
                    break;
                case 2:
                    teacherController.displayTeachMenu();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
