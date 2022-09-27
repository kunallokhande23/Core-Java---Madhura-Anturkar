package tester;

import java.util.Arrays;
import java.util.List;
import static utils.GenericUtils.printAnyList;

public class Test1 {

	public static void main(String[] args) {
		//fixed size Integer list
		List<Integer> intList=Arrays.asList(10,20,30,1,3,4,56);
		System.out.println("Integer List");
		printAnyList(intList);
		//fixed size Double list
		List<Double> doubles=Arrays.asList(10.0,20.3,30.7,1.7,3.0,4.3,56.67);//auto boxing
		System.out.println("Double List");
		printAnyList(doubles);
		//Can u say every Integer IS-A Number ? YES
		//Number n =Integer.valueOf(3456);
		//BUT Can u say  List<Integer> IS-A List<Number> : NO
		//Emp <---Mgr <---HRMgr
		//Emp e =new HRMgr(....);// no javac err 
		//List<Emp> emps=new ArrayList<>(); emps.add(e1);.....
		//List<HRMgr> mgrs=new AL<>();mgrs.add(hr1)......
		//emps=mgrs;//javac err!
		//Does inheritance work as exeptect in generic syntax ? NO
		// ? : wild card
		List<String> strings=Arrays.asList("one","two","three","four");
		System.out.println("String list");
		printAnyList(strings);
		
		

	}

}
