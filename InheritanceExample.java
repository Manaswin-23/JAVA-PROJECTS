package demo;
class Animal
{
	public  Animal()
	{
		System.out.println("the animals different types");
	}
}
class Dog extends Animal
{
	public  Dog()
	{
		System.out.println("dog was eating food and go sleep");
	}
}
class Cat extends Dog
{
	public  Cat()
	{
		System.out.println("cat is sleeping");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		Cat c=new Cat();

	}

}
