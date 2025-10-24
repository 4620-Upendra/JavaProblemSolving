package Day10;

import java.util.Scanner;

public class SubstringReplacement21 {

	public static String substringReplacement(String originalString,String SubStringToReplace ) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the replacement string:");
		String replacementString=sc.nextLine();
		return originalString.replaceAll(SubStringToReplace,replacementString);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string:");
		String originalString=sc.nextLine();
		
		System.out.print("enter the Substring to replace in string:");
		String SubStringToReplace=sc.nextLine();
		
		
		System.out.print(substringReplacement(originalString,SubStringToReplace ));

	}

}

//Example 1 – Single Occurrence
//Input:
//Original string: "Hello World"
//Substring to replace: "World"
//Replacement string: "Java"

//Output:"Hello Java"

//Example 2 – Multiple Occurrences
//Input:
//Original string: "apple, banana, apple, orange"
//Substring to replace: "apple"
//Replacement string: "grape"

//Output:"grape, banana, grape, orange"

//Example 3 – Case-Sensitive Replacement
//Input:
//Original string: "I love Cats. Cats are cute."
//Substring to replace: "Cats"
//Replacement string: "dogs"

//Output:"I love cats. dogs are cute."