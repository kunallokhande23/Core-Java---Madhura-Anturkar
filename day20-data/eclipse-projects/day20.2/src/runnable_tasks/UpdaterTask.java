package runnable_tasks;

import com.app.banking.JointBankAccount;

public class UpdaterTask implements Runnable {
	private JointBankAccount jointAccount;

	public UpdaterTask(JointBankAccount jointAccount) {
		super();
		this.jointAccount = jointAccount;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while (true) {
				synchronized (jointAccount) {
					jointAccount.updateBalance(1000);
				}
				Thread.sleep(100);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " got over");

	}

}
