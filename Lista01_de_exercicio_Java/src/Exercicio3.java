import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new java.util.Scanner(System.in);
		
		int numero , i,resultado;
		
		System.out.println("Informe a tabuada que deseja saber: ");
		numero = leitor.nextInt();
		for(i = 0; i < 10; i++) {
			resultado = numero*i; 
			System.out.println(resultado);
			
			
		}
		
		
	}

}
