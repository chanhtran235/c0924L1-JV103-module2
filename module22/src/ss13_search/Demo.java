package ss13_search;

public class Demo {
    public static void main(String[] args) {
      int[] array = {1,3,4,7,22,23,45,67,76};
        System.out.println(binarySearch(array,89));
    }
    public static int linearSearch(int[] arr ,int value){
        for (int i = 0; i <arr.length ; i++) { // O(n)
            if (arr[i]==value){ //O1
                return i; //01
            }
        }
        return -1;// O1
    }
    // O1xO1 = > O1 *O(n) = > O(n)*O(1)
    // On
    public static  int binarySearch (int[] arr, int value){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid]==value){
                return mid;
            }else if (arr[mid]<value){
                left= mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }
}
