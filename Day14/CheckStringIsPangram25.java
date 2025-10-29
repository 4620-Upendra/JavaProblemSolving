package Day14;

import java.util.Scanner;

//25.	Check if a string is pangram:
//A string is called a pangram if it contains all 26 letters (a–z) of the English alphabet at least once.
//(Uppercase or lowercase doesn't matter.)


public class CheckStringIsPangram25 {
	
	public static boolean checkPangram(String st) {
		st=st.toLowerCase();
		
		for(int i=97;i<=122;i++) {   //ASCI value of a to z id 97 to 122
			if(!(st.contains(String.valueOf((char)i)))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.print("enter the string:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		boolean result=checkPangram(st);
		System.out.println("given string is:"+(result?" Pangram":" not Pangram"));
		sc.close();
	}

}
