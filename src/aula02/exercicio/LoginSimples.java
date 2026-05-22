package aula02.exercicio;
import java.util.Scanner;

public class LoginSimples {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite o nome de usúario : ");
			String nome = sc.nextLine();
			
			System.out.print("Digite sua senha : ");
			int senha = sc.nextInt();
			
			if ((nome.equals("admin")) && (senha==123)) {
				System.out.print("Login efetuado com sucesso");
			} else { 
				System.out.print("Acesso negado!");
				
				
				
				
				
			}
			
			
			
			
			
			
}
}