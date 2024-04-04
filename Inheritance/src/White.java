//  Program illustrates the concept of multilevel inheritance. 
public class White {
	
	 int num; 
	 void White(int x) //statement1 
	 { 
	 num = x; 
	 } 
	 } 
	 class Red extends White 
	 { 
	 Red(int y) 
	 { 
	 super(); //statement2 
	 } 
	 void print() 
	 { 
	 System.out.println("Value of num: "+num); 
	 } 
	 } 
	 class Magenta extends Red 
	 { 
	 int maggy; 
	 Magenta(int z) 
	 { 
	 super(z); //statement3 
	 maggy = z; 
	 } 
	 } 


