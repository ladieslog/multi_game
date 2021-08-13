package multi_game.KJH;

import java.util.Scanner;

public class RandomNumberGame {
	public void gameStart() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("랜덤 숫자 맞추기 게임입니다.");
		System.out.println("1 ~ 100까지의 숫자를 입력해주세요.");
		int randomNum = (int) ((Math.random() * 100) + 1);
		int count = 0;
		while(true) {
			System.out.print("숫자 입력 >>> ");
			int userNum = scanner.nextInt();
			if(userNum <= 0 || userNum > 100) {
				System.out.println("숫자의 범위가 벗어났습니다. (1~100)");
				continue;
			}
			int result = numberCheck(userNum, randomNum);
			switch(result) {
				case 2:
					System.out.println("정답입니다!");
					System.out.println("횟수는 " + count + "번 입니다.");
					return;
				case 1:
					System.out.println("입력하신 숫자가 더 높습니다!");
					break;
				case 0:
					System.out.println("입력하신 숫자가 더 낮습니다!");
					break;
				default:
					break;
			}
			count++;
		}
	}
	
	private int numberCheck(int userNum, int randomNum) {
		if(userNum == randomNum) {
			return 2;
		} else if(userNum > randomNum) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
