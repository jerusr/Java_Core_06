package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		HourWorker HW = new HourWorker ("������", 60, 200);
		FixWorker FX = new FixWorker ("������", 15000);
		HW.salary();
		FX.salary();
	}

}
