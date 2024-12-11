package product_manager;

import java.util.Scanner;

public class Main {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        int choose = 0;
        do {
            System.out.println("Chọn chức năng\n" +
                    "1. Hiển thị danh sách\n" +
                    "2. Thêm mới sản phẩm\n" +
                    "3. Xoá sản phẩm\n" +
                    "4. Tìm kiếm theo tên\n" +
                    "5. Cập nhật thông tin sản phẩm\n" +
                    "6. Thoát");
            System.out.println("Chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    // hiển thị danh sách
                    System.out.println("--------------Hiển thị danh sách sản phẩm-------------------");
                    productManager.display();
                    break;
                case 2:
                    // thêm mới
                    System.out.println("---------------Thêm mới--------------------");
                    Product product = inputDatStudent();
                    productManager.add(product);
                    System.out.println("-- thêm mới thành công---");
                    break;
                case 3:
                    // xoá
                    System.out.println("---------------Xoá--------------------------");
                    System.out.println("Nhâp id cần xoá: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    productManager.deleteById(id);
                    break;
                case 4:
                    // tìm kiếm
                    break;
                case 5:
                    // cập nhật
                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }
    public static Product inputDatStudent(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id,name,price);
        return  product;
    }
}
