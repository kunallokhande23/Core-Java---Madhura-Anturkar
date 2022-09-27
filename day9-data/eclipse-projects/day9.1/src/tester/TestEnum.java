package tester;

import com.app.core.Category;
import com.app.core.Color;

public class TestEnum {

	public static void main(String[] args) {
		Color.values();//Color[]
		Category.values();//Category[]
		 int data=12345;
		System.out.println(data);
		data += 10;
		String s=new String("abcdefgh");// "abcdefgh" : SCP , "abcdefgh" : non literal : heap
		s.toUpperCase();
		s.concat("314534");
		System.out.println(s);
		StringBuilder sb=new StringBuilder("test");//1 : litral string added in SCP , 2 : sb
		StringBuilder sb1=sb.insert(0, false);
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb == sb1);
	}

}
