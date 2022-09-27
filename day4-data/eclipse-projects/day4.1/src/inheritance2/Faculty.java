package inheritance2;

public class Faculty extends Person{
//additional state
	private int yrsOfExperience;
	private String sme;
	public Faculty(String fn1,String ln1,int yrs,String sme) {
		super(fn1,ln1);
		System.out.println(3);
		this.yrsOfExperience=yrs;
		this.sme=sme;		
	}
	@Override
	public String toString()
	{
		return "Faculty "+super.toString()+" training for "+yrsOfExperience+" yrs , expert in "+sme;
	}
}
