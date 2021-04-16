package demp.interfaces;

public class Bike implements TwoWheeler{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bike movement");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Bike display");
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("Bike type");
	}
	public void brand()
	{
		System.out.println("Bike brand");
	}
	
	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.display();
		obj.move();
		obj.type();
		obj.brand();
		
		TwoWheeler ob = new Bike(); //upcasting - move display type
		ob.move();
		ob.display();
		ob.type(); //brand method not available bcoz of reference
		
		Vehicle v = new Bike();// move display
		v.display();
		v.move();
		
		//accessing the interface static members from two different interfaces but they are with same name
		
		System.out.println("Wheels : "+TwoWheeler.wheels);
		System.out.println("Wheels of FourWheeler : "+FourWheeler.wheels);
	}

}
