package Day17;
import java.util.Scanner;

public class NearestPrimeNoToGivenNumber28 {
	public static void findNearestPrimeNo(int n) {
		if(checkPrime(n)) {
			System.out.println("Nearest prime number for given number:"+n);
		}
		else {
			int privousNumber=n-1;
			int nextNumber=n+1;
			while(true) {
				if(checkPrime(privousNumber)) {
					System.out.println("Nearest prime number for given number:"+privousNumber);
					break;
				}
				else if(checkPrime(nextNumber)) {
					System.out.println("Nearest prime number for given number:"+nextNumber);
					break;
				}
				privousNumber--;
				nextNumber++;
			}
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num =sc.nextInt();
		findNearestPrimeNo(num);
		sc.close();
	}
	
	public static boolean checkPrime(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			return true;
		}
		return false;
	}
}

//sample example:
//ex1: input:10
//output:Nearest prime number: 11

//ex2: input:24
//output:Nearest prime number: 23

//ex3: input:15
//output:Nearest prime number: 13