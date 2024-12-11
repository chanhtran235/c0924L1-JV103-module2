package ss4_object_class.bai_tap.stopwatch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng StopWatch
        StopWatch stopWatch = new StopWatch();

        // Bắt đầu đo thời gian
        stopWatch.start();

        // Thực hiện một công việc nào
        int count =0;
        for (int i = 0; i <1000000000 ; i++) {
            for (int j = 0; j <100000000 ; j++) {
                count++;
            }
        }
        // Dừng đo thời gian
        stopWatch.stop();
        // Hiển thị
        System.out.println("Thời gian thực : " + stopWatch.getElapsedTime() + " milliseconds");
    }

}
