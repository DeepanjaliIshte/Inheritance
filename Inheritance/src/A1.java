//Example of multilevel  inheritance.

public class A1 
{
	float r,pi=3.12f,a;
	A1(float X)
	{
		r=X;
	}
	void cal()
	{
		a=pi*r*r;
		System.out.println("Area of circle is : "+a);
	}
class B1 extends A1
{
	float h,v;
	B1(float X,float Y)
	{
		super(X);
		h=Y;
	}
	void vol()
	{
		v=pi*r*r*h;
	System.out.println("Vol is : "+v);
	}
}
class C1 extends B1
{
	float l,vo;
	C1(float X,float Y,float Z)
	{
		super(X,Y);
		l=Z;
	}
	void volume()
	{
		vo=pi*r*r*h*l;
		System.out.println("Volume is : "+vo);
	}
}
}