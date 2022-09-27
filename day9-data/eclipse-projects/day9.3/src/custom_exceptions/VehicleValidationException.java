package custom_exceptions;

@SuppressWarnings("serial")
public class VehicleValidationException extends Exception {
	public VehicleValidationException(String mesg) {
		super(mesg);
	}
}
