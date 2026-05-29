package aula007.exercicio1;

public class Funcionario {

	protected String nome;
	protected Double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	double CalcularBonus() {
		return salario * 0.10;
		
	}
	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;


	}
}