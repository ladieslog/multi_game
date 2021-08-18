package multi_game.sjh;
import java.util.Arrays;

public class LotteryGame extends Game_hieghtscore{
	private int base = 45;
	private static int ballNum = 6;
	private static int[] lots = new int[ballNum];
	
	public void score() {
		System.out.println("랜덤 추가 숫자 뽑기");
		System.out.println(lots);
		
		
		while(true) {int bonus= rand();
	         if(!contain(bonus)) {
	                 System.out.println(bonus);
	                 break;
	     }
	}
		
		
		
		
		// 반복문
		//1. 랜덤한 숫자 뽑기
		// 2. lots에 랜덤한 숫자가 있는지 없는지 비교
		// 2-1. 있다면, 다시 랜덤숫자 뽑고 비교
		// 2-2. 없다면, 추가번호는 랜덤 숫자 표현하고
		// 반복문 탈출
	}
	
	public int[]getLots(){
		return lots;
	}
	public void lotteryGame() {
		make();
		print();
	}
	public void print() {
		for(int i = 0 ; i<lots.length; i++) {
			if(i==lots.length-1) {
				System.out.printf("%d", lots[i]);
			}else {
				System.out.printf("%d,",lots[i]);
			}
		}
		score();
		System.out.println();
	}
	private int rand() {
		return (int)(Math.random()*base)+1;

	}
	public boolean contain(int n) {
		boolean isC=false;
		for(int i =0; i<lots.length; i++) {
			if(lots[i]==n) {
				isC=true;
				break;
			}
		}
		return isC;
	}
	public void make() {
		Arrays.fill(lots, 0);
		int count=0;
		while(count!=ballNum) {
			int temp=rand();  //1~45
			if(!contain(temp)) {
				lots[count++]=temp;

			}
		}
		Arrays.sort(lots);
		
	}
}