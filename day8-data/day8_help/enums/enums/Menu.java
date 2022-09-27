package enums;

public enum Menu {
	SOUP(100),RICE(150),NOODLES(180),DIMSUM(120);
	static {
		System.out.println("in static init block of enum");
		System.out.println(SOUP);
	}
	private int price;
	Menu(int price) {
		//super(name(),ordinal());
		System.out.println("in paramed constr");
		this.price=price;
	}
	@Override
	public String toString()
	{
		return name()+" @ "+price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	/*@Override
	public boolean equals(Object o)
	{
		return true;
	}*/
}
