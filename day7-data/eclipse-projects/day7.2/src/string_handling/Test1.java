package string_handling;

public class Test1 {

	public static void main(String[] args) {
		 String s=new String("hello how are you ?");
		s.concat("testing strings !!!!!");
		System.out.println(s);
		s += "12345"; //s = s+"12345";
		System.out.println(s);//hello how are you ?12345
		String s1=s.toUpperCase();
		System.out.println(s);//hello how are you ?12345
		System.out.println(s1);//upper cased 
		System.out.println(s.replace('h','t'));//replaced char string
		System.out.println(s);//orig : hello how are you ?12345

	}

}
