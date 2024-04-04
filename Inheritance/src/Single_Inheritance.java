import java.io.IOException;
import java.util.Scanner;

// Program of Single inheritance
public class Single_Inheritance 
{
	public static final int Integer = 0;
	class First 
	 { 
	 int val; 
	 void init() 
	 {
		 Scanner sn= new Scanner(System.in);
		 System.out.print("Enter a number: "); 
	 { 
	 val=sn.nextInt();}
	 } 
	 int square() 
	 { 
	 return(val*val); 
	 } 
	 } 
	 class Second extends First 
	 { 
	 int mem; 
	 int cube() 
	 { 
	 mem = square() * val; 
	 return mem; 
	 } 
	 } 
	} 


