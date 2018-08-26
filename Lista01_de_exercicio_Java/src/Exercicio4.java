import java.util.Scanner;

public class Exercicio4 {
	
public static void main(String[] args) {
		
		Scanner leitor = new java.util.Scanner(System.in);
		
		boolean continuar = true;
		String nome;
		double salario,novosalario;
		
	
		
		do {
			System.out.println("Digite seu nome: ");
			nome = leitor.nextLine();
						
			System.out.println("Informe seu salario: ");
			salario = leitor.nextDouble();
			
				if(salario <= 500) {
					novosalario = salario * 0.2;
					salario = salario + novosalario;
					System.out.println("Seu salario teve um aumento de " + novosalario + " reais." + "Seu salario agora e: " + salario);
									
				}else {
					System.out.println("Salario invalido.");
				}
		}while( continuar );
			
	}
}				
	
