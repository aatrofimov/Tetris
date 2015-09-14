
public class Glass extends Object{
	Glass(){
			for (int i = 0; i < 20; i++){
				Coordinates.set_coord(0, i, '=');
				Coordinates.set_coord(22, i, '=');
			}
			for (int i = 0; i < 12; i++)
				Coordinates.set_coord(2*i, 20, '=');
	}

	@Override
	public boolean move(String type) {
		return false;
	}

	@Override
	public void turn(String type) {
	}

	@Override
	public boolean can_move(String type) {
		// TODO Auto-generated method stub
		return false;
	}
}
