package generic;

public class TestMe {

	public static void main(String[] args) {
		// create generic Holder class instance to hold an integer , val=1234
		Holder<Integer> h1 = new Holder<>(1234);// <> => type of the RHS is deduced by javac from the type of LHS
		//impl conversion : int ---> Integer : auto boxing
		int data=h1.getRef();//impl conversion : Integer --> int : auto un boxing
		// create another generic Holder class instance to hold a string : "hello"
		Holder<String> h2=new Holder<>("hello");//impl conversions : NONE
		String s=h2.getRef();//no impl conversion , no need of expl down casting!
//		h1=h2;//type mismatch errs are detected @ compile time!!!!!

	}

}
