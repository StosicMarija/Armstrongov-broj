package drugidomaci;

import java.util.Scanner;

public class CetvrtiZ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0, a, temp;
		int n;
		System.out.println("Unesite broj: ");
		n = sc.nextInt();
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("Broj " + temp + " je Armstrongov");
		else
			System.out.println("Broj " + temp + " nije Armstrongov broj");
	}

}

