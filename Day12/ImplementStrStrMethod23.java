package Day12;
import java.util.Scanner;

public class ImplementStrStrMethod23 {

	public static int subStringSearch(String mainString,String subString) {
		int index=-1;
		int result=0;
		for(int i=0;i<mainString.length();i++) {
			if(result>=subString.length()) {
				break;
			}
			if(mainString.charAt(i)==subString.charAt(result)) {
				result++;
				index=i;
			}
			else{
				index=-1;
				result=0;
			}
		}
		if(result==subString.length()) {
			
			return index-=subString.length()-1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the main String:");
		String mainString=sc.nextLine();
		System.out.print("enter the subString:");
		String subString=sc.nextLine();
		if(subStringSearch(mainString,subString)!=-1) {
			System.out.println("subString starts at index "+subStringSearch(mainString,subString)+" in main string");
		}
		else {
			System.out.println("subString not found in main string");
		}
		sc.close();
	}

}


//Example 1:
//Input:
//Main string: "java programming"
//Substring: "gram"
//Output:
//7 → substring "gram" starts at index 7
//
//Example 2:
//Input:
//Main string: "openai"
//Substring: "chat"
//Output:
//-1 → substring "chat" not found