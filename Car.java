package demp.interfaces;

public abstract class Car implements Vehicle{

	@Override
	final public void move() {
		// TODO Auto-generated method stub
		System.out.println("This is a car class");
		
	}
	
	static void brand()
	{
		System.out.println("Static block in car");
	}
	
	public Car()
	{
		System.out.println("Default constructor");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	//abstract method
	void bestCarModel()
	{
		System.out.println("Best car model ");
	}

}
