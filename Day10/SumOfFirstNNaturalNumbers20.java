package Day10;
import java.util.Scanner;

public class SumOfFirstNNaturalNumbers20 {
	
	public static int sumOfFirstNNaturalNumbers(int n) {
		return (n*(n+1))/2;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		System.out.println("sum of first "+num+" natural numbers:"+sumOfFirstNNaturalNumbers(num));
		sc.close();
	}

}

//
//Example 1
//Input:
//N = 5
//Output:
//Sum = 15
//Explanation: 1 + 2 + 3 + 4 + 5 = 15