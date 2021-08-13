package multi_game_jinsung;

import java.util.Scanner;

public class RockPaperGame {

	private int n,com;
	
	public int getCom() {
		com=(int)(Math.random()*3);
		return com;
	}

	public void rockPaperGame(){
		Scanner input = new Scanner(System.in);
		while(true) {
		getCom();
		System.out.println("==== 가위바위보 게임 ====");
		System.out.println("0.가위 1.바위 2.보");
		System.out.print("입력 : ");
		n = input.nextInt();
		if(n>2) {
			System.out.println("다시 입력해 주세요! ! !");
			continue;
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
			}else if(com == 2) {
				System.out.println("=== 승리 ===");
			}else {
				System.out.println("=== 무승부 ===");
			}
		}else if(n==1) {
			if(com==0) {
				System.out.println("=== 승리 ===");
			}else if(com==2) {
				System.out.println("=== 패배 ===");
			}else {
				System.out.println("=== 무승부 ===");
			}
			
		}else if(n==2) {
			if(com == 0) {
				System.out.println("=== 패배 ===");
			}else if(com == 1) {
				System.out.println("=== 승리 ===");
			}else {
				System.out.println("=== 무승부 ===");
			}
		}
	}
	
	
}
