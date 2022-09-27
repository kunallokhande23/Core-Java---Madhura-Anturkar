package wrappers;

public class Test1 {

	public static void main(String[] args) {
		// Integer i1=new Integer(100);
		Integer i1 = Integer.valueOf(100);// boxing
		i1 = Integer.valueOf("12345");// string --> Integer : using parsing API
		int data = i1.intValue();// un boxing , explicit conversion from Integer-->int
		Integer i2 = 1234;// javac impl int ---> Integer : auto boxing
		data = i2;// auto un boxing : javac
		String s = "1234567";
		// s++;
		i1++;// javac : auto un boxing --> int(int tmp=i1.intValue()) --> inc : tmp ++
				// ;-->i1=Integer.valueOf(tmp); auto boxing
		System.out.println(i1);// 12346
		Boolean flag = true;// auto boxing
		Double d1 = 234.567;// auto boxing : Double d1 =Double.valueOf(234.567)
		float f1 = 34.56F;
		double d2 = f1;// widening conversion (auto promotion) : javac
		// d1=f1;//javac : auto boxing : float --> Float ---X----Double : javac err
		d1 = (double) f1;// p : float --> double , c : double ---> Double (auto boxing)
		Number n1 = 123.456;// double ---> Double (auto boxing) ----up casting ---> Number
		System.out.println(n1.getClass());// java.lang.Double
		n1 = 23456;// int ---> Integer ---> Number
		Object o = 12.345f;// float --> Float --> Number --> Object
		System.out.println(o.getClass());// java.lang.Float
		o = "dgdfagfd";// up casting
		o = true;// boolean --> Boolean --> Object
		// Is java pure object oriented language ? NO : since it supports primitive
		// types : for efficiency ,doesn;t support multiple inheritance thro classes ...
		// Can you access any type (i.e either primitives : auto boxing , up casting or
		// ref type : up casting) in Java using Object type of a reference ?
	}

}
