package ss8_mvc.service;

import ss8_mvc.model.Teacher;

public interface ITeacherService {
    Teacher[] findAll();
    void add(Teacher teacher);
}
