package p4;

import static utils.BankUtils.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.app.banking.BankAccount;

public class Test4 {

	public static void main(String[] args) {
		// get populated list of a/cs
		List<BankAccount> list = populateListFromMap(populateAccountMap());
		System.out.println("orig ordered list");
		list.forEach(a -> System.out.println(a));
		// sort the a/cs as per their creation date in asc order.
		// Collections.sort(list, comp)//1st arg : list
		// 2nd arg : Comparator<? super T>
		// Is Comarator a func i/f ? YES , i.e it can be replaced by lambda expression.
		// which is SAM ? public int compare(T o1,T o2)
	//	Collections.sort(list, (a1, a2) -> a1.getCreationDate().compareTo(a2.getCreationDate()));
		//Replace Collections.sort By List's sort method
		list.sort((a1, a2) -> a1.getCreationDate().compareTo(a2.getCreationDate()));
		System.out.println("Sorted list as per date : asc ");
		list.forEach(a -> System.out.println(a));
		//display sorted bank accts as per desc balance
		list.sort((a1,a2) ->((Double)a2.getBalance()).compareTo(a1.getBalance()));
		System.out.println("Sorted list as per bal : desc ");
		list.forEach(a -> System.out.println(a));
		
		

	}

}
