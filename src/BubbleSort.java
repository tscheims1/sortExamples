
public class BubbleSort {
	private int []list;
	
	BubbleSort(int []list)
	{
		this.list = list;
	}
	public int[] sort()
	{
		
		for(int i = list.length-1; i > 0;i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(list[j] > list[i])
				{
					int tmp = list[j];
					list[j] = list[i];
					list[i] = tmp;
				}
			}
		}
		return list;
	}

}
