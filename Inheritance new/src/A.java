// Single Inheritance

public class A
{
	void show_A()
	{
		System.out.println("A class method");
	}
}
class B extends A
{
	void Show_B()
	{
		System.out.println("B class Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();	
		obj.show_A();
		System.out.println("***********");
		
		B obj1=new B();
		obj1.Show_B();
		obj1.show_A();
	}
}
