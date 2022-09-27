package inheritance;

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
	//add teach() :display  last name teaching for last .....yrs
	public void teach()
	{
		System.out.println(getLastName()+" teaching for last "+yrsOfExperience+" years...");
	}
	
}
