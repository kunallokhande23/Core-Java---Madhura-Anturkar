package p1;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// Loads Emp.class in method area, JVM creates immutable instance for this
		// loaded class : empClass
		Class<Emp> empClass = Emp.class;
		System.out.println("All accessible fields");
		Arrays.stream(empClass.getFields()).forEach(System.out::println);

		System.out.println("All fields of Emp class");
		// display all fields of the specified class including private members (no
		// inherited members)
		Arrays.stream(empClass.getDeclaredFields()).forEach(System.out::println);

		// reflection info about constrs
		System.out.println("All constrs");
		Arrays.stream(empClass.getConstructors()).forEach(System.out::println);

		// reflection info about methods
		System.out.println("All Accessible n inherited Methods ");
		Arrays.stream(empClass.getMethods()).forEach(System.out::println);

		// reflection info about private methods
		System.out.println("All private n accessible  Methods  of the specfied class");
		Arrays.stream(empClass.getDeclaredMethods()).forEach(System.out::println);

	}

}
