package inherit;

public class airplaneApp {

	public static void main(String[] args) {
	SupersonicAirplane sa=new SupersonicAirplane();
	
	sa.takeoff();
	
	sa.fly();
	sa.flyMode=SupersonicAirplane.SUPERSONIC;
	sa.fly();
	sa.flyMode=SupersonicAirplane.NORMAL;
	sa.fly();
	sa.land();
	
	
	
	}

}