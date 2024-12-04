package ss4_object_class;

public class Student {

    // khai báo thuộc tính, biến của đối tượng ( instance), biến toàn cục (global)
    int id;
    String name;
    float score;

    public Student() {
    }

    public Student(int id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }



   public String toString(){
        return "id : "+ this.id +"- name: "+ this.name + "-score: "+ this.score;
   }
}
