package sets;

import java.util.HashSet;
import java.util.LinkedList;

public class TestHashSet {

	public static void main(String[] args) {
		String[] names= {"Anish","Aseem","Priya","Shivani","Rajan","Mihir","Anish","Aseem"};
		LinkedList<String> list=new LinkedList<>();
		for(String s : names)
			list.add(s);
		System.out.println("list "+list);
		//HashSet(Collection<E> coll)
		HashSet<String> hs=new HashSet<String>(list);
		System.out.println(hs);//un ordered , un sorted set , w/o dups !
			

	}

}
