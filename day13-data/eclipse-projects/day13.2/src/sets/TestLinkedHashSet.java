package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		String[] names= {"Anish","Aseem","Priya","Shivani","Rajan","Mihir","Anish","Aseem"};
		LinkedList<String> list=new LinkedList<>();
		for(String s : names)
			list.add(s);
		System.out.println("list "+list);
		//HashSet(Collection<E> coll)
		LinkedHashSet<String> hs=new LinkedHashSet<>(list);
		System.out.println(hs);//ordered , BUT un-sorted set , w/o dups !
			

	}

}
