package Day18;

import java.util.Scanner;

public class CompareStringWithoutEquals29 {
	public static void checkStringEqual(String st1, String st2) {
		if(st1.length()!=st2.length()) {
			System.out.println("Given Strings are not equal");
		}else {
			boolean equal=true;
			for(int i=0;i<st1.length();i++) {
				if(st1.charAt(i)!=st2.charAt(i)) {
					equal=false;
					break;
				}
			}
			System.out.println("given strings are "+(equal?"equal":"not equal"));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string 1:");
		String st1=sc.nextLine();
		System.out.print("enter string 2:");
		String st2=sc.nextLine();
		checkStringEqual(st1,st2);
		sc.close();
	}

}

//Example 1:
//Input: "apple" and "apPle"
//Output: Strings are not equal
//Reason: 'p' ≠ 'P' (case-sensitive)
//
//Example 2:
//Input: "12345" and "12345"
//Output: Both strings are equal
//
//Example 3:
//Input: "12345" and "1234"
//Output: Strings are not equal
//Reason: Different lengths