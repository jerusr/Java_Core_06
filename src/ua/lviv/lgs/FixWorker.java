package ua.lviv.lgs;

public class FixWorker extends Worker implements Salary {
	
	private double fix;

	
	public FixWorker(String name, double fix) {
		super(name);
		this.fix = fix;
	}

	@Override
	public void salary() {
		double salary = fix;
		System.out.println("Зарплата в працівника з фіксованою місячною зарплатою " + super.getName() + " зіставила " + salary + " грн.");		
	}

}
