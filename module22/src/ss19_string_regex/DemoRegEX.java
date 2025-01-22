package ss19_string_regex;

import java.util.Arrays;
import java.util.Scanner;

public class DemoRegEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tên lớp");
        String name = scanner.nextLine();
        String regexName = "^[A-Z][a-z]*\\s[A-Z][a-z]*(\\s[A-Z][a-z]*){0,2}$";
        boolean check =name.matches(regexName);
        System.out.println(check);


    }
}
