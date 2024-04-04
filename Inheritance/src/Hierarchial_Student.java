/*2] Create a base  class student (Roll_no,Name) which  derives two base classes Test (marks1, marks2) and Result(total_marks,per)
Write a java menu driven program to perform the following function.
i] Build a table.
ii] Calculate total marks and percentage.
iii] Display the details of the students.
*/

import java.io.DataInputStream;

public class Hierarchial_Student
{
	int Roll_no;
	String name;
	Hierarchial_Student()
	{
 	Roll_no=01;
 	name ="John";
	}
Void get_data(int x,String y)
	{
	Roll_no=x;
	name=y;
	return null;		
	}
void display()
	{
	System.out.println("Roll_no : "+Roll_no);
	System.out.println("Name : " +name);
	}
}
class Test extends Hierarchial_Student
{
	float marks1,marks2;
	void get_marks(float m,float n)
	{
		marks1= m;
		marks2=n;
	}
	Test()
	{
		marks1=0.0f;
		marks2=0.0f;
	}
	void put_data()
	{
		System.out.println("Marks1 : "+marks1);
		System.out.println("Marks2 :  "+marks2);
	}
}
class result extends Hierarchial_Student
{
	float total_marks,per;
	result()
	{
		total_marks=0;
		per=0;
	}
	void cal_total()
	{
		int marks1 =0;
		int marks2=0;
		total_marks=marks1 + marks2;
		per=(total_marks*100)/200;
	}
	void put_per()
	{
		System.out.println("Total marks :-"+total_marks);
		System.out.println("Peercentage : "+per);
	}
}


