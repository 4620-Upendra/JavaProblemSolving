package Day11;

import java.util.Scanner;

public class HCFByUsingEcloideanAlgorithm22 {
	
	public static int findHCFByUsingEcloideanAlgorithm(int num1,int num2) {
		if(num1<num2) {
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		while(num2!=0) {
			int remainder=num1%num2;
			num1=num2;
			num2=remainder;
		}
		return num1;
	}
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the first number:");
		int firstNumber=sc.nextInt();
		System.out.print("enter second number:");
		int secondNumber=sc.nextInt();
		System.out.println("HCF of given two numbers by using Euclidean Algorithm: "+findHCFByUsingEcloideanAlgorithm(firstNumber,secondNumber));
		sc.close();
	}
}


//🧮 Example: Find HCF of 48 and 18
//Step 1:
//48 ÷ 18 = 2 remainder 12
//→ Replace a = 18, b = 12
//Step 2:
//18 ÷ 12 = 1 remainder 6
//→ Replace a = 12, b = 6
//Step 3:
//12 ÷ 6 = 2 remainder 0
//✅ When the remainder becomes 0, the divisor (6) is the HCF.
//🧩 Therefore:
//HCF(48, 18) = 6