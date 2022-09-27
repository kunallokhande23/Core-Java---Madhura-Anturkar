package utils;

import java.util.Collection;
import java.util.List;

public class GenericUtils {
// Add a static method to print elements of any numeric type of the List.
	public static void printAnyList(List<?> nums) {
		for (Object n : nums)
			System.out.print(n + " ");
	}

	// Can you replace ? by T : YES !
//	public static <T> void printAnyList(List<T> nums)
//	{
//		for (T n : nums)
//			System.out.print(n+" ");			
//	}
	// Add a static method to compute salary of Collection of emps / mgr/ salesmgr /
	// tempworker.
//	public static void invokeComputeSalary(Collection<? extends Emp> anyCollection)
//	// Collection<? extends Emp> => ANY Collection(AL|LL|Vector|HS|LHS|TS) of which
//	// generic type : Emp or it's sub type ---Mgr,Worker....
//	{
//		for (Emp o : anyCollection)
//			o.computeSalary();
//	}
	//can above upper bounded wild  card be replaced by T ? YES
	public static <T extends Emp> void invokeComputeSalary(Collection<T> anyCollection)
	// Collection<? extends Emp> => ANY Collection(AL|LL|Vector|HS|LHS|TS) of which
	// generic type : Emp or it's sub type ---Mgr,Worker....
	{
		for (T o : anyCollection)
			o.computeSalary(); // retrieve : get => Collection acting as a Producer !
		//what will happen if u try to add any element to such a Producer ?
//		anyCollection.add(new Emp(100));
//		anyCollection.add(new Mgr(100));
//		anyCollection.add(new SalesMgr(100));
//		anyCollection.add(new Worker(100));
//		anyCollection.add(new Object());
		
		
	}
}
