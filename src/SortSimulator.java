import java.util.Random;


public class SortSimulator {
	public static void main(String[] args)
	{
		int unsortedArray[] = new int[1000];
		SortSimulator.randomizeArray(unsortedArray);
		System.out.println("randomized..");
		
		Quicksort qs = new Quicksort(unsortedArray);
		SortSimulator.printArray(qs.sort());
		
	}
	public static void randomizeArray(int []array)
	{
		Random r = new Random();
		for(int i =0; i < array.length;i++)
		{
			array [i] = r.nextInt(array.length);
		}
	}
	public static void printArray(int []arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
