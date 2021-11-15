package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		HourWorker HW = new HourWorker ("¬асиль", 60, 200);
		FixWorker FX = new FixWorker ("ƒмитро", 15000);
		HW.salary();
		FX.salary();
	}

}
