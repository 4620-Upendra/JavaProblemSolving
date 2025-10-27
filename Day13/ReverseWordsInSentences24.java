package Day13;

import java.util.Scanner;

public class ReverseWordsInSentences24 {
	
	public static String reverseWordsInSentences(String st) {
		String [] stArray=st.split(" ");    //converts string to string array
		int start=0;
		int end=stArray.length-1;
		while(start<=end) {
			String temp=stArray[start];
			stArray[start++]=stArray[end];
			stArray[end--]=temp;
		}
		return String.join(" ", stArray);   //converts String array to string
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the Sentence:");
		String st=sc.nextLine();
		System.out.println("Reverse Words in given Sentence : "+reverseWordsInSentences(st));
		sc.close();
	}

}





//📥 Sample Input and Output
//Input 1:
//Java is fun
//Output 1:
//fun is Java
//
//Input 2:
//I love programming
//Output 2:
//programming love I
//
//Input 3:
//Welcome to Java
//Output 3:
//Java to Welcome