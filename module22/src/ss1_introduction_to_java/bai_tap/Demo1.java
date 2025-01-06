package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Demo1 {
    int i;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tuổi");
        int i;
        i =10;
        long l = 10;
        float f =10.0f;
        double b = 10.0;
        char c = 'c';
        System.out.println(i);
        double age = Double.parseDouble(scanner.nextLine());
        System.out.println("nhâp tên");
        String name = scanner.nextLine();
        System.out.println("tuổi vừa nhập "+ age);
        System.out.println("tên vừa nhập "+ name);

    }
}
