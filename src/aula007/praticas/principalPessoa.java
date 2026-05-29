package aula007.praticas;

public class principalPessoa {
	public static void main(String[] args) {

		//Criação do objeto a partir da classse estudante
		
		Estudante estudante = new Estudante();
		estudante.nome = "Apollo";
		estudante.materia = "Java";
		
		estudante.comer();
		estudante.estudar();
	
		System.out.println("------------------------------------------------------");
	
		Professor professor = new Professor();
		professor.nome = "fernanda";
		professor.idade = 30;
		professor.disciplina = "Poo";
		
		professor.comer();
		professor.ensinar();
		
		}
	}
	
