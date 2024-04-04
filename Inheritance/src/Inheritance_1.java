
public class Inheritance_1 
{
	public static void main(String[] args) 
	{
		D obj= new D();
		((D.S) obj).f2();
		obj.f1();
		System.out.println("obj");
		String s= obj.toString();
		System.out.println(s);
		System.out.println("-----------");
		S obj1 = new S();
		 obj.f3();
		 obj.f1();
		System.out.println("obj.to String()");
		System.out.println("-----------");
		S obj2 =new S();                //   Super class object can't be ref with sub class ref
		}
	public void f2() {
		// TODO Auto-generated method stub
		
	}
	
}


