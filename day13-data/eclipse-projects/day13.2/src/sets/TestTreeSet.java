package sets;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		String[] names= {"Anish","Aseem","Priya","Shivani","Rajan","Mihir","Anish","Aseem"};
		LinkedList<String> list=new LinkedList<>();
		for(String s : names)
			list.add(s);
		System.out.println("list "+list);
		//HashSet(Collection<E> coll)
		TreeSet<String> hs=new TreeSet<>(list);
		System.out.println("TS "+hs);//un- ordered , BUT sorted set(Natural Ordering) , w/o dups !
			

	}

}
