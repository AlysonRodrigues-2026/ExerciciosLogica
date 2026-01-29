package uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1116 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			boolean testeDenominador = y == 0;

			System.out.printf(testeDenominador ? "Divisão impossível%n" : "%.1f%n", (double) x / y);

		}

		sc.close();

	}
}