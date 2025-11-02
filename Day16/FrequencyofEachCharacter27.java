package Day16;

import java.util.Scanner;

//27.	Print frequency of each character

public class FrequencyofEachCharacter27 {
	
	public static void frequencyofEachCharacter(String st) {
		if(st.length()==0) {
			System.out.println("String is empty — no characters to count.");
			return;
		}
		System.out.println("frequency of each Character in given string :");
		boolean duplicate []=new boolean[st.length()];
		for(int i=0;i<st.length();i++) {
			if(duplicate[i]) {
				continue;
			}
			int countOfChar=0;
			for(int j=0;j<st.length();j++) {
				if(st.charAt(i)==st.charAt(j)) {
					countOfChar++;
					duplicate[j]=true;
				}
			}
			System.out.println(st.charAt(i)+" -> "+countOfChar);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string:");
		String st=sc.nextLine();
		frequencyofEachCharacter(st);
		sc.close();
		
	}

}


//✅ Sample Example 1
//Input:
//Enter a string: banana
//Output:
//Character frequency:
//a → 3
//b → 1
//n → 2
//
//✅ Sample Example 2
//Input:
//Enter a string: programming
//Output:
//Character frequency:
//p → 1
//r → 2
//o → 1
//g → 2
//r → 2
//a → 1
//m → 2
//i → 1
//n → 1
//
//✅ Sample Example 3
//Input:
//Enter a string: HELLO
//Output:
//Character frequency:
//H → 1
//E → 1
//L → 2
//O → 1
//
//✅ Sample Example 4 (Spaces Included)
//Input:
//Enter a string: a a a b
//Output:
//Character frequency:
//a → 3
//(space) → 2
//b → 1