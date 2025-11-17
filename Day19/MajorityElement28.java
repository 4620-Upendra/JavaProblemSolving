package Day19;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement28 {
	public static void findMajorityEle(int []arr) {
		int majorityEle=arr[0];
		int majorityCount=1;
		for(int i=1;i<arr.length;i++) {
			if(i+1<arr.length) {
				int countEle=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						countEle++;
					}
				}
				if(countEle>arr.length/2){
					majorityEle=arr[i];
					majorityCount=countEle;
				}
			}
		}
		if(majorityCount>arr.length/2) {
			System.out.println("Majority element in given array:"+majorityEle);
		}
		else {
			System.out.println("No majority element in given array");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int sizeOfArray=sc.nextInt();
		int arr[]=fillArray(sizeOfArray,sc);
		System.out.println();
		System.out.println("given array:"+Arrays.toString(arr));
		findMajorityEle(arr);

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



//🔹 Meaning of Majority Element
//
//A majority element in an array or list is an element that appears more than half of the size of the array.
//->Formally, in an array of size n, a majority element occurs more than n/2 times.
//->If no element appears more than n/2 times, the array does not have a majority element.
//
//🔹 Examples
//1)Array: {3, 3, 4, 2, 3, 3, 3}
//->Array size = 7 → n/2 = 3.5
//->Element 3 appears 5 times (> 3.5) → ✅ Majority element = 3
//
//2)Array: {1, 2, 3, 4, 5}
//->Array size = 5 → n/2 = 2.5
//->No element appears more than 2.5 times → ❌ No majority element
//
//3)Array: {5, 5, 5, 1, 2}
//->Array size = 5 → n/2 = 2.5
//->Element 5 appears 3 times (> 2.5) → ✅ Majority element = 5
//
//🔹 Key Points
//->Must appear strictly more than half of the array size.
//->Can be only one majority element in an array.
//->Often used in voting problems, consensus algorithms, and array analysis.