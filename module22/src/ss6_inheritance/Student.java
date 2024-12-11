package ss6_inheritance;

import java.util.Objects;

public  class Student extends Person {
    private int score;
    private Classes classes;  // has -a ;


    public Student(){

    }

    @Override
   public void howToGo() {
        System.out.println(" sin viên di chuyển bằng xe máy");
    }

    public Student(int id, String name, int age, int score){
        super(id,name,age);
        this.score = score;
    }

    public void study(String subject){
        System.out.println(super.getName() + ": đang học môn "+ subject);
    }


    @Override
    public String toString() {
        return super.toString()+ "score: "+ score;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.getId()==student.getId()&&this.getName().equals(student.getName()) ;
    }
}
