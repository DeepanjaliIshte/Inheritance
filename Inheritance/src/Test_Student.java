import java.io.DataInputStream;

public class Test_Student 
{
	public static void main(String args[], Object obj1)
	{
		int choice;
		DataInputStream in = new DataInputStream(System.in);
		System.out.println( "Enter your choice : ");
		System.out.println("1: Build a table");
		System.out.println("2: Calculate total marks and percentage ");
		System.out.println("3: Display detais of student");
		choice=Integer.parseInt(System.());
		Test obj=new Test();
		Result obj11 = new Result();
				do 
				{
					switch (choice)
					{
					case 1:
						obj11.get_data(1,"krishna");
						obj11.get_marks(80,70);
						break;
					case 2:                                   
						((Object) obj11).cal_total();
						break;
					case 3:
						obj11.display();
						obj11.put_data();
						obj11.put_per();
					default :
						System.out.println("Please enter correct choice");
				}
				}
				while (choice!=3);
				{
					
				}
				
	}
}

