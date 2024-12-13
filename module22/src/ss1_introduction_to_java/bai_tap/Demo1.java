package ss1_introduction_to_java.bai_tap;

public class Demo1 {
    public static void main(String[] args) {
        int x =10;
        int y =10;
        int z =10;
        boolean laBaCanhTamGiac = x>0&&y>0&&z>0&& (x+y)>z;
        if (laBaCanhTamGiac){
            System.out.println("3 cạnh tam giác");
        }
    }
}
