package demo;
abstract class Car
{
	abstract void Start();
	abstract void Drive();
	abstract void Stop();
	
	public void drive()
	{
		System.out.println("car is moving");
	}
}
class AutoCar 
{
	 void Start()
	{
		System.out.println("car auto start Button ");
	}
	 void Drive()
	 {
		 System.out.println("car auto driving");
	 }
	 void Stop()
	 {
		 System.out.println("car is stop");
	 }
}
public class AbstractionExample {

	public static void main(String[] args) {
		AutoCar c=new AutoCar();
		c.Start();

	}

}
