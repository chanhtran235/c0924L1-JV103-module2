package ss6_inheritance;

public class Run {
    public static void main(String[] args) {

        Student student1 = new Student(1,"chánh2",45,110);
        Student student2 = new Student(1,"chánh2",34,10);
        // so sánh bằng

        // ss 2 đối tượng bằng == => ss địa chỉ ô nhớ
        System.out.println(student2==student1);// false
        System.out.println(student2.equals(student1));//false

    }
}
