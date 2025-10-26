package Day12;
//23.	Check for magic number

import java.util.Scanner;
public class MagicNumber23 {

	public static boolean CheckMagicNumber(int num) {
		while(true) {
			int sum=0;
			while(num>0) {
				sum+=num%10;
				num/=10;
			}
			if(sum>9) {
				num=sum;
			}else if(sum<=9) {
				return sum==1;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		System.out.println("given number is "+(CheckMagicNumber(num)?"Magic number":"not a Magic number"));
		sc.close();
	}

}



//
//Example 1: Number = 1729
//Sum of digits: 1 + 7 + 2 + 9 = 19
//Sum the digits of 19: 1 + 9 = 10
//Sum the digits of 10: 1 + 0 = 1
//✅ Final single digit is 1 → Magic Number
//Output: 1729 is a magic number.
//
//Example 2: Number = 1234
//Sum of digits: 1 + 2 + 3 + 4 = 10
//Sum the digits of 10: 1 + 0 = 1
//✅ Final single digit is 1 → Magic Number
//Output: 1234 is a magic number.
//
//Example 3: Number = 245
//Sum of digits: 2 + 4 + 5 = 11
//Sum the digits of 11: 1 + 1 = 2
//❌ Final single digit is 2 → Not a Magic Number
//Output: 245 is not a magic number.