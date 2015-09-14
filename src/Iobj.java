
public class Iobj extends Object{
	Dot dt1;
	Dot dt2;
	Dot dt3;
	Dot dt4;
	int x1, x2, x3, x4, y1, y2, y3, y4;
	Iobj(){
		dt1 = new Dot(10, 3);
		dt2 = new Dot(10, 2);
		dt3 = new Dot(10, 1);
		dt4 = new Dot(10, 0);
	}

	@Override
	public boolean move(String type) {
		if (this.can_move(type))
		return (dt1.move(type) &&
				dt2.move(type) &&
				dt3.move(type) &&
				dt4.move(type));
		else
			return false;
	}

	@Override
	public void turn(String type) {
		if (type == "left" || type == "right"){
			this.x1 = dt1.get_x();
			this.x2 = dt2.get_x();
			this.x3 = dt3.get_x();
			this.x4 = dt4.get_x();
			this.y1 = dt1.get_y();
			this.y2 = dt2.get_y();
			this.y3 = dt3.get_y();
			this.y4 = dt4.get_y();
			if (this.x1 == 2 && Geometry.Space[this.x2 + 2][this.y2] == ' ' && Geometry.Space[this.x2 + 4][this.y2] == ' ' && Geometry.Space[this.x2 + 6][this.y2] == ' '){
				dt1.set(this.x2, this.y2);
				dt2.set(this.x2 + 2, this.y2);
				dt3.set(this.x2 + 4, this.y2);
				dt4.set(this.x2 + 6, this.y2);
			}
			else if (this.x2 == 20 && Geometry.Space[this.x2 - 2][this.y2] == ' ' && Geometry.Space[this.x2 - 4][this.y2] == ' ' && Geometry.Space[this.x2 - 6][this.y2] == ' '){
				dt1.set(this.x2 - 6, this.y2);
				dt2.set(this.x2 - 4, this.y2);
				dt3.set(this.x2 - 2, this.y2);
				dt4.set(this.x2, this.y2);
			}
			else if (this.x2 == 18 && Geometry.Space[this.x2 + 2][this.y2] == ' ' && Geometry.Space[this.x2 - 2][this.y2] == ' ' && Geometry.Space[this.x2 - 4][this.y2] == ' '){
				dt1.set(this.x2 - 4, this.y2);
				dt2.set(this.x2 - 2, this.y2);
				dt3.set(this.x2, this.y2);
				dt4.set(this.x2 + 2, this.y2);
			}			
			else if (Geometry.Space[this.x2 - 2][this.y2] == ' ' && Geometry.Space[this.x2 + 2][this.y2] == ' ' && Geometry.Space[this.x2 + 4][this.y2] == ' '){
				dt1.set(this.x2 - 2, this.y2);
				dt2.set(this.x2, this.y2);
				dt3.set(this.x2 + 2, this.y2);
				dt4.set(this.x2 + 4, this.y2);
			}
			else if (this.y1 == this.y2 && Geometry.Space[this.x2][this.y2 + 1] == ' ' && Geometry.Space[this.x2][this.y2 - 1] == ' ' && Geometry.Space[this.x2][this.y2 - 2] == ' '){
				dt1.set(this.x2, this.y2 + 1);
				dt2.set(this.x2, this.y2);
				dt3.set(this.x2, this.y2 - 1);
				dt4.set(this.x2, this.y2 - 2);
			}
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean can_move(String type) {
		return (dt1.can_move(type) &&
				dt2.can_move(type) &&
				dt3.can_move(type) &&
				dt4.can_move(type));
	}
}
