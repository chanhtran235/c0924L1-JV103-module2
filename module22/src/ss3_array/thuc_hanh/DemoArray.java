package ss3_array.thuc_hanh;

import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30}; // numbers[0] => 10
//        String string[] = {"sam sung", "huyn dai"};// it dùng
//        String[] string1 = new String[]{"chánh","tiên"};// string1[0] => null
//        boolean[] booleans = new boolean[2];// booleans[0] => false
//        double[] numbers1 = new double[3];// có thể chứa 3 phần tử
//        numbers1[0] =12; // ok
//        numbers1[1] = "abc"; // not
//        numbers1[3] =12.0; // lỗi truỳ cập ngoài pt mảng
        // mỗi phàn tử bên trong có giá trị là báo nhiêu?????????
//        System.out.println(numbers1[0]); /// 0.0d
        // là so có thể thêm phần tử vào cuối mảng?
        // duyệt mảng: for, foreach ( for of trong js)
        System.out.println("--------in ra mảng--------");
        System.out.println("mảng : "+ numbers);// in ra đia chỉ ô nhớ
        // sử dụng một class tiện ích để in ra giá trị
        System.out.println(Arrays.toString(numbers));
        System.out.println("------------duyệt mảng---------------");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(i +":"+numbers[i] );
        }
        // sử dụng foreach
        System.out.println("-----dùng foreach");
        for(int n : numbers){
            System.out.println(n);
        }
        // dùng for để thay đổi giá trị pt trong mảng
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] +=100;
        }
        System.out.println("giá trị của mảng sau khi thay đổi bằng for => cộng thêm 100");
        System.out.println(Arrays.toString(numbers));

        for (int n: numbers) {
            n +=100;
        }
        System.out.println("- Mảng sau khi thay đổi bằng foreach => cộng thêm 1000");
        System.out.println(Arrays.toString(numbers));
    }
}
