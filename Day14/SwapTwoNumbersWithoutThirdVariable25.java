package Day14;
import java.util.Scanner;
//25.	Swap two numbers without third variable
public class SwapTwoNumbersWithoutThirdVariable25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number:");
		int a=sc.nextInt();
		System.out.print("enter second number:");
		int b=sc.nextInt();
		System.out.println("before swaping:a="+a+" , b="+b);
		swap(a,b);
		sc.close();
	}
	private static void swap(int a, int b) {
		//first way to swap two number without third variable
		//ex:a=2,b=3
//		a=a+b;          //a=2+3=5     
//		b=a-b;          //b=5-3=2
//		a=a-b;          //a=5-2=3      
		//a=3,b=2
//		System.out.println("after swaping:a="+a+" , b="+b);
		
		//second way
		//ex:a=2,b=3
//		a=a*b;        //a=2*3=6     
//		b=a/b;        //b=6/3=2
//		a=a/b;        //a=6/2=3      
		//a=3,b=2
//		System.out.println("after swaping:a="+a+" , b="+b);
		
		//third way   
		//ex:a=2,b=3                      
//		                        a,b in binary
		a=a^b;      //a^b=2^3=>   10^11=>01=>    1
		b=a^b;      //a^b=1^3=>   01^11=>10=>    2
		a=a^b;      //a^b=1^2=>   01^10=>11=>    3
		//a=3,b=2 
		System.out.println("after swaping:a="+a+" , b="+b);
		
	}

}
