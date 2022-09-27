package p4;
import static utils.BankUtils.populateAccountMap;

import java.util.Map;

import com.app.banking.BankAccount;
public class Test3 {

	public static void main(String[] args) {
		// get populated map of a/cs
		Map<Integer, BankAccount> accountMap = populateAccountMap();
		//display all a/c details --values()
		//imerative style 
//		for (BankAccount a : accountMap.values())
//			System.out.println(a);
		//display acct no n a/c details : using FP (declarative style)
		//Map i/f : public default void forEach(BiConsumer<? super K,? super V> action)
		//SAM of BiConsumer i/f : public void accept(K k,V v)
		accountMap.forEach((k,v) -> System.out.println(k+":"+v));
	

	}

}
