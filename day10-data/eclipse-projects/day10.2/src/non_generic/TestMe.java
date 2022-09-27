package non_generic;

public class TestMe {

	public static void main(String[] args) {
		// create Holder class instance to hold an integer , val=1234
		Holder h1=new Holder(1234);//int ---> Integer (auto boxing) --> Object
		System.out.println(h1.getClass());//non_generic.Holder
		System.out.println(h1.getRef().getClass());//java.lang.Integer
		int data=(Integer)h1.getRef();//down casting : prog , auto un boxing : javac 
		// create another Holder class instance to hold a string : "hello"
		Holder h2=new Holder("hello");//string ---> object : up casting
		System.out.println(h2.getClass());
		System.out.println(h2.getRef().getClass());
		String s=(String)h2.getRef();//prog : expl down casting
		h1=h2;//no err : since h1 n h2 : HOlder 
		data=(Integer)h1.getRef();//class cast exc : String can't be cast to Integer!
		
		
		
		

	}

}
