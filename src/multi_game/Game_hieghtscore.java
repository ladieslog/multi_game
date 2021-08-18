package multi_game;

public class Game_hieghtscore {
	public void display() {
		RandomNumberGame ran =new RandomNumberGame();
		RockPaperGame rock =new RockPaperGame();
		LotteryGame lot =new LotteryGame();
		NBaseBallGame base =new NBaseBallGame();
		ran.score();
		rock.score();
		lot.score();
		base.score();
	}
}
