// Multilevel Inheritance
public class X {
	void Show_x()
	{
		System.out.println("X class method");
	}
}
class Y extends X
{
	void show_y()
	{
		System.out.println("Y class Method");
	}
}

class Z extends Y
{
	void show_z()
	{
		System.out.println("Z class Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x=new X();
		x.Show_x();
		System.out.println("*******************");
		Y y=new Y();
		y.Show_x();
		y.show_y();
		System.out.println("*******************");
		Z z=new Z();
		z.Show_x();
		z.show_y();
		z.show_z();
	}

}
