package classloaders;

import java.sql.Date;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Tracing classloader hierarchy");
		System.out.println("Test1's  class loader "+Test1.class.getClassLoader());
		System.out.println("It's Parent  class loader "+Test1.class.getClassLoader().getParent());
		System.out.println("It's ultimate parent : Bootstrap  class loader "+Test1.class.getClassLoader().getParent().getParent());
		System.out.println("Checking which classes loaded by which class loader");
		System.out.println("java.sql.Date loaded by "+Date.class.getClassLoader());
		System.out.println("java.util.LinkedList loaded by "+LinkedList.class.getClassLoader());
		
	}

}
