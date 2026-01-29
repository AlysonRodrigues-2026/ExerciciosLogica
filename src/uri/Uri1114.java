package uri;

import java.util.Scanner;

public class Uri1114 {	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a senha: ");
		int senha = sc.nextInt();

		while (senha != 2002) {

			System.out.println("Senha Inválida");
			System.out.print("Informe a senha: ");
			senha = sc.nextInt();

		}

		System.out.println("Acesso Permitido");

		sc.close();

	}
}