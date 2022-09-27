package tester;

import java.util.Scanner;

import com.app.core.Customer;
import com.app.core.FixedStack;
import com.app.core.GrowableStack;
import com.app.core.Stack;

public class TestStack {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			// declare i/f type of ref var
			Stack ref = null;//IMPORTANT : i/f ref can DIRECTLY refer to ANY imple class instance
			while (!exit) {
				System.out.println("Options : 1 . Choose Fixed Stack 2. Choose Growable Stack 3. Push Data"
						+ "4 Pop Data 5.Exit ");
				System.out.println("Choose");
				switch (sc.nextInt()) {
				case 1:
					if (ref == null) // => user has not yet chosen the stack
					{
						ref = new FixedStack();// up casting
						System.out.println("You have chosen Fixed Stack");
					}
					else
						System.out.println("Stack is already chosen !!!!!!!!!!!!!!");
					break;

				case 2:
					if (ref == null) // => user has not yet chosen the stack
					{
						ref = new GrowableStack();
						System.out.println("You have chosen Growable Stack");
					}
					else
						System.out.println("Stack is already chosen !!!!!!!!!!!!!!");
					break;

				case 3:
					if (ref != null) {
						System.out.println("Enter customer details : id name adr");
						Customer c1 = new Customer(sc.nextInt(), sc.next(), sc.next());
						ref.push(c1);//IMPORTANT : no instanceof chking , no expl downcasting is needed --JVM resolves by type of the obj
						//JVM will auto call FS's push or GS's push suitably
						System.out.println("customer details stored .....");
					} else
						System.out.println("Please choose stack first !!!!!!!!!!!");
					break;
				case 4:
					if (ref != null) {
						Customer c = ref.pop();
						if (c != null)
							System.out.println(c);
					} else
						System.out.println("Please choose stack first !!!!!!!!!!!");
					break;
				case 5:
					exit = true;
					break;
				}
			}
		}

	}

}
