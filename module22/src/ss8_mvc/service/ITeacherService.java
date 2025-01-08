package ss8_mvc.service;

import ss8_mvc.model.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> findAll();
    void add(Teacher teacher);
}
