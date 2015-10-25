package util;

public class Random {
	public static int genRandom(int start, int end) { //gen new random int between start and end (including)
		java.util.Random random = new java.util.Random();
		
		return random.nextInt(end - start + 1) + start;
	}
}
