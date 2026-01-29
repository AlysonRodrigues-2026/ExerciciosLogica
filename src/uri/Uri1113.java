package uri;

import java.util.Scanner;

public class Uri1113 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while(X != Y){
			
			boolean teste = (X >= Y);
			System.out.println(teste ? "Decrescente" : "Crescente");
			
			X = sc.nextInt();
			Y = sc.nextInt();
	
		}
		
		sc.close();
		
	}
}