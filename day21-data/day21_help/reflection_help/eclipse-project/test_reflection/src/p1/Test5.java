package p1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		//create instance of the class whose name is supplied  @ run time by user (using def constr)
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter name of the class to create the instance");
			Class<?> cls=Class.forName(sc.next());
			Object newInstance = cls.newInstance();
			System.out.println(newInstance);//def inited state of the emp
			Class<Emp> cls2=Emp.class;
			//creating the instance of Emp class : Emp(int id, String name, double salary,double grade)
			//get required constr obj
			Constructor<Emp> constr=cls2.getConstructor(int.class,String.class,double.class,double.class);
			Emp newInstance2 = constr.newInstance(101,"abc",12345,7.8);
			System.out.println(newInstance2);//completely inited state of emp
			
			//get access to the desired method
			Method method=cls2.getDeclaredMethod("updateSalary",double.class);
			method.setAccessible(true);
			//Dyn method invocation : API of java.lang.reflect.Method class
			//public Object invoke(Object obj,Object... args)
			method.invoke(newInstance2,500);
			System.out.println("After update "+newInstance2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
