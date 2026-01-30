import java.util.Arrays;
 class Array{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		System.out.println("using tostring");
		System.out.println(Arrays.toString(arr));
		System.out.println("using for loop");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("using fore each loop");
		for(int num:arr)
		{
			System.out.println(num);
		}
		System.out.println("reverse an array");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("find the max element");
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
		
		