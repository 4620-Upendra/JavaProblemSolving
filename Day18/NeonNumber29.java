package Day18;

import java.util.Scanner;

public class NeonNumber29 {
	public static void checkNeonNumber(int num) {
		int temp=num;
		int sum=0;
		temp*=temp;
		while(temp!=0) {
			sum+=temp%10;
			temp/=10;
		}
		System.out.println(num+" is "+(sum==num?"a ":"not a ")+"neon number");
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		checkNeonNumber(num);
		sc.close();
	}

}

// example num=9 =9^2=81=8+1=9; 9==9 :is neon
// num=10 =10^2=100,1+0+0=1;  1!=10   :is not a neon number


