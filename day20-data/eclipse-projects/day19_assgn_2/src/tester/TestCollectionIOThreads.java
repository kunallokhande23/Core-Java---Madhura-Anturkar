package tester;

import static utils.StudentCollectionUtils.*;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;

import runnables_tasks.DoBSorterTask;
import runnables_tasks.GPASorterTask;

public class TestCollectionIOThreads {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get sample map
			Map<String, Student> map = populateMap(populateList());
			System.out.println("Enter file name for storing gpa based details");
			// create task instance --attach it to a thrd
			// Thread(Runnable task, String name)
			Thread t1 = new Thread(new GPASorterTask(map, sc.nextLine()), "gpa_sorter");// t1 :NEW
			System.out.println("Enter file name for storing dob based details");
			// create task instance --attach it to a thrd
			// Thread(Runnable task, String name)
			Thread t2=new Thread(new DoBSorterTask(map, sc.nextLine()), "dob_sorter");//t2 : NEW
			//start thrds
			t1.start();
			t2.start();
			System.out.println("main waiting for child thrds to complete exec");
			t1.join();
			t2.join();
			System.out.println("main over....");
		} catch (Exception e) {
			System.out.println("err in main thread "+e);
		}

	}

}
