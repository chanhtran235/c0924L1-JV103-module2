package ss5_static;

import ss4_object_class.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name ="01chanh";
        System.out.println(student.name);
        student.setName("01Chánh");
        student.getName();
    }
}
