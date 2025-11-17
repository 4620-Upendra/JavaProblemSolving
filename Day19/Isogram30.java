package Day19;

import java.util.Arrays;
import java.util.Scanner;

//30.	Check if a string is isogram
public class Isogram30 {

	public static void checkIsogram(String st) {
		boolean isogram=true;
		st=st.toLowerCase();
		char [] arr=st.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(i!=0) {
				if(Character.isAlphabetic(arr[i])) {
					if(arr[i-1]==arr[i]) {
						isogram=false;
					}
				}
			}
		}
		System.out.println("given string is "+(isogram?"a Isogram":"not a Isgram"));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string:");
		String st=sc.nextLine();
		checkIsogram(st);
		sc.close();

	}

}







//🔹 What is an Isogram?
//An isogram is a word or phrase in which no letter repeats.
//Spaces and hyphens are usually ignored.
//Case-insensitive (treat A and a as the same).
//
//Examples:
//"machine" → ✅ isogram (all letters unique)
//"programming" → ❌ not an isogram (r and g repeat)
//"Dermatoglyphics" → ✅ isogram
//"hello" → ❌ not an isogram (l repeats)