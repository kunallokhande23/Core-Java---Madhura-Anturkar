package strings;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println("Contents " + sb1);// hello
		System.out.println("len=" + sb1.length() + " capa " + sb1.capacity());// 5 21
		StringBuilder sb2 = sb1.append("123456");
		System.out.println(sb1); // hello123456
		System.out.println(sb2);// hello123456
		System.out.println(sb1 == sb2);// true
		sb2 = sb1.append(true).append(123.45).append("another string").append(34.56f);// sb1 , sb2 --> appended
																						// StringBuilder
		System.out.println(sb1);//appended
		System.out.println(sb2);//appended
		System.out.println(sb1 == sb2);//t
		System.out.println(sb1.length() + " " + sb1.capacity());//len=... capa=44
		sb1.insert(0, 234.5678F);
		System.out.println(sb1);//234.5678hello.....
		sb1.delete(0,8);
		System.out.println(sb1);
		StringBuilder sb3=new StringBuilder("12345");
		StringBuilder sb4=new StringBuilder("12345");
		System.out.println(sb3==sb4);//false
		System.out.println(sb3.equals(sb4));//false
		

	}

}
