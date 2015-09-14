
public abstract class Coordinates extends Geometry {
	public static void set_coord(int x, int y, char a){
		Geometry.Space[x][y] = a;
	}
}
