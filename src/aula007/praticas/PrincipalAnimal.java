package aula007.praticas;

public class PrincipalAnimal {


	public static void main(String[] args) {
		//Criando um cachorro
		aula007.praticas.cachorro cachorro = new cachorro();
		cachorro.nome = "Pipoca";
		cachorro.emitirSom();
		cachorro.abanarRabo();
		System.out.println("------------------------------");
		
		//criando um gato
		aula007.praticas.gato gato = new gato();
		gato.nome = "Mitsy";
		gato.emitirSom();
		gato.ronronar();
		
	}
}
