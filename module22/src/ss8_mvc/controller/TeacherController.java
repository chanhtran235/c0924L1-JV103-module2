package ss8_mvc.controller;

import ss8_mvc.model.Student;
import ss8_mvc.model.Teacher;
import ss8_mvc.service.ITeacherService;
import ss8_mvc.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private ITeacherService teacherService = new TeacherService();
    public void displayTeachMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Chọn chức năng \n" +
                    "1. Xem danh sách\n" +
                    "2. Thêm mới\n" +
                    "3.  Xoá \n" +
                    "4. Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    teacherService.findAll();
                    // hiển thi
                    break;
                case 2:
                    // thêm ới
                    Teacher teacher = new Teacher();
                    teacherService.addTeacher(teacher);
                    break;
                case 3:
                    System.out.println("------------- xoá ----------------------");
                    break;
                case 4:
                    System.out.println("-------- Kết thúc----------------------");
                   flag = false;
            }
        }
    }
}
