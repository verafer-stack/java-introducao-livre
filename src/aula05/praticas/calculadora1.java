package aula05.praticas;

public class calculadora1 {

public static int somar(int x, int y) {
		
		int resultadoSoma = x + y;
		
		return resultadoSoma;
x
		System.out.println("Resultado: " + somar(10, 20));		
		System.out.println("Resultado: " + somar(5, 6));
		System.out.println("Resultado: " + somar(2, 3));
		System.out.println("Resultado: " + somar(1000, 277));
}
	public static int multiplicar( int x, int y) {
		int resultadoMultiplicacao = x*y;
		return resultadoMultiplicacao;
		

		System.out.println("Resultado: "+ multiplicar(10, 20));
		System.out.println("Resultado: "+ multiplicar(5, 6));
		System.out.println("Resultado: "+ multiplicar(2, 3));
		System.out.println("Resultado: "+ multiplicar(1000, 277));
	}

	public static double dividir(double x, double y ) {
		
	double resultadoDivisao = x / y;
	return resultadoDivisao;	
	if(y == 0) {
		System.out.println("O denominador não pode ser zero");
		return 0;
	}	
		
		System.out.println("Resultado: "+ dividir(10, 20));
		System.out.println("Resultado: "+ dividir(5, 6));
		System.out.println("Resultado: "+ dividir(2, 3));
		System.out.println("Resultado: "+ dividir(1000, 277));
		
	}

	
	public static int subtrair(int x, int y) {
	return x - y;
	}
		System.out.println("Resultado: "+ subtrair(10, 20));
		System.out.println("Resultado: "+ subtrair(5, 6));
		System.out.println("Resultado: "+ subtrair(2, 3));
		System.out.println("Resultado: "+ subtrair(1000, 277));
		

	