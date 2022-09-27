package p1;

public class Test1 {

	public static void main(String[] args) {
		ConsolePrinter printer = new ConsolePrinter();// direct ref
		printer.print("Test Mesg....");
		Printer p;// p : interface type of the ref => can DIRECTLY (w/o type casting) refer to ANY
					// imple class instance , p : mem allocated in stack
		p = new ConsolePrinter();// indirect ref. : up casting 
		p.print("Another  Mesg....");// javac : chks in Printer i/f for print() --finds  no javac errs , JVM invokes
										// method print on ConsolePrinter's instance : run time poly.

	}

}
