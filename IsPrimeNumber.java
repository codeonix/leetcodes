package dsaInJava;

import java.util.Scanner;

public class IsPrimeNumber {
  public static boolean isPrime(int n) {
	 int count =0;
	  for(int i = 2;i*i <= n;i++) {
		 if(n % i == 0) {
			 count++;
			 break;
		 }
	 }
	  if(count ==0)
		  return true;
	  return false;
  }
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	if(isPrime(n))
		System.out.println(n + " is a prime number ");
	else
		System.out.println(n + " is not a prime number");
}
}
