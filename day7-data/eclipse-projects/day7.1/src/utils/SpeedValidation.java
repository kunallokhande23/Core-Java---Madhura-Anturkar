package utils;

import custom_excpetions.SpeedOutOfRangeException;

public class SpeedValidation {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED=30;
		MAX_SPEED=80;
	}
//add a static method for validating speed
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException
	{
		if(speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too Slow !!!!!!");
		//=> speed >- min speed
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("You are driving too FAST , FATAL !!!!!!");
			
		//=> within range
		System.out.println("speed within range....");
	}
}
