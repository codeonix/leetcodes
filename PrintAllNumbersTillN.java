package dsaInJava;

import java.util.Scanner;

public class PrintAllNumbersTillN {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int low =s .nextInt();
	int high = s.nextInt();
	for(int n = low ;n<=high;n++) {
		int count = 0;
		for(int div = 2;div*div <= n;div++) {
			if(n % div ==0) {
				count ++;
				break;
			}
		}
		if(count ==0) {
			System.out.print(n+ " ");
		}
	}
}
}
