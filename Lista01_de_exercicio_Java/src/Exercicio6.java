import java.util.Scanner;

public class Exercicio6 {

public static void main(String[] args) {
		
    Scanner leitor = new java.util.Scanner(System.in);
    double salario, emprestimo;
    
    System.out.println("Informe o seu salário: ");
	salario = leitor.nextDouble();
	
	System.out.println("Informe o emprestimo: ");
	emprestimo = leitor.nextDouble();
	
	if (salario * 0.3 >= emprestimo) {
		System.out.println("Emprestimo concedido!");
	}else {
		System.out.println("Emprestimo superior a 30% do seu salário, não concedido!");
	}
	}
}