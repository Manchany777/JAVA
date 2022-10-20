import java.util.Scanner;

public class ChangeMoney {
	public static void main (String args[])  {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류

		Scanner scanner = new Scanner(System.in);

		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			int res = money/unit[i]; // unit[i]의 개수 계산
			
			// res는몫
			if (res > 0) { // 몫이 있는 경우
				System.out.println(unit[i] + "원 짜리 : " + res + "개");
				money = money%unit[i]; // money 갱신
			}
		}
		
		scanner.close();
	}
}