package questions;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Number");
		int n = in.nextInt();
		
		
		
		boolean ans = isPrime(n);
		
		System.out.print("Prime:" + ans);

	}
	
	static boolean isPrime(int n) {
		
		if(n<1) {
			return false;
		}
		
		int c = 2;
		
		while(c*c <=n) {
			if(n%c == 0) {
				return false;
			}
			c++;
		}
		return c*c>n;
		
	}

}
