package aula007.exercicio1;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
		
		
	@Override
	double CalcularBonus() {
		return salario * 0.20;	
	}
}
