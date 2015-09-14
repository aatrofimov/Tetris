
public class Geometry {	
	static char[][] Space = new char[50][100];
	Geometry(){
		for (int i = 0; i < 50; i++){
			for (int j = 0; j < 100; j++){
				Space[i][j] = ' ';
			}
		}
	}
	
	public void Print(){
		for (int j = 0; j < 100; j++){
			System.out.println();
			for (int i = 0; i < 50; i++){
				System.out.print(Space[i][j]);
			}
		}
	}
	
	public void Print(int x, int y){
		for (int j = 0; j < y; j++){
			System.out.println();
			for (int i = 0; i < x; i++){
				System.out.print(Space[i][j]);
			}
		}
	}
}