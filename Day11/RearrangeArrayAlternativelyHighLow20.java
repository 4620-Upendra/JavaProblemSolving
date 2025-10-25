package Day11;  //20.	Rearrange array alternatively (high-low)
import java.util.Arrays;
import java.util.Scanner;
public class RearrangeArrayAlternativelyHighLow20 {
	public static int [] rearrangeArrayAlternativelyHighLow(int []arr) {
		for(int i=0;i<arr.length;i+=2) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				if(i+1<arr.length) {
					if(arr[i+1]>arr[j]) {
						int temp=arr[i+1];
						arr[i+1]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		return arr;
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
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int sizeOfArray=sc.nextInt();
		int arr[]=fillArray(sizeOfArray,sc);
		System.out.println("given array:"+Arrays.toString(arr));
		System.out.println("Rearranged array alternatively (high-low) :"+Arrays.toString(rearrangeArrayAlternativelyHighLow(arr)));
	}

}


//example 1:
//input:[1,2,3,4,5,6,7]
//output:[]

//ex2:input:[10,20,30,40,50]
//output:[50,10,40,20,30]