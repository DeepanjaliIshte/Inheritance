
public class A_1 
{
	void Show_A()
	{
		System.out.println("A class Method");
	}	
}
class B_1 extends A_1
{
	void Show_B()
	{

		System.out.println("B class Method");	
	}
	public static void main(String[] args) 
	{
		A_1 obj=new A_1();
		obj.Show_A();
		System.out.println("**********************************");
		//obj.show_B(); not used
		B_1 obj1=new B_1();
		obj1.Show_B();
		obj1.Show_A();
		System.out.println("**********************************");
		C_1 obj2=new C_1();
		obj2.Show_A();
		obj2.Show_B();
		obj2.show_C();
	}
}
class C_1 extends B_1
{
	void show_C()
	{
		System.out.println("C class Method");
	}
	
}
