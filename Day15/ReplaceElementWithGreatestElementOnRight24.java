package Day15;
import java.util.Arrays;
import java.util.Scanner;
//24.	Replace every element with next greatest

public class ReplaceElementWithGreatestElementOnRight24 {
	public static int [] replaceElementWithGreatestOnRight(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(i+1<arr.length) {
				int max=arr[i+1];
				for(int j=i+1;j<arr.length;j++) {
						if(max<arr[j]) {
							max=arr[j];
						}			
				}
				arr[i]=max;
			}
		}
		arr[arr.length-1]=-1;
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int sizeOfArray=sc.nextInt();
		int arr[]=fillArray(sizeOfArray,sc);
		System.out.println("given array:"+Arrays.toString(arr));
		arr=replaceElementWithGreatestOnRight(arr);
		System.out.println("After replacing every element with the next greatest element, the resulting array is: ");
		System.out.println( Arrays.toString(arr));

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





//24.	Replace every element with next greatest
//You are given an array of numbers.
//For each number, you have to replace it with the biggest (largest) number that appears to the RIGHT of it in the array.
//The last number becomes -1 because there is no number to its right.
//
//🎯 Example to understand
//Array:[16, 7, 3, 9, 5, 2]
//
//How to think:
//->Look at 16 → What is the greatest number to the right of it?
//Right side: 7, 3, 9, 5, 2 → biggest is 9
//So 16 becomes 9.
//
//->Look at 7 → Right side: 3, 9, 5, 2 → biggest is 9
//So 7 becomes 9.
//
//->Look at 3 → Right side: 9, 5, 2 → biggest is 9
//So 3 becomes 9.
//
//->Look at 9 → Right side: 5, 2 → biggest is 5
//So 9 becomes 5.
//
//->Look at 5 → Right side: 2 → biggest is 2
//So 5 becomes 2.
//
//->Look at 2 → NO numbers on the right → becomes -1
//✅ Final output:
//[9, 9, 9, 5, 2, -1]


//examples:
//ex1:input:[16, 7, 3, 9, 5, 2]
//output:[9, 9, 9, 5, 2, -1]

//ex2:input:[4, 20, 15, 2]
//ouput:[20, 15, 2, -1]

//ex3:input:[1, 2, 3, 4, 5]
//output:[5, 5, 5, 5, -1]

