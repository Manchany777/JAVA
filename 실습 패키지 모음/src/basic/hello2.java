package basic;
import java.util.Scanner;

public class hello2 {
    public static void main(String[] args) {
        System.out.println("도시와 나이와 독신여부(true/false)를 공백으로 구분하여 입력하시오.");

        Scanner scan = new Scanner(System.in);
        String city = scan.next(); // 문자열 읽기
        int age = scan.nextInt(); // 숫자 읽기
        boolean single = scan.nextBoolean(); // 불린 읽기

        System.out.println(city + "에 사는 " + age + "살이고 독신여부는 " + single +"입니다.");
        scan.close();
    }
}


