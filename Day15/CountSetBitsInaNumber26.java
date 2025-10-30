package Day15;

import java.util.Scanner;

public class CountSetBitsInaNumber26 {

	public static void checkCountOfSetBits(int num) {
		if(num==1) {
			System.out.println("given number in binary :1");
			System.out.println("set bits(no of 1s in binary) in given number:1");
			return;
		}
		if(num==0) {
			System.out.println("given number in binary :0");
			System.out.println("set bits(no of 1s in binary) in given number:0");
			return;
		}
		String NumInBinaryFrom="";
		int countOfSetBits=0;
		while(num>=2) {
			if(num%2==1) countOfSetBits++;
			NumInBinaryFrom+=num%2;
			num/=2;
			if(num<2) {
				if(num==1) {
					countOfSetBits++;
				}
				NumInBinaryFrom+=num%2;
			}
		}
		StringBuilder sb=new StringBuilder(NumInBinaryFrom);
		NumInBinaryFrom=sb.reverse().toString();
		System.out.println("given number in binary :"+NumInBinaryFrom);
		System.out.println("set bits(no of 1s in binary) in given number:"+countOfSetBits);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the postive number number:");
		int num=sc.nextInt();
		checkCountOfSetBits(num);
		sc.close();
	}

}







//✅ What are Set Bits?
//In binary representation, every digit is either 0 or 1.
//A set bit means a bit that is 1.
//
//Example:
//Decimal number 13
//Binary representation = 1101
//Here, the number of set bits = 3 (1 1 0 1 → three 1s)


// How to Count Set Bits — Simple Logic (No Code)
//Convert the number to binary
//Use division by 2 repeatedly and take remainders
//Or mentally convert if it's small
//Look at each bit (each binary digit)
//If it is 1, that is a set bit
//If it is 0, ignore it
//Count how many 1s are there

//Sample Input 1
//Input: 13
//Binary of 13 → 1101
//Count the number of 1s → 3
//Output:
//Set bits = 3
//
//Sample Input 2
//Input: 23
//Binary of 23 → 10111
//Count the number of 1s → 4
//Output:
//Set bits = 4