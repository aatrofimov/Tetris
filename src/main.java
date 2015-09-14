import java.io.IOException;


public class main {

	public static void main(String[] args) {

		Geometry gm = new Geometry();
		Glass gl = new Glass();
		gm.Print(25, 25);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		Zobj Z = new Zobj();
		for(int i = 0; i < 20; i++){
		gm.Print(25, 25);
		
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		Z.move("down");
		}
		
		Iobj I = new Iobj();
		for(int i = 0; i < 10; i++){
		gm.Print(25, 25);
		
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		I.move("down");
		}
		I.turn("left");
		for(int i = 0; i < 10; i++){
		gm.Print(25, 25);
		
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		I.move("down");
		}

	}

}
