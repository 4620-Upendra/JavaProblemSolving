package Day11;
//22.	Convert string to integer (without parseInt)

import java.util.Scanner;

public class StringToInteger22 {
	
	public static int stringToInt(String numInString) {
		int num=0;
		for(int i=0;i<numInString.length();i++) 
		{
			num=num*10+Character.getNumericValue(numInString.charAt(i));
		}
		return num;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number in String format:");
		String numString=sc.next();
		System.out.println("the integer value of given String:"+stringToInt(numString));
		System.out.println("to verify it is integer add result("+stringToInt(numString)+")+(10) :"+(stringToInt(numString)+10));
		sc.close();
	}

}
