package p1;

public class Test2 {

	public static void main(String[] args) {
		Printer[] printers= {new FilePrinter(),new ConsolePrinter(),new NetworkPrinter()};//objs : 1 (array) , 3 objs
		//eg of up casting
		for(Printer p : printers) {//up casting : p=printers[0] : CP ,....
			p.print("some mesg!!!!!"); //run time poly : achieved via i/f ref ---> imple class instance
		//	p.close();//javc err : since close() is not available in Printer type 
			if(p instanceof FilePrinter)
			((FilePrinter)p).close();
			else
				System.out.println("Not a file printer....");
		}
		
		

	}

}
