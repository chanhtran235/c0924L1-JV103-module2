package ss3_array.thuc_hanh;

public class DemoArray2 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {2,3,4}
        };
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
}
