package var_args;

public class Test1 {

	public static void main(String... args) {
		System.out.println("testMe : with no args");
		testMe();
		Animal[] myPets= {new Dog("Pluto"),new Cat("Mini"),new Horse("Speedy")};//4 objects
		System.out.println("testMe : with []");
		testMe(myPets);
		System.out.println("testMe : with , separated animals");
		testMe(new Dog("Pluto1"),new Cat("Mini2"),new Horse("Speedy3"));

	}
	//add a method using var-args 
	private static void testMe(Animal...  animals)
	{
		for(Animal a : animals)
			System.out.println(a.getName());
	}

}
