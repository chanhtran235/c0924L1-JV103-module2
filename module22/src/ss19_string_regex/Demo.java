package ss19_string_regex;

public class Demo {
    public static void main(String[] args) {
        String str1 = "hello";// khai báo trức tiếp => literal string
        String str2 = new String("hello");
        String str3 = new String("hello");
        String str4 = "hello";
          // ví lưu ở đâu???

        // so sánh bằng có (==, equals)
        System.out.println(str1==str4); // true
        System.out.println(str1==str2);// false
        System.out.println(str3==str2);// flase

        System.out.println(str1.equals(str2));

        String s = "hello";
        s = s +" codegym";  // new String("hello codegym");

        StringBuffer stringBuffer = new StringBuffer("hello");

        stringBuffer.append(" codegym");

    }

}
