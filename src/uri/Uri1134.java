package uri;

import java.util.Scanner;

public class Uri1134 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cod;

		int qtdAlcool = 0;
		int qtdGasolina = 0;
		int qtdDiesel = 0;

		do {
			do {
				System.out.println("1.Álcool");
				System.out.println("2.Gasolina");
				System.out.println("3.Diesel");
				System.out.println("4.Fim");
				System.out.print("Informe o código: ");
				cod = sc.nextInt();
			} while (cod <= 0 || cod >= 5);

			switch (cod) {
			case 1:
				qtdAlcool++;
				break;
			case 2:
				qtdGasolina++;
				break;
			case 3:
				qtdDiesel++;
				break;
			}

		} while (cod != 4);

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Álcool: %d%n", qtdAlcool);
		System.out.printf("Gasolina:  %d%n", qtdGasolina);
		System.out.printf("Diesel:  %d", qtdDiesel);

		sc.close();

	}
}