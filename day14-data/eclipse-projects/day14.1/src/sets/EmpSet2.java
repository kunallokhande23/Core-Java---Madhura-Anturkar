package sets;

import java.util.HashSet;

import com.app.core.Employee;

public class EmpSet2 {

	public static void main(String[] args) {
		Employee e1=new Employee("rnd-001", "Prasad",10000);
		Employee e2=new Employee("rnd-001", "Priya",20000);
		Employee e3=new Employee("rnd-001", "Seema",13000);
		Employee e4=new Employee("rnd-010", "Riya",19000);
		Employee e5=new Employee("rnd-008", "Ajit",18000);
		Employee e6=new Employee("rnd-003", "Raj",17000);
		Employee e7=new Employee("rnd-005", "Arpit",17000);
		HashSet<Employee> empSet=new HashSet<>();
		System.out.println("Added "+empSet.add(e1));//t , hC :1 eq: 0
		System.out.println("Added "+empSet.add(e2));//f , hC : 1 eq: 1 
		System.out.println("Added "+empSet.add(e3));//f hC :1 eq: 1
		System.out.println("Added "+empSet.add(e4));//t  hC : 1 eq: 1
		System.out.println("Added "+empSet.add(e5));//t hC : 1 eq: 2
		System.out.println("Added "+empSet.add(e6));//t hC : 1 eq: 3
		System.out.println("Added "+empSet.add(e7));//t , hC : 1 eq: 4
		System.out.println("Size "+empSet.size());//4
		for(Employee e : empSet)
			System.out.println(e);//dups !
		System.out.println("chking if the contract is followed");
		System.out.println(e1.equals(e2));//t
		System.out.println(e1.hashCode()+" "+e2.hashCode());//same

	}

}
