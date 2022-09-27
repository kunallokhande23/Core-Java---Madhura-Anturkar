package generic;
//Create a Holder class , that can hold ANY data type (primitive/ref type)
public class Holder<T> {
	//T : type of the ref. : can you add primitive type here ? NO  , ref type : supported
//state : should be able to refer to ANY type in java
	private T ref;

	public Holder(T ref) {
		super();
		this.ref = ref;
	}

	public T getRef() {
		return ref;
	}	
	
}
