package ss8_mvc.service;


import ss8_mvc.model.Student;

import java.util.List;

public interface IStudentService {
    Student[] findAll();
    void addStudent(Student student);
}
