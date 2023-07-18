
public class Find2Highest 
{
	public static void main(String[] args) 
	{
		int arr[]= {100,14,46,47,94,94,52,86,36,94,89};
		int i,t=0,j;
		for (i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j])
			{
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
			
		}
		System.out.println("Second highest element is  "+arr[arr.length-2]);
		
	}
}