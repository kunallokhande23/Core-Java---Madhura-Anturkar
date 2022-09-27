package tester;

import java.util.Scanner;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class EventOrganizerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max event capacity");
		// D.S : array : Person[]
		Person[] participants = new Person[sc.nextInt()];// 100 , objs : 1 : array object
		int counter = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println(
					"Options : 1 . Register Student 2. Register Faculty 3. Display registered participant details "
							+ "4. Display particular participant's details 5. Invoke Participant specific func. 10.Exit");
			System.out.println("Choose your option");
			switch (sc.nextInt()) {
			case 1:
				if (counter < participants.length) {
					System.out.println("Enter student details : fn,  ln,  gradYear,  course,  fees,  marks)");
					participants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(),
							sc.nextDouble(), sc.nextInt());// up casting (Student ----> Person)
					System.out.println("student registered...");
				} else
					System.out.println("Event Full!!!!!!!!!!!!!!!!!!");

				break;

			case 2:
				if (counter < participants.length) {
					System.out.println("Enter faculty details : fn,  ln,  yrs of exp sme)");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());// up casting
																											// (Faculty
																											// ---->
																											// Person)
					System.out.println("Faculty registered...");
				} else
					System.out.println("Event Full!!!!!!!!!!!!!!!!!!");

				break;
			case 3:
				// {s1,s2,f1,s3,f2,s4,s5,null,.......null}
				System.out.println("Participants' details ");
				for (Person p : participants) // p=participants[0],p=participants[1].........p=participants[participants.length-1]
					if (p != null)
						System.out.println(p);// why no javac err(resolves it by type of the ref) : Person class :
												// toString ,
				// JVM : type of the object
				break;
			case 4:
				// {s1,s2,f1,s3,f2,s4,s5,null,.......null}
				System.out.println("Enter seat no");
				int index = sc.nextInt() - 1;
				if (index >= 0 && index < counter)
					System.out.println(participants[index]);// 3 : faculty's details , 1 --student details : eg of run
															// time poly.
				else
					System.out.println("Invalid seat no !!!!!!!!!!!!!!!");

				break;
			case 5:
				// // {s1,s2,f1,s3,f2,s4,s5,null,.......null}
				System.out.println("Enter seat no");
				index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) {
					Person p = participants[index];//copy of refs
					if (p instanceof Student)
						((Student) p).study();
					else
						((Faculty) p).teach();
				} else
					System.out.println("Invalid seat no !!!!!!!!!!!!!!!");

				break;

			case 10:
				exit = true;
				break;
			}
		}
		sc.close();

	}

}
