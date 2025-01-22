package ss8_mvc.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Student extends Person  implements Comparable<Student> {
    public static String school ="CODEGYM";
    private  String address;
    public Student() {
    }

    public Student(int id, String name,String address) {
        super(id, name);
        this.address = address;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
    public String getInfoToFile(){
        return super.getId() +","+ super.getName() +","+this.getAddress();
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
        return super.getId() == student.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getId());
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
