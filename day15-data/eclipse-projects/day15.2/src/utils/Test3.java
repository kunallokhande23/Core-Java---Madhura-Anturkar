package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import static utils.GenericUtils.invokeComputeSalary;

public class Test3 {

	public static void main(String[] args) {
		// AL<Emp> , Vector<Worker> , LinkedList<Mgr>, HS<Mgr> , TS<SalesMgr>
		ArrayList<Emp> emps = new ArrayList<>(Arrays.asList(new Emp(1000), new Emp(2000), new Emp(3000)));
//		emps.remove(0);
//		for(Emp e : emps)
//			System.out.println(e);
		invokeComputeSalary(emps);// What does javac chk ? : AL IS-A Collection : yes , generic type : ? extends
									// Emp ---Emp
		//TS<SalesMgr>
		//TreeSet(Collection c)
		TreeSet<SalesMgr> mgrs=new TreeSet<>(Arrays.asList(new SalesMgr(15000),new SalesMgr(5500),new SalesMgr(6000)));
//		for(SalesMgr m : mgrs)
//			System.out.println(m);
		System.out.println("invoking compute sal of SalesMgrs");
		invokeComputeSalary(mgrs);
		
	}

}
