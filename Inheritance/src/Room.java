//Example of Single inheritance.

public class Room 
{
	int length,width,a;
	Room(int x , int y, int i)
	{
		length =x;
		width =y;
	}
	int area ()
	{
		a= length*width;
		return(a);
	}
	class BedRoom extends Room 		//inheritance room class
	{
		BedRoom(int x, int y) 
		{
			super(x, y, y);
		}
		int height,v;
		void Bedroom (int a,int b,int c)
		{
			//super  = a,b;			//pass value to super class
			height = c;
		}
		int volume()
		{
			v=length*width*height ;
					return(v);
		}
	}
	int volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
