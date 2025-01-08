package ss8_mvc.controller;

import ss8_mvc.model.Teacher;
import ss8_mvc.service.ITeacherService;
import ss8_mvc.service.TeacherService;

import javax.sound.midi.Soundbank;
import java.util.List;
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
                    List<Teacher> teacherList = teacherService.findAll();
                    for (Teacher teacher: teacherList) {
                        System.out.println(teacher);
                    }
                    // hiển thi
                    break;
                case 2:
                    // thêm ới
                    System.out.println("nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập tên");
                    String name = scanner.nextLine();
                    System.out.println("nhập lương");
                    float salary = Float.parseFloat(scanner.nextLine());
                    Teacher teacher = new Teacher(id,name,salary);
                    teacherService.add(teacher);
                    System.out.println("thêm mới thành công");
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
