import java.util.Random;


public class SortSimulator {
	public static void main(String[] args)
	{
		int unsortedArray[] = new int[50];
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
		if(SortSimulator.isSorted(arr))
			System.out.println("Fehlerfrei sortiert");
		else
			System.out.println("Fehler beim Sortieren aufgetreten...");
		
	}
	public static boolean isSorted(int []arr)
	{
		if(arr.length ==0)return true;
		int startValue = arr[0];
		for(int i =1; i < arr.length;i++)
		{
			if(arr[i]<startValue)return false;
		}
		return true;
	}
}
