package p4;

import static utils.BankUtils.*;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.app.banking.BankAccount;

public class Test5 {

	public static void main(String[] args) {
		// get populated acctList of a/cs
		List<BankAccount> acctList = populateListFromMap(populateAccountMap());
		String s="hello";//string literal 
		int data=12345;//int literal
		//func literal ---assigning entire func def to a var.
		Comparator<BankAccount> acctComp=(a1,a2) ->((Double)a2.getBalance()).compareTo(a1.getBalance());
		System.out.println("orig ordered acctList");
		acctList.forEach(a -> System.out.println(a));
		acctList.sort(acctComp);
		System.out.println("Sorted acctList as per bal : desc ");
		acctList.forEach(a -> System.out.println(a));
		//remove all bank account details , having bal < 15,000
		//FP (declarative) : removeIf : Collection 
		Predicate<BankAccount> filter =a -> a.getBalance() < 15000;
		acctList.removeIf(filter);
		System.out.println("acctList after remove  ");
		acctList.forEach(a -> System.out.println(a));

	}

}
