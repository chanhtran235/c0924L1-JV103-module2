package ss3_array.demo_tham_tri_tham_chieu;

import java.util.Arrays;

public class DemoThamTriThamChieu {
    public static void main(String[] args) {
//        int n =10;
//        changeValue1(n);
//        System.out.println("giá trị sau khi gọi hàm " +n);

        int[] array = {1,2};
        changeArray(array);
        System.out.println(" ngoài hàm : "+ Arrays.toString(array));
    }
//    public static void changeValue1(int a){
//        a++;
//        System.out.println("trong hàm " +a);
//    }

    public static void changeArray(int[] arr){
        arr[0] =100;
        System.out.println("trong hàm " + Arrays.toString(arr));
    }

}
