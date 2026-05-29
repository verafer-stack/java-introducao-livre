package aula007.praticas;

// Sub classe
public class cachorro extends animal{

	@Override
	void emitirSom() {
		System.out.println(nome +" faz: au au");
		
}

	void abanarRabo() {
		System.out.println(nome + " está abanando o rabo");
	}
}