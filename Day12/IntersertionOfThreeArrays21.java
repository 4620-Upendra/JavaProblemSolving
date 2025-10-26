package Day12;

import java.util.Arrays;
import java.util.Scanner;

public class IntersertionOfThreeArrays21 {
	
	public static void intersertionOfThreeArrays(int []arr1,int []arr2,int[]arr3) {
		int result[]=new int[commonEleInThreeArray(arr1,arr2,arr3)];
		if(result.length>0) {
			int count=0;
			for(int i=0;i<arr1.length;i++) {
				int same=1;
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i]==arr2[j]) {same++;}
					
				}
				for(int j=0;j<arr3.length;j++) {
					if(arr1[i]==arr3[j]) {same++;}
				}
				if(same==3) {result[count++]=arr1[i];}
			}
			System.out.println("common elements from three arrays:"+Arrays.toString(result));
		}
		else {
			System.out.println("no common elements:"+Arrays.toString(result));
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array1:");
		int sizeOfArray1=sc.nextInt();
		int arr1[]=fillArray(sizeOfArray1,sc);
		
		System.out.print("enter the size of array2:");
		int sizeOfArray2=sc.nextInt();
		int arr2[]=fillArray(sizeOfArray2,sc);
		
		System.out.print("enter the size of array3:");
		int sizeOfArray3=sc.nextInt();
		int arr3[]=fillArray(sizeOfArray3,sc);
		
		System.out.println();
		System.out.println("array1:"+Arrays.toString(arr1));
		System.out.println("array2:"+Arrays.toString(arr2));
		System.out.println("array3:"+Arrays.toString(arr3));
		System.out.println();
		intersertionOfThreeArrays(arr1,arr2,arr3);
	}
	
	public static int commonEleInThreeArray(int []arr1,int []arr2,int[]arr3) {
		int commonElements=0;
		for(int i=0;i<arr1.length;i++) {
			int same=1;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {same++;}
				
			}
			for(int j=0;j<arr3.length;j++) {
				if(arr1[i]==arr3[j]) {same++;}
			}
			if(same==3) {commonElements++;}
		}
		return commonElements;
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
