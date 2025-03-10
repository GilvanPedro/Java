public class Main {

	public static void main(String[] args) {
///        Divisão e multiplicação de números inteiros resulta em um número inteiro

		float a = 2f;
		float b = 3f;

		float res = a/b;

		System.out.printf("2.2/3: %.2f\n", res);
		System.out.println("2.2/3: "+ res);
		
		System.out.println("Raiz quadrada de a + b :"+ Math.sqrt(a+b));
		
		
///     		Para raizes que não são quadradas
		System.out.println("Raiz cúbica :"+ Math.pow(a,1.0/3));
		
		System.out.println("a elevado a b :"+ Math.pow(a,b));
	}
}
