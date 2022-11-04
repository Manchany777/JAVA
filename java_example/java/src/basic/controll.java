package basic;

import java.util.Scanner;

public class controll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("파트별 점수를 (1 2 3) 입력하시오 ==> ");
        int score_1 = scanner.nextInt();
        int score_2 = scanner.nextInt();
        int score_3 = scanner.nextInt();
        int total = (score_1 + score_2 + score_3) / 3;
        if (total >= 60) {
            if (score_1 < 40 || score_2 < 40 || score_3 < 40) {
                System.out.println("다음에 다시 도전하세요.");
            } else {
                System.out.println("합격입니다.");
            }
        } else {    // indentation 과 오류 찾기 (ctr + alt + l)
            System.out.println("다음에 다시 도전하세요.");
        }
    }
}
