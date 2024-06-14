package Main;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int H = scanner.nextInt(); // 시간
        int M = scanner.nextInt(); // 분

        // 알람 시간 계산
        int alarmH = H;
        int alarmM = M - 45;

        if (alarmM < 0) {
            alarmM += 60;
            alarmH--;
            if (alarmH < 0) {
                alarmH = 23; // 자정 1분 전
            }
        }

        // 결과
        System.out.println(alarmH + " " + alarmM);

        scanner.close();
    }
}
