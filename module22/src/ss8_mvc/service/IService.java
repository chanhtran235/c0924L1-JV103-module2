package ss8_mvc.service;

import ss8_mvc.model.Student;

import java.util.List;

public interface IService <T> {
    List<T> findAll();
    void add(T t);
}
