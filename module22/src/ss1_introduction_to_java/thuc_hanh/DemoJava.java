package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class DemoJava {

    public static void main(String[] args) {
//        System.out.println("Hello");
//        int number =10;
//        long nubmer1= 20;
//        double nubmer2 =10;
//        double nubmer22 =10.0;
//        float number3 = 10.0f;
//        char c = 'a';
//        boolean b = true;
//        String s = "Hello";
//        Double d1 =12.0;
//        final double PI=3.14;
//
//        int n1 =10;
//        int n2 =10;
//        System.out.println(n1==n2);
//        String s1 = new String("a");
//        String s2 = new String("a");
//        System.out.println(s1==s2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
//        int age = scanner.nextInt();
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập điểm");
        Float f = 10.0f;
        float point = Float.parseFloat(scanner.nextLine());
        System.out.println("Tuổi là : " + age);
        System.out.println("Tên là  là : " + name);
        System.out.println("điểm : " + point);

        if (age < 0) {
            System.out.println("không hợp lệ");
        } else if (age > 100) {
            System.out.println("không hợp lệ");
        } else {
            System.out.println("hợp lệ");
        }
        int month = 5;
        switch (month) {
            case 1:
                System.out.println("tháng1");
                break;
            case 2:
                System.out.println("tháng 2");
                break;
            default:
                System.out.println("không phải tháng trong năm");
        }
    }
}
