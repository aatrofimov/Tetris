
public class Zobj extends Object{
	Dot dt1;
	Dot dt2;
	Dot dt3;
	Dot dt4;
	Zobj(){
		dt1 = new Dot(8, 0);
		dt2 = new Dot(10, 1);
		dt3 = new Dot(10, 0);
		dt4 = new Dot(12, 1);
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