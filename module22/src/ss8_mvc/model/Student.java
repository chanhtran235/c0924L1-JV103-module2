package ss8_mvc.model;

import java.util.Comparator;
import java.util.Objects;

public class Student  implements Comparable<Student>{
    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        if (this.getId()-s.getId()==0){
            // săp xếp theo tên
            return  (this.getName().compareTo(s.getName()));
        }else {
            return this.getId()-s.getId();
        }
    }

    @Override
    public boolean equals(Object object) {
        Student student = (Student)object;
        return this.id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //    @Override
//    public int compareTo(Student s) {
        // sắp xếp theo aid
        // nếu lớn hơn thì trả về số dương
        // Nếu nhỏ hơn trả về số âm
        // Nếu bằng nhau trả về 0
//        if (this.getId()<s.getId()){
//            return -1;
//        }else if (this.getId()>s.getId()){
//            return 1;
//        }else {
//            return 0;
//        }
//        return this.getId()-s.getId();
//        if (this.getId()-s.getId()==0){
//            // săp xếp theo tên
//            return  (this.getName().compareTo(s.getName()));
//        }else {
//            return this.getId()-s.getId();
//        }
//    }
}
