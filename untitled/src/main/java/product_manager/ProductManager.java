package product_manager;

public class ProductManager {
    private static Product[] products = new Product[10];
    static {
        products[0] = new Product(1,"sam sung",100);
        products[1] = new Product(2,"sam sung2",100);
        products[2] = new Product(3,"sam sung3",100);
    }
    // class chức năng CRUD: Create, Read, Update, Delete
    // chứa các method thêm, sửa , xoá hiển thị
    public void display(){
        for (int i = 0; i < products.length; i++) {
            if (products[i]!=null){
                System.out.println((i+1)+"."+ products[i]);
            }else {
                break;
            }

        }
    }
    public void add(Product product){
        for (int i = 0; i < products.length; i++) {
            if (products[i]==null){
               products[i]=product;
               break;
            }
        }
    }
    public void deleteById(int id){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId()==id){
                for (int j = i; j < products.length-1 ; j++) {
                    products[j]=products[j+1];
                }
                products[products.length-1]=null;
                break;
            }
        }
    }

}
