package Day15;

import java.util.Scanner;

//26.	Check if a string has balanced parentheses
public class CheckStringHasBalancedParentheses26 {
	
	public static boolean checkStringHasBalancedParentheses(String st) {
		int count=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='(' || st.charAt(i)==')') {
				if(st.charAt(i)=='(') {
					count++;
				}
				else {
					count--;
				}
			}
			if(count<0) {
				return false;
			}
		}
		return count==0;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string :");
		String string=sc.nextLine();
		System.out.println("In given string parentheses are "+(checkStringHasBalancedParentheses(string)?"balanced":"not balanced"));
		sc.close();
	}

}









/*
Logic to check balanced parentheses:

We use a counter variable `count`.

Step-by-step:
- Whenever we see '(', we increase count (count++).
- Whenever we see ')', we decrease count (count--).

Important rules:
1. If at any moment count becomes negative,
   → a closing bracket came without a matching opening bracket
   → string is unbalanced → return false immediately.

2. After scanning the entire string:
   → if count == 0 → parentheses are balanced (return true)
   → else → not balanced (return false)



Example 1:  "( ( a ) + b )"
process:
  '(' → count = 1
  '(' → count = 2
  'a' → ignore
  ')' → count = 1
  '+' → ignore
  'b' → ignore
  ')' → count = 0
End → count == 0 → Balanced → returns true


Example 2:  "())("
process:
  '(' → count = 1
  ')' → count = 0
  ')' → count = -1  → ❌ becomes negative here → Unbalanced → return false
*/
