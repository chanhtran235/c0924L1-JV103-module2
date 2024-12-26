package ss8_mvc.service;


import ss8_mvc.model.CompaByIdAndName;
import ss8_mvc.model.CompaByName;
import ss8_mvc.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// các method CRUD Student
public class StudentService implements IStudentService {
    private static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(3,"chanh2"));
        students.add(new Student(2,"chanh2"));
        students.add(new Student(2,"chanh12"));
        students.add(new Student(1,"chanh1"));
        students.add(new Student(4,"chanh4"));
    }
    @Override
    public List<Student> findAll() {
        // sắp xếp id và tên
        Collections.sort(students,new CompaByName());
           // đọc file
        return students;
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

}
