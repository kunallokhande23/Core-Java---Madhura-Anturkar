package tester;

import com.app.banking.JointBankAccount;

import runnable_tasks.CheckBalanceTask;
import runnable_tasks.UpdaterTask;

public class TestSharedResource {

	public static void main(String[] args) throws InterruptedException {
		// 1.  create joint a/c
		JointBankAccount acct=new JointBankAccount(10000);
		//create tasks -- attach thrds --- start thrds
		Thread t1=new Thread(new UpdaterTask(acct), "c1");//=> customer 1
		Thread t2=new Thread(new CheckBalanceTask(acct), "c2");//=> customer 1
		t1.start();
		t2.start();
		System.out.println("main waiting for child thrds....");
		t1.join();
		t2.join();
		System.out.println("main over....");
				

	}

}
