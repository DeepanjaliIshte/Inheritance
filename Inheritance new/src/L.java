// Hierarchical Inheritance 
public class L {
	void Show_l()
	{
		System.out.println(" L class method");
	}
}
 class M extends L
 {
	 void show_m()
	 {
		 System.out.println("M class method");
	 }
	 
 }
 
 class N extends L{
	 void Show_n()
	 {
		 System.out.println("N class method");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L l=new L();
		l.Show_l();
		
		M m=new M();
		m.Show_l();
		m.show_m();
		
		N n=new N();
		n.Show_l();
		n.Show_n();
	}

 }
