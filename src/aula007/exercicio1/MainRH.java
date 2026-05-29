package aula007.exercicio1;
import java.util.ArrayList;

public class MainRH {
	public static void main(String [] args ) {
		ArrayList <Funcionario> funcionarios = new ArrayList<>();
		
		//Gerente g1 = new Gerente();
		//g1.nome = "Ântonio";
		//g1.salario = 4000.00;
		
		//Desenvolvedor d1 = new Desenvolvedor();
		//d1.nome = "Severino";
		//d1.salario = 12000.00;
		
		//funcionarios.add(g1);
		//funcionarios.add(d1);
		
		funcionarios.add(new Gerente("Antonio", 4000.00));
		funcionarios.add(new Desenvolvedor("Severino", 12000.00));
		funcionarios.add(new Funcionario("Cleide", 6000.00));
		
		
		for (Funcionario f: funcionarios) {
			System.out.println(f.getNome());
			System.out.println("Bônus: " + (f.CalcularBonus()));
			System.out.println("Salário: " + (f.getSalario()));
			System.out.println("Salário final: "+(f.salario+f.CalcularBonus()));
			System.out.println("--------------------------");
			
		
		}
	}
}
