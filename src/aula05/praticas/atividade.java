package aula05.praticas;

import java.util.Scanner;

public class atividade {
	
	
	public static int somar(int num1, int num2) {
		
			int resultadoSoma = num1 + num2;
			return resultadoSoma;
	}
			
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Digite seu número: ");
				int num3 = scanner.nextInt();
				
				System.out.println("Digite seu número: ");
				int num4 = scanner.nextInt();	
			
				System.out.println("Resultado: " +somar(num3, num4 ));
				
				scanner.close();
	}
	
}

