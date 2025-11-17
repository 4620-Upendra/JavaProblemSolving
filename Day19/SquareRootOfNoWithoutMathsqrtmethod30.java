package Day19;

import java.util.Scanner;

//30.	Find square root of a number (without Math.sqrt) or by using binary search / approximation approach
public class SquareRootOfNoWithoutMathsqrtmethod30 {

	public static double findSqrtOfNum(int n) {
		double start=0,end=n,mid=0;
		double eps=0.00001;   //precision
		while((end-start)>eps) {
			mid=(start+end)/2;
			if(mid*mid>n) {
				end=mid;
			}
			else {
				start=mid;
			}
		}
		return mid;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		System.out.println("Square root of given number:"+findSqrtOfNum(num));
		sc.close();
	}

}


//Great — here’s a clear, step-by-step dry run of the binary-search square-root algorithm for n = 10 (precision eps = 0.00001). I’ll show each iteration: start, end, mid = (start+end)/2, and mid*mid, and explain the update rule.
//Setup
//n = 10
//start = 0.0, end = 10.0
//eps = 0.00001 (stop when end - start <= eps)
//If mid*mid > n → se30.	Check if a string is isogramt end = mid (search left)
//Else → set start = mid (search right)
//
//Iterations (first 12 shown)
//1)start = 0.0, end = 10.0
//mid = (0 + 10)/2 = 5.0 → mid*mid = 25.0
//25.0 > 10 → set end = 5.0
//
//2)start = 0.0, end = 5.0
//mid = (0 + 5)/2 = 2.5 → mid*mid = 6.25
//6.25 < 10 → set start = 2.5
//
//3)start = 2.5, end = 5.0
//mid = (2.5 + 5)/2 = 3.75 → mid*mid = 14.0625
//14.0625 > 10 → set end = 3.75
//
//4)start = 2.5, end = 3.75
//mid = (2.5 + 3.75)/2 = 3.125 → mid*mid = 9.765625
//9.765625 < 10 → set start = 3.125
//
//5)start = 3.125, end = 3.75
//mid = (3.125 + 3.75)/2 = 3.4375 → mid*mid = 11.81640625
//11.8164 > 10 → set end = 3.4375
//
//6)start = 3.125, end = 3.4375
//mid = (3.125 + 3.4375)/2 = 3.28125 → mid*mid ≈ 10.7666015625
//10.7666 > 10 → set end = 3.28125
//
//7)start = 3.125, end = 3.28125
//mid = (3.125 + 3.28125)/2 = 3.203125 → mid*mid ≈ 10.260009765625
//10.2600 > 10 → set end = 3.203125
//
//8)start = 3.125, end = 3.203125
//mid = (3.125 + 3.203125)/2 = 3.1640625 → mid*mid ≈ 10.01129150390625
//10.01129 > 10 → set end = 3.1640625
//
//9)start = 3.125, end = 3.1640625
//mid = (3.125 + 3.1640625)/2 = 3.14453125 → mid*mid ≈ 9.888076782226562
//9.88808 < 10 → set start = 3.14453125
//
//10)start = 3.14453125, end = 3.1640625
//mid = (3.14453125 + 3.1640625)/2 = 3.154296875 → mid*mid ≈ 9.949588775634766
//9.94959 < 10 → set start = 3.154296875
//
//11)start = 3.154296875, end = 3.1640625
//mid = (3.154296875 + 3.1640625)/2 = 3.1591796875 → mid*mid ≈ 9.980416297912598
//9.98042 < 10 → set start = 3.1591796875
//
//12)start = 3.1591796875, end = 3.1640625
//mid = (3.1591796875 + 3.1640625)/2 = 3.16162109375 → mid*mid ≈ 9.995847940444946
//9.99585 < 10 → set start = 3.16162109375
//
//Continue the same process — each iteration halves the interval [start, end]. After 20 iterations the interval width becomes ≤ 0.00001 and we stop.
//Final approximate mid ≈ 3.1622791290283203
//mid*mid ≈ 10.000009289888112 (close to 10 within the chosen precision)
//
//Final Result (approx)
//Square root of 10 ≈ 3.1622791 (precision depends on eps

