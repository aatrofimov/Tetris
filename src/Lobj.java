
public class Lobj extends Object{
	Dot dt1;
	Dot dt2;
	Dot dt3;
	Dot dt4;
	int x1, x2, x3, x4, y1, y2, y3, y4;
	Lobj(){
		dt1 = new Dot(10, 2);
		dt2 = new Dot(10, 1);
		dt3 = new Dot(10, 0);
		dt4 = new Dot(12, 2);
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
	}

	@Override
	public boolean can_move(String type) {
		return (dt1.can_move(type) &&
				dt2.can_move(type) &&
				dt3.can_move(type) &&
				dt4.can_move(type));
	}
}