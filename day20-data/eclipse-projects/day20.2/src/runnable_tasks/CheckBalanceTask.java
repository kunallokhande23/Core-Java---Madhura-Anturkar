package runnable_tasks;

import com.app.banking.JointBankAccount;

public class CheckBalanceTask implements Runnable {
	private JointBankAccount jointAccount;

	public CheckBalanceTask(JointBankAccount jointAccount) {
		super();
		this.jointAccount = jointAccount;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while (true) {
				synchronized (jointAccount) {
					double bal = jointAccount.checkBalance();
					if (bal != 10000) {
						System.out.println("WRONG BALANCE!!!!!!!!!!!!!!!!!");
						System.exit(-1);// terminating JVM
					}
				}

				Thread.sleep(50);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " got over");

	}

}
