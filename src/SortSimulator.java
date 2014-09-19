import java.util.Random;


public class SortSimulator {
	public static void main(String[] args)
	{
		int unsortedArray[] = new int[1000];
		SortSimulator.randomizeArray(unsortedArray);
		
	}
	public static void randomizeArray(int []array)
	{
		Random r = new Random();
		for(int i =0; i < array.length;i++)
		{
			array [i] = r.nextInt(array.length);
		}
	}
}
