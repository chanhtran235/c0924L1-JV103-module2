package ss3_array.bai_tap;

public class DemoMethod {

    // method main là một method đặc biệt để bắt đầu chương trình.
    public static void main(String[] args) {
        showMessage("Hello");

        System.out.println(sum(10, 10.0));// sum ở trên
        System.out.println(sum(10.0, 10));// sum ở dưới
    }


    // method static thuộc về class => có thể sử dụng thông qua tên lướp
    public static void showMessage(String mess) {
        System.out.println(mess);
    }

    // method không có static => thuộc đối tượng
    // muốn sử dụng được thì phải khởi toạ đối tượng từ class chứa hàm nay
    public void showMessage2(String name) {
        System.out.println("Xin chào  bạn " + name);
    }

    // trong cùng một class có thể khai báo nhiều method cùng tên hay không?
    // có : nhưng khác nhau kiểu dữ liệu

    public void showMessage2() {
        System.out.println("Xin chào  bạn ");
    }

    public void showMessage2(int a) {
        System.out.println("Xin chào  bạn " + a);
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b + 100;
    }


    // overloading : nạp chông phương thức


}
