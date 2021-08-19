package multi_game;


public class NBaseballGameScore {
	
	protected static int record=100;
		
	public void score() {
		if(record == 100) System.out.println("아직 기록이 없습니다.");
		else System.out.println("숫자야구 게임 최고기록 : " + record + "회");	
		
	}
}