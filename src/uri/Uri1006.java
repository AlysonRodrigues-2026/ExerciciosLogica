package uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double media = (a * 2 + b * 3 + c * 5 ) / 10;
		
		System.out.printf("MEDIA = %.1f%n", media );
		
		sc.close();
	}
}