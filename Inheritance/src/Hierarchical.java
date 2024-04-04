
public class Hierarchical 
{
	float r,pi =3.12f,a;
	Hierarchical(float x)
		{
			r=x;
		}
	void cal()
	{
		a=pi*r*r;
		System.out.println("Area : "+a);
	}
}
	class B extends Hierarchical
	{
		float h,v;
		B(float x,float y)
		{
			super (x);
			h=y;
		}
		void cal_v()
		{
			v=2/3*pi*r*r*h;
			System.out.println("volume of cylinder : "+v);
		}
		
	}
	

	class C  extends Hierarchical
	{
		float l,vol;
		C(float x,float y) {
			super (x);
			l=y;
		}
		void cal_v()
		{
		vol=(1/3)*pi*r*r*l;
			System.out.println("vol:"+vol);
		}
	}