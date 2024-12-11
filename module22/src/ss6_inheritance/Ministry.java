package ss6_inheritance;

public class Ministry extends Employee {
    @Override
    public void howToGo() {
        System.out.println(" Giáo vụ đi làm bằng oto");
    }


    public void attendance() {
        System.out.println(" GV có thể điểm danh");
    }

    public void organizeGame() {
        System.out.println("tổ chức trò chơi");
    }
}
