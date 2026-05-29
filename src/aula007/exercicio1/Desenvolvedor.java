package aula007.exercicio1;

public class Desenvolvedor extends Funcionario {
	
	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	double CalcularBonus() {
		return salario * 0.15;

	}
}
