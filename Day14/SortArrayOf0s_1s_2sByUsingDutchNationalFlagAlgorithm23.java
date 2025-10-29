package Day14;
//23.	Sort array of 0s, 1s and 2s  by using Dutch National Flag Algorithm
import java.util.Arrays;
import java.util.Scanner;
public class SortArrayOf0s_1s_2sByUsingDutchNationalFlagAlgorithm23 {
	public static void sortArrayByUsingDutchNationalFlagAlgorithm(int arr[]) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[mid];
				arr[mid++]=arr[low];
				arr[low++]=temp;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				int temp=arr[high];
				arr[high--]=arr[mid];
				arr[mid]=temp;
			}
		}
		System.out.println("Sorted array by using Dutch National Flag Algorithm:"+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int arr[]=fillArray(sc.nextInt(),sc);
		System.out.println("given array:"+Arrays.toString(arr));
		sortArrayByUsingDutchNationalFlagAlgorithm(arr);
	}
	
	public static int [] fillArray(int sizeOfArray,Scanner sc){
		System.out.println("the array should contain only 0s,1s,2s ");
		int []arr=new int[sizeOfArray];
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter "+i+" index element of array:");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
}

//Dutch National Flag Algorithm process:
//Element	What to do
//If it is 0	:Swap with low, move both low and mid forward
//If it is 1	:It's already in the middle → move mid forward
//If it is 2	:Swap with high, move high backward


//sample input and output:
//input1:[0,2,1,2,0,1,0];
//output1:[0,0,0,1,1,2,2];

//input2:= [2,2,0,1,0,2]
//output:[0,0,1,2,2,2]


//Dutch National Flag Algorithm
//Element	What to do
//If it is 0	:Swap with low, move both low and mid forward
//If it is 1	:It's already in the middle → move mid forward
//If it is 2	:Swap with high, move high backward

//example:
//✅ Step-by-step Example
//Array:[0, 2, 1, 2, 0, 1, 0]
//Start pointers:
//low = 0
//mid = 0
//high = 6    (last index)

//▶ Step 1: mid = 0 → value = 0
//0 should go to left → swap with low
//[0, 2, 1, 2, 0, 1, 0]
// low    mid              high
//Move both low and mid:
//low = 1
//mid = 1

//▶ Step 2: mid = 1 → value = 2
//2 should go to right → swap with high
//[0, 0, 1, 2, 0, 1, 2]
//     mid        high
//Move only high:
//high = 5

//▶ Step 3: mid = 1 → value = 0
//0 → swap with low
//[0, 0, 1, 2, 0, 1, 2]
//     low mid
//Move low and mid:
//low = 2
//mid = 2

//▶ Step 4: mid = 2 → value = 1
//1 belongs in the middle → just move mid:
//mid = 3
//▶ Step 5: mid = 3 → value = 2
//Swap with high
//[0, 0, 1, 1, 0, 2, 2]
//         mid high
//Move high:
//high = 4

//▶ Step 6: mid = 3 → value = 1
//Just move mid:
//mid = 4

//▶ Step 7: mid = 4 → value = 0
//Swap with low
//[0, 0, 0, 1, 1, 2, 2]
//low mid Move both:
//low = 3
//mid = 5

//Now mid > high, so we stop ✅
//🎉 Final Sorted Array
//[0, 0, 0, 1, 1, 2, 2]



//✅ Example 2:
//Input:
//[2, 0, 1]
//
//Start:
//low = 0
//mid = 0
//high = 2
//
//Step 1: mid = 0 → value = 2
//2 should go to the right → swap with high
//[1, 0, 2]
//     ↗ swap
//high-- → high = 1
//
//Step 2: mid = 0 → value = 1
//1 stays in the middle → just move mid
//mid = 1
//
//Step 3: mid = 1 → value = 0
//0 should go left → swap with low
//[0, 1, 2]
// ↗ swap
//low++, mid++
//
//✅ Final Output:
//[0, 1, 2]

		
