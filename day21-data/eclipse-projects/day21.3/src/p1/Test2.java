package p1;

import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// different ways of accessing the loaded class info.
			// using class literal(static data member of Class)
			System.out.println("Enter the F.Q name of the class or interface");
			// #1
			Class<?> cls = Class.forName(sc.next());
			System.out.println(cls.getName());
			if (!cls.isInterface()) {
				// display the modifiers
				int modifiers = cls.getModifiers();
				System.out.println(Modifier.isPublic(modifiers) ? "Public" : "Pkg-private");
				System.out.println(Modifier.isAbstract(modifiers) ? "Abstract" : "Concrete");
				System.out.println(Modifier.isFinal(modifiers) ? "Final" : "Not final");
				// print the name of the super class
				System.out.println("super cls name " + cls.getSuperclass().getName());
				System.out.println("I/fs implemented");
				//c -> sop(c);
				Arrays.stream(cls.getInterfaces()).forEach(System.out::println);
				// OR
				// System.out.println(Arrays.toString(cls.getInterfaces()));
			} else {
				System.out.println("It's an i/f....");
				Arrays.stream(cls.getInterfaces()).forEach(System.out::println);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
