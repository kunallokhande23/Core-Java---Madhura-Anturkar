package tester;

import inheritance2.Faculty;
import inheritance2.Person;
import inheritance2.Student;

public class Test2 {

	public static void main(String[] args) {
		// Person :super class , Student n Faculty : sub classes
		// super class ref , super cls instance , sub class ref , sub class instance
		// direct referencing : since the type of ref n type of instance is SAME
		Student s1 = new Student("Anuja", "Pathak", 2020, "PG-DAC", 123456, 80);
		System.out.println(s1);// s1.toString() --uses inherited version (from Object)
		Person p;
		p = s1;// javac is adding implicit cast : up casting (this works : since Student IS-A
				// Person)
		System.out.println(p);// javac resolves the method binding by the type of the ref :
		// it chks is there a toString() in aperson class : YES : no javac errs
		// JVM resolves the method binding by : type of the instance => run time
		// poly(late binding)

		p = new Faculty("Raj", "Seth", 10, "DBT,Java,JS");//up casting
		System.out.println(p);//run time poly.

	}

}
