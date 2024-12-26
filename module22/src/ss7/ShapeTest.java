package ss7;

public class ShapeTest {

    public static void main(String[] args) {
        // cha lưu được các hình con
        Shape[] shapes = new Shape[3];
        // ép kiểu ngầm định
//        Shape shape = new Circle();
        shapes[0] = new Circle(10);
        shapes[1] = new Square(20);
        shapes[2] = new Rectangle(20, 30);
        System.out.println("------trước khi tăng diện tích");
        for (Shape shape : shapes) {
//            if (shape instanceof Circle){
//                System.out.println(((Circle)shape).getPerimeter());
//            } else if (shape instanceof Rectangle) {
//                System.out.println(((Rectangle)shape).getPerimeter());
//            }else {
//                System.out.println(((Square)shape).getPerimeter());
//            }
            if (shape instanceof Square) {
                Square square1 = (Square) shape;
                square1.howToColor();
            }
            System.out.println(shape.getPerimeter());

        }
        System.out.println("---sau khi tăng");
        for (Shape shape : shapes) {
            shape.resize(Math.random() * 100);
//            if (shape instanceof Circle){
//                System.out.println(((Circle)shape).getPerimeter());
//            } else if (shape instanceof Rectangle) {
//                System.out.println(((Rectangle)shape).getPerimeter());
//            }else {
//                System.out.println(((Square)shape).getPerimeter());
//            }
            System.out.println(shape.getPerimeter());
        }

        Rectangle rectangle = new Rectangle();
    }
}
