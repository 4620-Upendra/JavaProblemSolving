package Day17;
import java.util.Arrays;
import java.util.Scanner;

public class CountInversionsInArray26 {
	public static void countInversions(int arr[]) {
		int [] temp=Arrays.copyOf(arr, arr.length);
		Arrays.sort(temp);
		if(Arrays.toString(arr).equals(Arrays.toString(temp))) {
			System.out.println("Number of inversions: 0");
			System.out.print("Explanation: The array is already sorted -> no inversions");
			return;
		}
		int countOfInversions=0;
		String explaination="";
		for(int i=0;i<arr.length;i++) {
			if(i+1<arr.length) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						countOfInversions++;
						explaination+="("+arr[i]+","+arr[j]+") ";
					}
				}
			}
		}
		System.out.println("Number of inversions: "+countOfInversions);
		System.out.print("Explanation: "+explaination);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int sizeOfArray=sc.nextInt();
		int arr[]=fillArray(sizeOfArray,sc);	
		System.out.println("given array:"+Arrays.toString(arr));
		countInversions(arr);
	}
	
	public static int [] fillArray(int sizeOfArray,Scanner sc){
		int []arr=new int[sizeOfArray];
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter "+i+" index element of array:");
			arr[i]=sc.nextInt();
		}
		return arr;
	}

}



//🧩 Question 26: Count Inversions in an Array
//💡 Problem Statement
//An inversion in an array is a pair of elements (arr[i], arr[j]) such that:
//i < j and arr[i] > arr[j]
//Your task is to count the total number of such inversion pairs in the array.
//🧠 Explanation
//Inversions indicate how far the array is from being sorted.
//A sorted array has 0 inversions.
//The more unsorted an array is, the higher the inversion count.
//
//🧮 Sample Input and Output
//Example 1
//Input:Array: [1, 2, 3, 4, 5]
//Output:Number of inversions: 0
//Explanation:The array is already sorted → no inversions.
//
//Example 2
//Input:Array: [5, 4, 3, 2, 1]
//Output:
//Number of inversions: 10
//Explanation:All pairs are inverted:
//(5,4), (5,3), (5,2), (5,1), (4,3), (4,2), (4,1), (3,2), (3,1), (2,1)
//
//Example 3
//Input:Array: [2, 4, 1, 3, 5]
//Output:Number of inversions: 3
//Explanation:Inversion pairs → (2,1), (4,1), (4,3)
//
//Example 4
//Input:Array: [8, 4, 2, 1]
//Output:Number of inversions: 6
//Explanation:
//(8,4), (8,2), (8,1), (4,2), (4,1), (2,1)
//
//Example 5
//Input:Array: [3, 1, 2]
//Output:Number of inversions: 2
//Explanation:
//(3,1) and (3,2)