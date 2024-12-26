package ss12_set_map;

import ss8_mvc.model.Student;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<Student> studentSet = new LinkedHashSet<>();
        Student student1 = new Student(1,"chanh1");
        Student student11 = new Student(1,"chanh1");
        Student student2 = new Student(2,"chanh2");
        Student student22 = new Student(2,"chanh22");
        Student student3 = new Student(3,"chanh3");
        Student student4= new Student(4,"chanh4");
//        System.out.println(student1.hashCode());
//        System.out.println(student2.hashCode());
//        System.out.println(student22.hashCode());
//        System.out.println(student3.hashCode());
//        System.out.println(student4.hashCode());
//        studentSet.add(student1);
//        studentSet.add(student2);
//        studentSet.add(student22);
//        studentSet.add(student3);
//        studentSet.add(student4);
        // duyệt set dùng foreach
//        for (Student s: studentSet){
//            System.out.println(s);
//        }
        // tạo map lưu số buổi vắng nghỉ của học viên
        Map<Student,Integer> studentMap = new HashMap<>();
        studentMap.put(student3,12);
        studentMap.put(student1,1);
        studentMap.put(student2,10);

        Student student = new Student(4,"chánh4");
        if (studentMap.containsKey(student)){
            studentMap.put(student,studentMap.get(student)+1);
        }else {
            studentMap.put(student,1);
        }


        Set<Student> studentSets = studentMap.keySet();
       // cách duyệt map để lấy ra key và value
        for (Student s: studentSets) {
            System.out.println("học viên: "+ s.getName()+ "--vắng nghỉ: "+ studentMap.get(s));
        }


        Set<Map.Entry<Student,Integer>> entrys = studentMap.entrySet();
        for (Map.Entry<Student,Integer> e: entrys) {
            System.out.println(e.getKey().getName() + ": "+ e.getValue());
        };

    }
}
