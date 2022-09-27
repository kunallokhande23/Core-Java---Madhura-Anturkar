package custom_excpetions;

@SuppressWarnings("serial")
public class SpeedOutOfRangeException extends Exception{
	public SpeedOutOfRangeException(String errMesg) {
		super(errMesg);
	}

}
