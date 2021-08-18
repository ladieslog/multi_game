package multi_game;

public class Game_hieghtscore {
	public void display() {
		RandomNumberGame ran =new RandomNumberGame();
		RockPaperGame rock =new RockPaperGame();
		LotteryGame lot =new LotteryGame();
		NBaseBallGame base =new NBaseBallGame();
		System.out.println("\n랜덤수 뽑기 전적은 : ");
		ran.score();
		System.out.println("\n가위바위보 전적보기");
		rock.score();
		System.out.println("\n로또 보너스보기");
		//lot.score();
		System.out.println("\n야구전적 보기");
		base.score();
		
	}
}
