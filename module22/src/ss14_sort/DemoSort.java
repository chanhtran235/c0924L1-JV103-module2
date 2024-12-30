package ss14_sort;

import java.util.Arrays;

public class DemoSort {
    public static void main(String[] args) {
        System.out.println();
        int[] array1 ={7,3,15,5,-1};

        int[] array2 ={1,3,4,9,21};
        System.out.println("Trước sắp xếp " +Arrays.toString(array2));
        System.out.println("-----------------------------------------");
        insertionSort(array2);
        System.out.println("------------------------------------------");
        System.out.println("Sau sắp xếp " +Arrays.toString(array2));
    }
    public static void bubbleSort(int[] arr){
        boolean flag=true;// mảng chưa được sắp xếp
        for (int i = 0; i <arr.length&flag ;i++) {
            flag =false;
            for (int j = arr.length-1; i<j ; j--) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag =true;
                }
                System.out.println("Lần thứ: " +i +"-"+j +" : " +Arrays.toString(arr));
            }
        }
    }


    public static  void selectionSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int indexMin =i;
            // tìm giá trị nhỏ nhất trong dãy hiện hành
            for (int j = i; j <arr.length ; j++) {
//                System.out.println("tìm gí trị nhỏ nhất");
                if (arr[j]<arr[indexMin]){
                    indexMin=j;
                }
            }
            System.out.println("Min: " +arr[indexMin]);
            // đổi chỗ giá trị nhỏ nhất và pt đầu tiên của dãy hiện hành.
            if (indexMin!=i){
                System.out.println("đã đổi chỗ");
                int temp =arr[i];
                arr[i]=arr[indexMin];
                arr[indexMin] =temp;
            }
            System.out.println("lần : " +i +" : " +Arrays.toString(arr));
        }
    }
    public static void insertionSort(int[] arr) {
        int x;
        int pos;
        for (int i = 1; i < arr.length; i++) {
            // lấy giá trị để đi chèn
            x = arr[i];
            pos = i;
            // chèn vào vì trí thích hợp ở mảng con
            while (0 < pos && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
                System.out.println("dịch chuyển");
            }
            arr[pos] = x;
            System.out.println("Lần thứ" + i + ": " + Arrays.toString(arr));

            //            int j;
//            for (j=i;0<j;j--){
//                if (x<arr[j-1]){
//                    arr[j]=arr[j-1];
//                }else {
//                    break;
//                }
//            }
//            arr[j]=x;
        }
    }


}
