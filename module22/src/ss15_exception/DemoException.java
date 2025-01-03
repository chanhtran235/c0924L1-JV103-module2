package ss15_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        System.out.println("--------------------Bắt đầu chương trình--------------------");
//        Scanner scanner = new Scanner(System.in);
//        int age =0;
//        // vì sao?
//        boolean flag = true;
//        while (flag){
//            System.out.println("nhập tuổi ");
//            try{
//                age = Integer.parseInt(scanner.nextLine());
//                checkAge(age);
//                flag =false;
//            }catch (MyAgeException e){
//                System.out.println("nhâp tuoi chưa đúng");
//            }catch (NumberFormatException e){
//                System.out.println("sai định format");
//            }catch (Exception e){
//               e.printStackTrace();
//            }
//        }
//        System.out.println("tuoi là: "+ age);
        method1();

        System.out.println("--------------------Kết thúc chương trình-------------------");
    }

    public static void method1() {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào index mà muốn lấy ra");
        int i = -1;
        int element =0;
        try {
            // nếu nhập i dạng chuoi thì mặc lây i =0
            // nêú nhâp index  ngoài pt mảng thì i lấy phần tử cuối mảng
            i = Integer.parseInt(scanner.nextLine());
            element = arr[i];
        }catch (NumberFormatException e){
            System.out.println("lỗi format => lấy phần tử đầu tiền");
            i = 0;
        }catch (ArrayIndexOutOfBoundsException e){
            i = arr.length-1;
            System.out.println(" truy cập ngoài pần tử mảng => lấy phần tử cuối cùng");
        }catch (Exception e){
            System.out.println("lỗi gì đó");
            e.printStackTrace();
        }finally {
            System.out.println("Khôi finally luôn luôn chay");
        }
        element =arr[i];
        System.out.println(element);
    }

    public static void method2(String pathFile) throws FileNotFoundException  {
        File file = new File(pathFile);
        FileReader fileReader = new FileReader(file);

    }

    public static boolean checkAge(int age) throws MyAgeException{
        if (age<0){
            throw new MyAgeException("tuổi nhỏ hơn 0");
        }else if (age>120){
            throw new MyAgeException("tuôi qua lớn : >120");
        }
        return true;
    }


}
