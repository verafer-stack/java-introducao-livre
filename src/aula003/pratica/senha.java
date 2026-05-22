package aula003.pratica;
import java.util.Scanner;
public class senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("Digite a senha: ");
	int senha;
	//while (senha!=1234) {
		//System.out.println("senha incorreta, digite novamente: ");
	//	senha = sc.nextInt();
	//}
	

	
	
	// ESTRUTURA DO WHILE
	
		
	do {
		System.out.print("Digite sua senha: ");
			senha = sc.nextInt();

	} while (senha!=1234);
		System.out.print("Login realizado");
	}
}

	