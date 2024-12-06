package ss4_object_class;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("-------start-------------");
        Student student1 = new Student(1,"chanh",9.0f);
        Student student2 = new Student(2,"chanh2",9.0f);
        Student student3 = new Student(3,"chanh3",9.0f);
          student1.name="ok";
//         student2.school ="Codegym";
        Student.school="Codegym";
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());


    }
}
