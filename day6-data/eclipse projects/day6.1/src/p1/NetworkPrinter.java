package p1;

public class NetworkPrinter implements Printer {

	@Override
	public void print(String mesg) {
		System.out.println("sending  a mesg to network printer : "+mesg+"  with speed = "+SPEED);

	}

}
