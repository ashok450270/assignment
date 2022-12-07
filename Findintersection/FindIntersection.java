package Findintersection;

public class FindIntersection {
	public static void main(String[] args) 
	{
		int arr[]= {5,3,12,2,6,7};
		int arr1[]= {1,2,8,4,7,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
		{
				if(arr[i]==arr1[j])
				{
				System.out.println(arr[i]);

				}
					
		}
		}

	}

}
