	// Single Inheritance 
public class Animal {
	
	void eat()
	{
		System.out.println("I am Eating");
	}
}
class Dog extends Animal
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Dog d=new Dog ();
		d.eat();
	}

}

