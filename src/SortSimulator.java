import java.util.Random;


public class SortSimulator {
	public static void main(String[] args)
	{
		int unsortedArray[] = new int[100];
		
		SortSimulator.randomizeArray(unsortedArray);
		System.out.println("randomized..");
		HeapSort heapSort = new HeapSort(unsortedArray);
		heapSort.sort();
		SortSimulator.printArray(heapSort.sort());
		
		
		SortSimulator.randomizeArray(unsortedArray);
		System.out.println("randomized..");
		
		Quicksort qs = new Quicksort(unsortedArray);
		SortSimulator.printArray(qs.sort());
		
		SortSimulator.randomizeArray(unsortedArray);
		System.out.println("randomized..");
		
		BubbleSort bubbleSort = new BubbleSort(unsortedArray);
		SortSimulator.printArray(bubbleSort.sort());
		
		
		
		
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
		
		for(int j = arr[0]; j < arr.length;j++)
		{
			for(int i =j+1; i < arr.length;i++)
			{	
				if(arr[i]<arr[j])return false;
			}
		}
		return true;
	}
}
