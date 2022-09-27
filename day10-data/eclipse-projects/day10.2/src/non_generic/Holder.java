package non_generic;
//Create a Holder class , that can hold ANY data type (primitive/ref type)
public class Holder {
//state : should be able to refer to ANY type in java
	private Object ref;

	public Holder(Object ref) {
		super();
		this.ref = ref;
	}

	public Object getRef() {
		return ref;
	}	
	
}
