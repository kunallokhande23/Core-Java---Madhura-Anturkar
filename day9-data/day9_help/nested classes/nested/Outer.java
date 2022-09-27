package nested;

class Outer 
{
	
	private int x,y;
	Outer(int a,int b)
	{
		x=a;y=b;
	}
	void displayInner()
	{
		MyInner m1=new MyInner(11,12);
		System.out.println("From outer class "+m1.a+"  "+m1.b);
	}
	
	class MyInner
	{
	
		private int a;
		private int b;
		MyInner(int x,int y)
		{
			a=x;
			b=y;
		}
		void display()
		{
			System.out.println("Inner data "+a+"  "+b);
			System.out.println("Outer Data "+x +"   "+y);
		}
		//static void test(){}
	}
	public static void main(String[] args) 
	{
		// create outer class instance.
		Outer out=new Outer(1,2);
		//create inner class instance.
		Outer.MyInner in1=out.new MyInner(21,41);
		in1.display();
		//create inner class instance : another way
		Outer.MyInner in=new Outer(3,4).new MyInner(20,40);
		in.display();
		out.displayInner();
	}
}
