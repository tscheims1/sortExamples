
public class HeapSort {
	private int []array;
	
	HeapSort(int[]array)
	{
		this.array = array;
	}
	public int[] sort()
	{
		for(int i = 0; i < array.length;i++)
		{
			upHeap(i);
		}/*
		for(int i = array.length-1; i >= 0;i--)
		{
			swap(0,i);
			downHeap(0,i);
		}*/
		return array;
	}
	private void upHeap(int i)
	{
		int parent = 0;
		while(i >0)
		{
			parent = (i-1)/2;
			if(array[parent] < array[i])swap(parent,i);
			i = parent;
			
		}
	}
	private void downHeap(int i, int length)
	{
		
		int leftChild = i*2+1;
		int rightChild = i*2+2;
		
		/*while(leftChild > length)
		{
			
		}*/
		
		if(rightChild <= length && array[rightChild] <= array[leftChild] && array[leftChild]> array[i])
		{
			swap(leftChild,i);
			downHeap(leftChild,length);
		}
		if(leftChild <= length && array[rightChild] > array[leftChild] && array[rightChild] > array[i])
		{
			swap(rightChild,i);
			downHeap(rightChild,length);
		}
		
		
	}
	private void swap(int a,int b)
	{
		int temp = this.array[a];
		this.array[a] = this.array[b];
		this.array[b] = temp;
		 
	}
}
