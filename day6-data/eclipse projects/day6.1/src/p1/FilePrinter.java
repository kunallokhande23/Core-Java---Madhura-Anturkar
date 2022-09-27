package p1;

public class FilePrinter implements Printer {

	@Override
	public void print(String mesg) {
		System.out.println("saving a mesg : "+mesg+" in file ,  with speed = "+SPEED);

	}
	//imple class specific func
	public void close()
	{
		System.out.println("closing file ...");
	}

}
