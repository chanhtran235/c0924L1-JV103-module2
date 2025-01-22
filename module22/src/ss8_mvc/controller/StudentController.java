package ss8_mvc.controller;

import ss8_mvc.exception.NotFoundStudentException;
import ss8_mvc.model.Student;
import ss8_mvc.service.StudentService;
import ss8_mvc.validate.Validate;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService();// has-a

    public void displayStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Chọn chức năng \n" +
                    "1. Xem danh sách\n" +
                    "2. Thêm mới\n" +
                    "3.  Xoá \n" +
                    "4. Quay lại menu chính");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    List<Student> students = studentService.findAll();
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case 2:
                    // id tự tăng => lấy id cuối cùng +1;
//                    System.out.println("nhập id");
//                    int id = Integer.parseInt(scanner.nextLine());
                    // lấy list
                    List<Student> studentList = studentService.findAll();
                    Student lastStudent = studentList.get(studentList.size() - 1);
                    int id = lastStudent.getId() + 1;
                    String name = "";
                    // validate dữ liệu
                    do {
                        System.out.println("nhập tên");
                        name = scanner.nextLine();
                    } while (!Validate.checkName(name));

                    System.out.println("nhập địa chỉ");
                    String address = scanner.nextLine();
                    Student student = new Student(id, name, address);
                    studentService.add(student);
                    break;
                case 3:
                    System.out.println("------------- xoá ----------------------");
                    System.out.println("Yêu cầu nhập id cần xoá");
                    int deleteId = Integer.parseInt(scanner.nextLine());

                    boolean check = studentService.deleteById(deleteId);

                    if (check) {
                        System.out.println("xoá thành công");
                    } else {
                        // được 3 điểm
                        try {
                            throw new NotFoundStudentException("không tìm thấy id");
                        }catch (NotFoundStudentException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 4:
                    System.out.println("-------- Kết thúc----------------------");
                    flag = false;
            }
        }
    }

}
