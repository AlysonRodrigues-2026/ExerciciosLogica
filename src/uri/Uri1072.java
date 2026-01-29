package uri;

import java.util.Scanner;

public class Uri1072 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de valores a serem lidos: ");
		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 1; i <= n; i++) {

			int x = sc.nextInt();
			boolean dentro = (x >= 10 && x <= 20);

			in += dentro ? 1 : 0;
			out += dentro ? 0 : 1;

		}

		System.out.printf("%d in %n", in);
		System.out.printf("%d out", out);

		sc.close();

	}
}