package aula007.praticas;

// Gato é uma sub classe de Animal
public class gato extends animal{
	
//Sobreescrita do método emitirSom()
	@Override
	void emitirSom() {
		System.out.println(nome + " faz: miau miau");
	
	}
	//método especifico da classe Cachorro
	void ronronar() {
		System.out.println(nome + " está ronronando");
	}
}
