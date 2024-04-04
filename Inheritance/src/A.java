// 3] Write a program to implement the following.

  //      A       πr^2
                       
 // 	  B        4/3 πr^2 h

public class A 
{
float r,pi=3.12f,a;
A(float x)
{
	r=x;
}
void area()
{
	a=pi*r*r;
	System.out.println("Area of circle is : "+a);
}
}
class B extends A
{
	float h,v;
	B(float x,float y)
	{
		super (x);
		h=y;
	}
	void volume()
	{
		v=(2/3)*pi*r*r*h;
		System.out.println("volume is : "+v);
	}
}
