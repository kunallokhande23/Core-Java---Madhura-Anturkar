package p1;

public class ConsolePrinter implements Printer {
	//can imple class DIRECTLY(w/o using i/f name) access i/f constant ? YES 
	@Override
	public void print(String mesg) {
		System.out.println("printing a mesg : "+mesg+" on the console with speed = "+SPEED);
	}
}
