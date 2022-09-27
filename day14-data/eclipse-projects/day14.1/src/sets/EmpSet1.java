package sets;

import java.util.HashSet;

import com.app.core.Employee;

public class EmpSet1 {

	public static void main(String[] args) {
		Employee e1=new Employee("rnd-001", "Prasad",10000);
		Employee e2=new Employee("rnd-001", "Prasad",10000);
		Employee e3=new Employee("rnd-001", "Prasad",10000);
		HashSet<Employee> empSet=new HashSet<>();
		System.out.println("Added "+empSet.add(e1));//t
		System.out.println("Added "+empSet.add(e2));//t
		System.out.println("Added "+empSet.add(e3));//t
		System.out.println("Size "+empSet.size());//3
		for(Employee e : empSet)
			System.out.println(e);//dups !
		System.out.println("chking if the contract is followed");
		System.out.println(e1.equals(e2));//t
		System.out.println(e1.hashCode()+" "+e2.hashCode());//diff

	}

}
