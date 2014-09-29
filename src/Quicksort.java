import java.util.Random;


public class Quicksort {
	
	private int list[];
	private Random random = new Random();
	
	Quicksort(int [] list)
	{
		this.list = list;
		
		
	}
	public int[]sort()
	{
		quicksort(0,list.length-1);
		return list;
	}
	private void quicksort(int left,int right)
	{
		if(left < right)
		{
			int pivot = partition(left,right);
			
			quicksort(left,pivot-1);
			quicksort(pivot+1,right);
			
		}
	}
	private int partition(int start, int end)
	{
		int left = start;
		int right = end-1;
		/*
		 * choose random pivot element
		 */
		if(start< end)
		{
			int index = random.nextInt(end-start)+start;
			int tmp= this.list[index];
			this.list[index] = list[end];
			list[end] = list[index];
			
		}
		int pivot = this.list[end];
		
		
		do{
			//Search on the left side a element that is bigger than the pivot element
			while( list[left] <= pivot && left< end)left++;
			
			
			//Search on the right side a element that is smaller than the pivot element
			while(list[right]>= pivot && right > start)right--;
			
			if(left < right)
			{
				int tmp = list[left];
				list[left] = list[right];
				list[right] = tmp;
			}
			
			
			
		}while(left < right);
		
		
		if(list[left] > pivot){
			int tmp = list[left];
			 list[left] = list[end];
			 list[end] = tmp;
		}
		
		return left;
	}
	
	

}
