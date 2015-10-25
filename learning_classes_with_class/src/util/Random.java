package util;

public class Random {
	public static int genRandomInt(int start, int end) { //gen new random int between start and end (including)
		java.util.Random random = new java.util.Random();
		
		return random.nextInt(end - start + 1) + start;
	}
	
	public static boolean genRandomBoolean() {
		return (genRandomInt(0, 1) == 0) ? false : true;
	}
}
