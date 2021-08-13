package multi_game;

import java.util.Scanner;

public class Game_sorce {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Login_tap log =new Login_tap();
		RandomNumberGame ran =new RandomNumberGame();
		RockPaperGame rock =new RockPaperGame();
		LotteryGame lot =new LotteryGame();
		NBaseBallGame base =new NBaseBallGame();
		int a;
		System.out.println("게임에 오신것을 환영합니다. 계정을 입력해주세요");
		
		while(true) {
			System.out.println("원하는 보기를 선택해주세요 : \n"
					+ "1.계정명 보기 \n2. 랜덤 숫자 맞추기 \n"
					+ "3.가위바위보 게임 \n 4.로또게임 \n5. 숫자 야구게임\n"
					+ "6.게임 나가기");
			
			a=input.nextInt();
			switch(a) {
			case 1: log.login();
			case 2: ran.gameStart();
			case 3: rock.rockPaperGame();
			case 4: lot.lotteryGame();
			case 5: base.nBaseBallGame();
			case 6: return ;
			}
		}
	}
}
