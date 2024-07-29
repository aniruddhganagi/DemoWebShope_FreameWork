package genriclibary;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {

	public static int getRandomNumber() {
		Random r=new Random();
		return r.nextInt(5000);
	}
	
public static String getTimeStamp() {
	LocalDateTime datal=LocalDateTime.now();
	String date=datal.toString().replace(":", "-");
	return date;
}
	}
