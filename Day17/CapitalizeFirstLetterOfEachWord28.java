package Day17;
import java.util.Scanner;

public class CapitalizeFirstLetterOfEachWord28 {

	public static void capitalizeFirstLetter(String st) {
		String [] arr=st.split(" ");
		String result="";
		for(int i=0;i<arr.length;i++){
			result+=Character.toUpperCase(arr[i].charAt(0));
			result+=arr[i].substring(1);
			if(i!=arr.length-1) {
				result+=" ";
			}
		}
		
		System.out.println("After Capitalization :"+result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String st=sc.nextLine();
		capitalizeFirstLetter(st);
		sc.close();
	}

}
