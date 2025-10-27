package Day13;

import java.util.Arrays;
import java.util.Scanner;

public class CountPairsWithGivenSum22 {
	public static int countPairsWithGivenSum(int [] arr,int sum) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]+arr[j]==sum) {
						count++;
					}
				}
			}
		}
		 return count / 2;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int sizeOfArray=sc.nextInt();
		int arr[]=fillArray(sizeOfArray,sc);
		System.out.println(Arrays.toString(arr));
		
		System.out.print("enter target sum value:");
		int sum=sc.nextInt();
		

		System.out.print("Count of pairs with given sum: " + countPairsWithGivenSum(arr,sum));
		
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


//📥 Sample Input and Output
//
//Input 1:
//Enter the size of array:5
//Enter array elements:1 5 7 -1 5
//Enter target sum:6
//
//Output 1:
//Count of pairs with given sum: 3
//Explanation:
//The pairs that add up to 6 are:
//(1, 5), (7, -1), and (1, 5 again).
//So total count = 3 pairs.
//
//Input 2:
//Enter the size of array:5
//Enter array elements:1 2 3 4 3
//Enter target sum:6
//
//Output 2:
//Count of pairs with given sum: 2
//Explanation:
//Pairs are (2, 4) and (3, 3).
