package ua.lviv.lgs;

public class HourWorker extends Worker implements Salary {
 
	private int hour;
	private double rate;
	

	public HourWorker(String name, int hour, double rate) {
		super(name);
		this.hour = hour;
		this.rate = rate;
	}


	@Override
	public void salary() {
		double monthRate = hour * rate;
		double salary = monthRate;
		System.out.println("Зарплата працівника з погодинною зарплатою " + super.getName() + " зіставила " + salary + " грн.");		
	}


}
