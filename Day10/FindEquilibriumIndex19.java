package Day10;

import java.util.Arrays;
import java.util.Scanner;

public class FindEquilibriumIndex19 {
	public static int findEquilibriumIndex(int []arr) {
		int leftSum=0;
		for(int i=0;i<arr.length;i++) {
			if(i+1<arr.length) {
				int rightSum=0;
				for(int j=i+1;j<arr.length;j++) {
					rightSum+=arr[j];
				}
				if(leftSum==rightSum) {
					return i;
				}
				leftSum+=arr[i];
			}			
		}
		return -1;
	}
	public static int [] fillArray(int sizeOfArray,Scanner sc){
		
		int []arr=new int[sizeOfArray];
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter "+i+" index element of array:");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
//		int arr[]=new int[]{1, 3, 5, 2, 2};
//		int arr[]=new int[]{2, 3, -1, 8, 4};
//		int arr[]=new int[]{1, 2, 3};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int sizeOfArray=sc.nextInt();
		int arr[]=fillArray(sizeOfArray,sc);
		System.out.println("given array:"+Arrays.toString(arr));
		if(findEquilibriumIndex(arr)!=-1) {
			System.out.println("Equilibrium index of given array:"+findEquilibriumIndex(arr));
		}
		else {
			System.out.println("No equilibrium index");
		}
	}

}
