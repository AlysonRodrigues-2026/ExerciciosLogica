package uri;

import java.util.Scanner;

public class Uri1143 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro e positvo: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			int numLinha = i;
			int numLinhaQuadrado = i * i;
			int numLinhaCubo = i * i * i;
			
			System.out.printf("%d %d %d%n", numLinha, numLinhaQuadrado, numLinhaCubo);
		}
		
		sc.close();
		
	}
}