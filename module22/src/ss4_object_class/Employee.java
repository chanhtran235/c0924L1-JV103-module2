package ss4_object_class;

import ss5_static.Person;

public class Employee extends Person {
    public Employee(int id) {
        super(id);
    }
    public void getInfo(){
        super.name= "Hello";
        super.id =1;
    }

}
