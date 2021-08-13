package multi_game;

import java.util.Scanner;

public class Login_tap {
	Scanner input =new Scanner(System.in);
	private String idNum="kim", psNum="ps1234";
	public int  login() {
		String id, ps;
		System.out.println("넵 로그인을 하셔야 합니다. ");
		System.out.print("id가 뭔가요? : ");
		id=input.next();
		System.out.print("password가 뭔가요: ");
		ps=input.next();
		if(idNum.equals(id)&&psNum.equals(ps)) {
			return 1;
		}else {
			return 0;
		}
	}
	public void display() {
		System.out.println("id : "+idNum+"\npassword : "
				+psNum);
	}
}
