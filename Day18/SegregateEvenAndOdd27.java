package Day18;

import java.util.Arrays;
import java.util.Scanner;

public class SegregateEvenAndOdd27 {

	public static void segregateEvenAndOdd(int arr[]){
		int NoOfEvens=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				NoOfEvens++;
			}
		}
		int [] evenArray=new int[NoOfEvens];
		int [] oddArray=new int[arr.length-NoOfEvens];
		int evenIndex=0;
		int oddIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenArray[evenIndex++]=arr[i];
			}
			else{
				oddArray[oddIndex++]=arr[i];
			}
		}
		System.out.println("Even Numbers:"+Arrays.toString(evenArray));
		System.out.println("Odd Numbers:"+Arrays.toString(oddArray));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int sizeOfArray=sc.nextInt();
		int arr[]=fillArray(sizeOfArray,sc);
		System.out.println();
		System.out.println("given array:"+Arrays.toString(arr));
		segregateEvenAndOdd(arr);
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
