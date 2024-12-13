package ss8_mvc.service;


import ss8_mvc.model.Student;

// các method CRUD Student
public class StudentService implements IStudentService {
    private static Student[] students = new Student[10];
    static {
        students[0]= new Student(1,"chanh1");
        students[1]= new Student(2,"chanh2");
        students[2]= new Student(3,"chanh3");
    }
    @Override
    public Student[] findAll() {
           // đọc file
        return students;
    }

    @Override
    public void addStudent(Student student) {
        // dùng foreach không được vì foreach không thay đổi dược mảng
        for (int i = 0; i <students.length ; i++) {
            if (students[i]==null){
                students[i]=student;
                break;
            }
        }
    }

}
