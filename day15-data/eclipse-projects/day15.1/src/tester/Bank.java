package tester;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.app.banking.AcType;
import com.app.banking.BankAccount;

import custom_exceptions.BankingException;

import static utils.BankUtils.populateAccountMap;
import static com.app.banking.AcType.*;
import static java.time.LocalDate.parse;
import static utils.BankingValidationRules.validateBalance;
import static java.util.Map.Entry;

public class Bank {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, BankAccount> accountMap = populateAccountMap();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Create A/C 2.Display All a/c details 3. Display A/C Summary "
						+ "4. Funds Transfer 5.Close A/C "
						+ "6.Display a/c holder's name of the specified type of the account "
						+ "7.Display balance of a/cs created between specific dates "
						+ "8. Display a/c nos n details in single iteration 10. Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter A/C No");
						int acctNo = sc.nextInt();
						if (accountMap.containsKey(acctNo))// int ---> INteger --> Object
							throw new BankingException("Dup A/C No !!!!!!!!!!!!!!!!!!!");
						// => no dup
						System.out.println("Enter customerName,  type,  creationDate(yr-mon-day),  balance");
						accountMap.put(acctNo,
								new BankAccount(acctNo, sc.next(), AcType.valueOf(sc.next().toUpperCase()),
										parse(sc.next()), validateBalance(sc.nextDouble())));
						System.out.println("a/c created successfully!");
						break;
					case 2:
						System.out.println("All A/C Details");
						for (BankAccount a : accountMap.values())
							System.out.println(a);
						break;
					case 3:
						System.out.println("Enter acct no");
						BankAccount acct = accountMap.get(sc.nextInt());
						if (acct == null)
							throw new BankingException("Invalid A/C No : A/C Not Found !!!!!!!!!!!!!!!");
						System.out.println("A/C Summary " + acct);
						break;
					case 4:
						System.out.println("Enter src a/c no dest a/c amount");
						BankAccount src = accountMap.get(sc.nextInt());
						if (src == null)
							throw new BankingException("Invalid Src A/C No : A/C Not Found !!!!!!!!!!!!!!!");
						BankAccount dest = accountMap.get(sc.nextInt());
						if (dest == null)
							throw new BankingException("Invalid Dest A/C No : A/C Not Found !!!!!!!!!!!!!!!");
						// src n dest a/cs exist !
						src.fundsTransfer(dest, sc.nextDouble());
						System.out.println("funds transferred....");

						break;
					case 5:
						System.out.println("Enter a/c no for closing");
						acct = accountMap.remove(sc.nextInt());
						if (acct == null)
							throw new BankingException("Invalid A/C No : Can't Close the A/C");
						System.out.println("Close A/C : " + acct);
						break;
					case 6:
						System.out.println("Enter a/c type");
						AcType type = valueOf(sc.next().toUpperCase());
						for (BankAccount a : accountMap.values())
							if (a.getType() == type)
								System.out.println(a.getCustomerName());
						break;
					case 7:
						System.out.println("Enter begin n end dates : yr-mon-day");
						LocalDate begin = parse(sc.next());
						LocalDate end = parse(sc.next());
						System.out.println("Printing balance of a/c created between " + begin + " and " + end);
						for (BankAccount a : accountMap.values())
							if (a.getCreationDate().isAfter(begin) && a.getCreationDate().isBefore(end))
								System.out.println(a.getBalance());
						break;
					case 8:
						System.out.println("Displaying key n value from the map , in a single iteration");
						for(Entry<Integer, BankAccount> e : accountMap.entrySet())
							System.out.println(e.getKey()+":"+e.getValue());						
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					// System.out.println(e);
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
