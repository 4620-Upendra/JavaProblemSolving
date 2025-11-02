package Day16;
//27.	Print all palindromic numbers in range
import java.util.Scanner;

public class PrintAllPalindromicNoInGivenRange27 {

	public static void printAllPalindromicNoInGivenRange(int start,int end) {
		System.out.println("Palindromic numbers between "+start+ " and "+end+":");
		boolean isTherePalindromicNo=false;
		for(int i=start;i<=end;i++) {
			int temp=i;
			int reverse=0;
			while(temp>0) {
				reverse=reverse*10+temp%10;
				temp/=10;
			}
			if(reverse==i) {
				isTherePalindromicNo=true;
				System.out.print(i+" ");
			}
		}
		if(!isTherePalindromicNo) {
			System.out.println("None");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter start number:");
		int startNumber=sc.nextInt();
		System.out.print("enter end number:");
		int endNumber=sc.nextInt();
		printAllPalindromicNoInGivenRange(startNumber,endNumber);
		sc.close();

	}

}





//✅ Example 1
//Input:
//Enter start number: 1
//Enter end number: 50
//Output:
//Palindromic numbers between 1 and 50:
//1 2 3 4 5 6 7 8 9 11 22 33 44
//
//✅ Example 2
//Input:
//Enter start number: 100
//Enter end number: 500
//
//
//Output:
//Palindromic numbers between 100 and 500:
//101 111 121 131 141 151 161 171 181 191
//202 212 222 232 242 252 262 272 282 292
//303 313 323 333 343 353 363 373 383 393
//404 414 424 434 444 454 464 474 484 494
//
//✅ Example 3
//Input:
//Enter start number: 500
//Enter end number: 650
//Output:
//Palindromic numbers between 500 and 650:
//505 515 525 535 545 555 565 575 585 595
//
//✅ Example 4 (No palindromes in range)
//Input:
//Enter start number: 8
//Enter end number: 9
//Output:
//Palindromic numbers between 8 and 9:
//8 9
//
//✅ Example 5 (Range with no palindromic numbers except single digits)
//Input:
//Enter start number: 12
//Enter end number: 20
//Output:
//Palindromic numbers between 12 and 20:
//None