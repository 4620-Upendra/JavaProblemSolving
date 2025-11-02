package Day16;
import java.util.Arrays;
import java.util.Scanner;
public class LongestConsecutiveSubsequence25 {
	public static void longestConsecutiveSubsequence(int arr[]) {
		if(arr.length==0) {
			System.out.println("Array is empty. No subsequence found.");
			return;
		}
		Arrays.sort(arr);
		System.out.println("given array sorted:"+Arrays.toString(arr));
		int maxLen=1;
		int currLen=1;
		int startIndex=0;
		int maxStartIndex=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]+1) {currLen++;}
			else if(arr[i]!=arr[i-1]) {
				currLen=1;
				startIndex=i;
			}
			if(currLen>maxLen) {
				maxLen=currLen;
				maxStartIndex=startIndex;
			}
		}
		System.out.println("Longest Consecutive subsequence length:"+maxLen);
		System.out.print("Sequence: ");
		for(int i=maxStartIndex;i<maxStartIndex+maxLen;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int sizeOfArray=sc.nextInt();
		int arr[]=fillArray(sizeOfArray,sc);
		System.out.println("given array:"+Arrays.toString(arr));
		longestConsecutiveSubsequence(arr);

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


//examples:
//ex1:
//	given array:[1, 2, 3, 6, 7, 8, 9, 11]
//	Longest Consecutive subsequence length: 4
//	Sequence: 6 7 8 9

//ex2:
//given array:[1, 2, 2, 3, 4]
//Longest Consecutive subsequence length: 4
//Sequence: 1 2 3 4

//ex3:
//arr= {}
//Array is empty. No subsequence found.

//ex4:
//given array:[5, 15, 25, 35, 45]
//Longest Consecutive subsequence length: 1
//Sequence:5



//✅ Plain Text Explanation (using the variables you specified)
//The program finds the longest consecutive subsequence in an array.
//
//To do that, we track the sequence using these variables:
//int maxLen = 0;
//Stores the length of the longest consecutive subsequence found so far.
//int currLen = 0;
//Keeps track of the current consecutive subsequence length while scanning the array.
//int startIndex = 0;
//Tracks the starting index of the current subsequence being counted.
//int maxStartIndex = 0;
//Stores the starting index of the longest subsequence found so far.
//
//🔍 Step-by-step logic (no example):
//1)Sort the array first so consecutive numbers are next to each other.
//2)Initialize currLen to 1 because every number individually is a subsequence of length 1.
//3)Start scanning the array from the second element.
//4)For each element:
//If the current element is exactly 1 greater than the previous,
//→ increase currLen (the sequence continues).
//Else if the current element is a duplicate of the previous,
//→ ignore it (do nothing, do not reset currLen).
//Otherwise (not consecutive),
//→ reset currLen to 1
//and update startIndex to mark the beginning of a new subsequence.
//5)After every increase or reset, compare currLen with maxLen:
//If currLen becomes greater than maxLen,
//→ update maxLen with currLen
//→ update maxStartIndex with startIndex
//6)When the loop ends:
//maxLen tells how long the longest subsequence is.
//maxStartIndex tells where it starts in the array.
//
//🎯What the program achieves
//It correctly counts consecutive values.
//It ignores duplicates.
//It remembers where the longest subsequence started using maxStartIndex.
//It remembers how long it is using maxLen.