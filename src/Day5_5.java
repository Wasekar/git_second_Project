import java.util.Arrays;
//print the array elements
//1. use normal for loop
//2. use advanced for loop
//3. Arrays.toString(name_of_an_array)

//eg. 
// arr[] ==> type int 
// arr.toString()  ==> hashcode ==> toString() will be called Object class
// arr ===> hashcode ==>toString() will be called from Object class
// Arrays.toString(arr) ==> contents will be displayed==> toString() from Arrays class from java.util 


public class Day5_5 {

	public static void main(String[] args) 
	{
		int arr[]= new int[]{10,20,30,40,50};
		System.out.println("Printing array elements using for loop");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" \t ");
		
		System.out.println("\n Printing the array elements using advanced for loop");
		
		//is used when we wish to traverse inside an array from start element till the end element
		
		
		//for each "element" of type "int" inside  array having a name "arr" 
		//we wish to print "element" 
		
		//element = arr[0]
		//element = arr[1]
		//element = arr[2]
		//element = arr[3]
		//element = arr[4]
		
		//element will start from arr[0]  till arr[n-1]
		
		for(int element:arr)
			System.out.print(element+"\t");
		
		
		System.out.println("\n Arr = "+arr);
		System.out.println("Arr = "+arr.toString());
		
		System.out.println(Arrays.toString(arr));

		
		
		
	}

}
