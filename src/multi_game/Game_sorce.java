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
		int a,b;
		System.out.println("게임에 오신것을 환영"
				+ "합니다. 계정을 입력해주세요");
		b=log.login();
		if(b==1) {
			while(true) {
				System.out.println("원하는 보기를 선택해주세요 : \n"
						+ "1.계정명 보기 \n2. 랜덤 숫자 맞추기 \n"
						+ "3.가위바위보 게임 \n 4.로또게임 \n5. 숫자 야구게임\n"
						+ "6.게임 나가기");
				
				a=input.nextInt();
				switch(a) {
				case 1: log.display(); break;
				//김성윤 조장 코드
				
				case 2: ran.gameStart(); break;
				//김준호 코드
				
				case 3: rock.rockPaperGame(); break;
				//김진성 코드
				
				case 4: lot.lotteryGame(); break;
				//송지현 코드
				
				case 5: base.nBaseBallGame(); break;
				//신윤수 코드 
				
				case 6: System.out.println("시스템을 종료합니다. ");
					return ;
				default : System.out.println("없는 선택지 입니다. "); 
				}
			}
		}
		

	}
}