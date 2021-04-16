package demp.interfaces;

final public class Innova extends Car {
	
	void bestCarModel()
	{
		System.out.println("In innova car bestCarModel");
	}
	//Final methods cannot be overridden 
	
	@Override
	public void display()
	{
		this.bestCarModel();
		super.bestCarModel();
		System.out.println("display method");
	}
//	@Override
//	public void move()
//	{
//		System.out.println("this is innova car movement");
//	}
	public static void main(String[] args) {
		Innova obj = new Innova();
		obj.display();
		obj.move();
		
		System.out.println("Vehicle dept  " +vehicledept);
		
		Car ob = new Innova();
		ob.display();
		ob.move();
		brand();
	}
}
