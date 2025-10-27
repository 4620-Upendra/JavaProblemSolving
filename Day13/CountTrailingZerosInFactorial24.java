package Day13;

import java.util.Scanner;

public class CountTrailingZerosInFactorial24 {
     
	public static int countTrailingZerosInFactorial(int num) {
		int countTrailingZero=0;
		int power=1;
		while(num/Math.pow(5, power)!=0) {
			countTrailingZero+=num/Math.pow(5, power++);
		}
		return countTrailingZero;
	}
	
	public static long FactorialOFNumber(int num) {
		if(num==0) {
			return 1;
		}
		return num*FactorialOFNumber(num-1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		System.out.println("Trailing Zeros in "+FactorialOFNumber(num)+" is "+countTrailingZerosInFactorial(num));
		sc.close();
	}

}








////🔹 Naive (Normal) Method
///🪜 Steps:
//1)Calculate factorial of n:
//Multiply all integers from 1 to n → n!
//2)Count trailing zeros:
//->While the factorial value is divisible by 10 → divide by 10
//->For each division, increase the zero count by 1
//->Stop when the result is not divisible by 10

///
//🧩 Example:
//Input: n = 5
//Compute factorial:
//5!=5×4×3×2×1=120
//Divide by 10:
//120 ÷ 10 = 12 → count = 1
//12 ÷ 10 = 1.2 (not whole, stop)
//✅ Trailing zeros = 1

//Formula-Based Method (Efficient Approach)
//🪜 Steps:
//1)Divide n by powers of 5 — (5, 25, 125, …)
//2)Add up all the quotients (integer part only).
//3)The total sum gives the number of trailing zeros.


//🧩 Example:
//Input: n = 130
//Step 1️: ⌊130 / 5⌋ = 26
//Step 2️: ⌊130 / 25⌋ = 5
//Step 3️: ⌊130 / 125⌋ = 1
//Now, add them:
//26 + 5 + 1 = 32
//✅ Output: 32 trailing zeros in 130!



//examples :
//📥 Sample Inputs and Outputs
//
//Input: 4
//Factorial: 24
//Output: 0
//Explanation: No multiples of 5, so no trailing zeros.
//
//Input: 5
//Factorial: 120
//Output: 1
//Explanation: 5 × 2 = 10 → one trailing zero.
//
//Input: 6
//Factorial: 720
//Output: 1
//Explanation: Only one 5 (from 5×6), so one trailing zero.
//
//Input: 10
//Factorial: 3628800
//Output: 2
//Explanation: Multiples of 5 are 5 and 10 → two zeros.
