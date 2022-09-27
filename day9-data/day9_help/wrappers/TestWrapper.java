package wrappers;

public class TestWrapper {

	public static void main(String[] args) {
		Integer i1=100;
		int data=i1;//data=i1.intValue();
		i1++;//auto un box Integer--int, inc, auto boxed
		System.out.println(i1);
		Integer i2=i1++;//assign , auto un boxing, inc , auto box
		Integer i3=++i1; //auto un boxing, inc ,assgn, auto box
		System.out.println(i2 +" "+i3);
		//Double d=123;//auto boxing int --->Integer ---X Double
	//	Double d2=123.45F;//float--->Float ---X --Double
		Number n=1231.45;//double--->Double---upcasting ---Number
		Object o=12345;//int -->Integer--NUmber--Object
		System.out.println(o.getClass().getName());
		o=false;//o=new Boolean(false);
		System.out.println(o.getClass().getName());
		float f1=123.45f;
	}
}
