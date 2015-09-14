
public class Dot extends Object{
	public int x;
	public int y;
	Dot(int x, int y){
		Coordinates.set_coord(x, y, '*');
		this.x = x;
		this.y = y;
	}
	public int get_x(){
		return x;
	}
	
	public int get_y(){
		return y;
	}
	
	public void set(int x, int y){
		int tmp_x, tmp_y;
		tmp_x = this.x;
		tmp_y = this.y;
		this.x = x;
		this.y = y;
		if (Geometry.Space[x][y] == ' '){
			Geometry.Space[x][y] = '*';
			Geometry.Space[tmp_x][tmp_y] = ' ';
		}
	}
	
	@Override
	public boolean move(String type) {
		switch(type){
		case "up":
			if(y != 0 && Geometry.Space[x][y - 1] == ' '){
				set(x, y - 1);
				return true;
			}
			else
				return false;
		case "down":
			if(Geometry.Space[x][y + 1] == ' '){
				set(x, y + 1);
				return true;
			}
			else
				return false;
		case "right":
			if(Geometry.Space[x + 1][y] == ' '){
				set(x + 1, y);
				return true;
			}
			else
				return false;
		case "left":
			if(Geometry.Space[x - 1][y] == ' '){
				set(x - 1, y);
				return true;
			}
			else
				return false;
		default :
			return false;
		}		
	}

	@Override
	public void turn(String type) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean can_move(String type) {
		switch(type){
		case "up":
			if(y != 0 && Geometry.Space[x][y - 1] == ' ' || Geometry.Space[x][y - 1] == '*')
				return true;
			else
				return false;
		case "down":
			if(Geometry.Space[x][y + 1] == ' ' || Geometry.Space[x][y + 1] == '*')
				return true;
			else
				return false;
		case "right":
			if(Geometry.Space[x + 1][y] == ' ' || Geometry.Space[x + 1][y] == '*')
				return true;
			else
				return false;
		case "left":
			if(Geometry.Space[x - 1][y] == ' ' || Geometry.Space[x - 1][y] == '*')
				return true;
			else
				return false;
		default :
			return false;
		}		
	}

}
