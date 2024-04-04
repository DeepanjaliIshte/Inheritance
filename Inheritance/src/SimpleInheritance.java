
public class SimpleInheritance 
	 { 
	 public static void main(String args[]) 
	 { 
	 Super a = new Super(); 
	 Sub b = new Sub(); 
	 a.i = 5; 
	 a.j = 12; 
	 System.out.println("Contents of super: "); 
	 a.show(); 
	 System.out.println(); 
	 b.i = 11; 
	 b.j = 13; 
	 b.k = 17; 
	 System.out.println("Contents of sub: "); 
	 b.show(); 
	 b.display(); 
	 System.out.println(); 
	 System.out.println("Sum of i, j and k in sub:"); 
	 b.sum(); 
	 } 
	 }


