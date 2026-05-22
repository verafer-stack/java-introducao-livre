package aula006.exercicios;

public class principal {
	public static void main(String [] args) {
		//ESTANCIA DA CLASSE PESSOA
		System.out.println("Utilizando a classe pessoa");
		pessoa p1 = new pessoa(); //primeiro objeto
		p1.nome = "Rafa";
		p1.idade = 21;
		
		pessoa p2 = new pessoa(); //segundo objeto
		p2.nome = "Gustavo";
		p2.idade = 26;
		
		//EXIBINDO AS INFORMACOES DAS PESSOAS
		System.out.println("Nome: "+ p1.nome);
		System.out.println("idade: "+ p1.idade);
		
		System.out.println("Nome: "+p2.nome);
		System.out.println("idade: "+p2.idade);
		
		System.out.println("-------------------------------------------------------");
		
		//INSTANCIA DA CLASSE CARRO
		System.out.println("Utilizando a classe Carro");
		Carro meuCarro = new Carro();
		
		meuCarro.marca = "Honda";
		meuCarro.modelo = "Civic g10";
		meuCarro.ano = 2021;
		
		System.out.println("Marca: " +meuCarro.marca);
		System.out.println("Modelo: "+meuCarro.modelo);
		System.out.println("Ano: "+meuCarro.ano);
		
		System.out.println("-------------------------------------------------------");
		//INSTANCIA DA CLASSE CACHORRO
		System.out.println("Utilizando a classe CACHORRO");
		Cachorro meuCachorro = new Cachorro();
		
		meuCachorro.nome = "Pipoca";
		meuCachorro.raca = "Pastor Alemão";
		
		System.out.println("Nome: " +meuCachorro.nome);
		System.out.println("Raça: "+meuCachorro.raca);
		
		meuCachorro.latir();
		meuCachorro.comer();
	
			
		
		}
}

