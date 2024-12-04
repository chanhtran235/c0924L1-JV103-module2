package ss3_array.bai_tap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DemoMethod.showMessage("Hello world");
        // không truy cập được thông qua class
//        DemoMethod.showMessage2("Chánh");
        // tạo ra đối tượng
        DemoMethod demoMethod = new DemoMethod();
        demoMethod.showMessage2("Chánh");

    }
}
