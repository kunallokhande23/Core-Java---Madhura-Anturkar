package cloning_deep_copy;

public class Address implements Cloneable{
	private String city;

	public Address(String city) {
		super();
		this.city = city;
	}
	

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "city=" + city;
	}


	@Override
	public Address clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Address) super.clone();
	}
	
	

}
