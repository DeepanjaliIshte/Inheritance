
public class D
{

	void f1() 
	{
		f3(); //Sub class method can't be accessed directly on Super class method
	System.out.println("f1 of S");
	}
	

class S extends D{
	


	void f2()
	{
		System.out.println("f2 of S");
	
	}
}
void f3()
{
	f1();
	System.out.println("f3 of S");
}
void f2() {
	// TODO Auto-generated method stub
	
}
}


		


