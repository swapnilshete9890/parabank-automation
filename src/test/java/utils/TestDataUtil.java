package utils;

import java.util.Random;

public class TestDataUtil {
	
	public static String generateUsername() 
	{
		return "user" + new Random().nextInt(1000);
	}

}
