package aula02.exercicio;
import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo = 500;
		
		System.out.println("____CAIXA ELETRONICO____");
		System.out.print("Digite o valor do saque: ");
		double Valorsaque = sc.nextDouble();
		if (Valorsaque%10!=0) {
			System.out.println("Erro: O valor deve ser multiplo de 10");
		} else if (Valorsaque>saldo) {
			System.out.println("Erro: Saldo insuficiente.");
		} else {

			saldo = saldo-Valorsaque;
			System.out.println("Saque realizado com sucesso!");
			System.out.println("Novo saldo: "+ saldo);
			
		}	
	}
}