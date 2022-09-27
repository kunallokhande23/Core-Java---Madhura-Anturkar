package runnables_tasks;

import java.util.Map;

import com.app.core.Student;
import static utils.StudentCollectionUtils.sortStudentsByDob;
import static utils.IOUtils.storeStudentDetails;

public class DoBSorterTask implements Runnable {
	// state :
	private Map<String, Student> studentMap;
	private String fileName;

	public DoBSorterTask(Map<String, Student> studentMap, String fileName) {
		super();
		this.studentMap = studentMap;
		this.fileName = fileName;
		System.out.println("ctor invoked by " + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			//1 : sorting 2 : storing details
			storeStudentDetails(sortStudentsByDob(studentMap), fileName);
			System.out.println("DoB based sorted details stored ....");
			
		} catch (Exception e) {
			System.out.println("err in " + Thread.currentThread().getName() + " exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
