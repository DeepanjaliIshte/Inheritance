
/*Write a program for the following
		Emp(emp_no,name)
		Emp_details(city,address)
		Emp_bs(bs)*/
public class Emp
{
	char name ;
	int emp_no;
	Emp(int x,char String)
	{
		emp_no=x;
		name=String;
	}
	public Emp(int x, String string) {
	}
	void display()
	{
		System.out.println("Employee number : "+emp_no);
		System.out.println("Employee name : "+name);
	}
}
class Emp_details extends Emp
{
	char city,address;
	Emp_details (int x, String string,String string2,String string3)
	{
	super(x,string);
	String city = string2;
	String address = string3;
	}
	void put_data()
	{
		System.out.println("City : "+city);
		System.out.println("address : "+address);
	}	
}
class Emp_bs extends Emp_details
{
	float bs,hra,da,gs;
	Emp_bs(int x, String string,String string2,String string3,float b)
	{
		super(x,string,string2,string3);
		bs=b;
	}
	void cal_bs()
	{
		hra=bs*0.10f; 		//hra = 10% of bs
		da=bs*0.05f;			//da=5% of bs
		gs= bs-(hra+da);
	}
	void display_data()
	{
		System.out.println("Basic Salary : "+bs);
		System.out.println("Gross salary : "+gs);
	}
}

