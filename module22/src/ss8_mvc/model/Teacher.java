package ss8_mvc.model;

import java.io.Serializable;

public class Teacher extends Person {
    private float salary;

    public Teacher() {
    }

    public Teacher(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", salary=" + salary +
                '}';
    }
}
