package uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeVendedor;
		double salarioFixo, totalVendas;
		double comissão = 0.15;
		
		nomeVendedor = sc.nextLine();
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();
		
		double salario = salarioFixo + totalVendas * comissão;
		
		System.out.printf("TOTAL = R$ %.2f%n", salario);
		
		sc.close();
		
	}
}