
class Super 
 { 
 int i,j; 
 void show() 
 { 
 System.out.print("i and j: "); 
 System.out.println( + i + " " + j); 
 } 
 } 
 class Sub extends Super 
 { 
 int k; 
 void display() 
 { 
 System.out.println("k: " + k); 
 } 
 void sum() 
 { 
 System.out.println("i+j+k: " + (i+j+k)); 
 } 
 } 
 
