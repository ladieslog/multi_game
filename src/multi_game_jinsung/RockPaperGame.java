package multi_game_jinsung;

import java.util.Scanner;

class Count {
	protected int cntWin,cntDrow,cntDe;
	
	public int getCntWin() {
		return cntWin++;
	}

	public int getCntDrow() {
		return cntDrow++;
	}

	public int getCntDe() {
		return cntDe++;
	}

	public void score() {
		System.out.println("Play 전적 : "+getCntWin()+"승 "+getCntDe()+"패 "+getCntDrow()+"무 입니다.");
	}
}

public class RockPaperGame extends Count {
	protected int n,com;
	public int getCom() {
		com=(int)(Math.random()*3);
		return com;
	}

	public void rockPaperGame(){
		Scanner input = new Scanner(System.in);
		while(true) {
		getCom();
		System.out.println("====== 가위바위보 게임 ======");
		System.out.println("0.가위 1.바위 2.보 3.전적보기 4.게임종료");
		System.out.print("입력 : ");
		n = input.nextInt();
		if(n==3) {
			score();
		}
		if(n>4) {
			System.out.println("다시 입력해 주세요! ! !");
			System.out.println();
			continue;
		}
		if(n==4) {
			System.out.println("게임을 종료합니다.");
			break;
		}
		Play();
		result();	
		System.out.println();
		}
	}
	
	public void Play() {
		if(n==0) {
			System.out.println("Player : 가위");
		}else if(n==1) {
			System.out.println("Player : 바위");
		}else {
			System.out.println("Player : 보");
		}
		
		if(com==0) {
			System.out.println("Computer : 가위");
		}else if(com==1) {
			System.out.println("Computer : 바위");
		}else {
			System.out.println("Computer : 보");
		}
	}
	
	public void result() {
		if(n==0) {
			if(com==1) {
				System.out.println("=== 패배 ===");
				getCntDe();
			}else if(com == 2) {
				System.out.println("=== 승리 ===");
				getCntWin();
			}else if(com==0){
				System.out.println("=== 무승부 ===");
				getCntDrow();
			}
		}else if(n==1) {
			if(com==0) {
				System.out.println("=== 승리 ===");
				getCntWin();
			}else if(com==2) {
				System.out.println("=== 패배 ===");
				getCntDe();
			}else if(com ==1){
				System.out.println("=== 무승부 ===");
				getCntDrow();
			}
			
		}else if(n==2) {
			if(com == 0) {
				System.out.println("=== 패배 ===");
				getCntDe();
			}else if(com == 1) {
				System.out.println("=== 승리 ===");
				getCntWin();
			}else if(com ==2){
				System.out.println("=== 무승부 ===");
				getCntDrow();
			}
		}
	}
	
	
}
