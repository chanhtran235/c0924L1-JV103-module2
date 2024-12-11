package ss6_inheritance;

public class Instructor  extends Employee implements Itraining {
    @Override
   public void howToGo() {
        System.out.println(" GV đi làm bằng xe đạp");
    }

    @Override
    public void attendance() {

    }
}
