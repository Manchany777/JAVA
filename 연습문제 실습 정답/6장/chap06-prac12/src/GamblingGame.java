import java.util.Scanner;

public class GamblingGame {
	private Player [] p;
	private Scanner scanner = new Scanner(System.in);
	
	public GamblingGame() {
		System.out.print("갬블링 게임에 참여할 선수 숫자>>");
		 
		int nPlayers = scanner.nextInt();
		scanner.nextLine(); // 버퍼에 입력된 <Enter>키 제거. 
		 
		p = new Player[nPlayers]; // 2대신 3으로 고치면 3명이 하는 게임이 된다.		 
		for(int i=0; i<p.length; i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			p[i] = new Player(scanner.nextLine());
		}
	}
	
	public void run() {
		int i=0;
		while (true) {
			if (p[i].turn()) { // 선수 i의 세 수가 모두 같은 경우
				System.out.println(p[i].getName()+"님이 이겼습니다!");
				break;
			}
			else {
				System.out.println("아쉽군요!");
				i++; // 다음 사람
				i = i%p.length; // 두 사람이 번갈아 게임함
			}
		}
	}
		
	public static void main(String [] args) {
		GamblingGame game = new GamblingGame();
		game.run();
	}
}
