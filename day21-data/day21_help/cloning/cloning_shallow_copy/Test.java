package cloning_shallow_copy;

public class Test {

	public static void main(String[] args) throws Exception{
		Student s1=new Student(100);// s1 ---> 1st student obj
		Address a1=new Address("pune");
		s1.setAdr(a1);
		System.out.println(s1);//100 pune
		//clone of s1
		Student s2=s1.clone();//new student obj created on the heap s2---> clone
		System.out.println(s2);//100 pune
		System.out.println(s1==s2);//false
		s1.setRollNo(200);//modifying the state of s1
		s1.getAdr().setCity("mumbai");
		System.out.println(s1);//200 Mumbai
		System.out.println(s2);//100 Mumbai

	}

}
