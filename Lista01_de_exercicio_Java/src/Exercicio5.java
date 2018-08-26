import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leitor = new java.util.Scanner(System.in);
		
		double totalgas, totalrefri, litros, total;
		int quantidade;
		
		System.out.println("Quantos refrigerantes? ");
		quantidade = leitor.nextInt();
		totalrefri = quantidade * 3.00;
		
		System.out.println("Quantos Litros de gasolina? ");
		litros = leitor.nextDouble();
		totalgas = litros * 2.50;
		
		total = totalgas + totalrefri;
		
		System.out.println("Total a pagar: " + total + " reais.");
		
		
	}	
		
}
