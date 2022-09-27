package strings;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		String s1="testing strings is easy strings";
		System.out.println(s1.charAt(0)+" "+s1.charAt(s1.length()-1));
		String[] names= {"Mihir","Nikhil","Meetali","Rohan","Mahesh","Ravi","Mihir"};
		System.out.println(names[0].compareTo(names[2]));// >0 
		System.out.println(names[1].compareTo(names[2])); // > 0
		System.out.println(names[0].compareTo(names[4]));// > 0
		System.out.println(names[5].compareTo(names[3]));//<0
		System.out.println(names[0].compareTo(names[6]));//0
		System.out.println(s1.contains("Easy"));//t /f 
		System.out.println(s1.startsWith("test")+" "+s1.endsWith("!!!!!!!!!"));//t f
		System.out.println(s1.indexOf("strings")+" "+s1.lastIndexOf("strings23432"));//8 -1
		String s2="Mihir Nikhil,Meetali,Rohan,Mahesh,Ravi";
		//how to split these names using ","
		System.out.println(Arrays.toString(s2.split(",")));//Mihir,Nikhil,Meetali,Rohan,Mahesh,Ravi]
		System.out.println(s2.substring(6));
		System.out.println(s2.substring(0,5));

	}

}
