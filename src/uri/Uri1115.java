package uri;

import java.util.Scanner;

public class Uri1115 {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		
		int X, Y;

		do {
			
			System.out.print("Informe a coordenada X: ");
			X = sc.nextInt();
			System.out.print("Informe a coordenada Y: ");
			Y = sc.nextInt();
			
			if(X > 0 && Y > 0) {
				System.out.println("Primeiro");
			} else if (X < 0 && Y > 0){
				System.out.println("Segundo");
			} else if(X < 0 && Y < 0) {
				System.out.println("Terceiro");
			} else if(X > 0 && Y < 0){
				System.out.println("Quarto");
			}
		
		} while ( X != 0 && Y != 0 );
		
		sc.close();

	}
}