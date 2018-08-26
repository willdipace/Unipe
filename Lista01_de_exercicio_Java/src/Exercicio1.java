import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new java.util.Scanner(System.in);
		
		double salario, aumento, novosalario, per;
		
		System.out.println("Digite o seu salario: ");
		salario = leitor.nextDouble();
		
		System.out.println("Percentual de aumento: ");
		aumento = leitor.nextDouble();
		
		per = (salario*aumento/100);
		novosalario = salario + per;
		
		System.out.println("Seu salario agora é: " + novosalario + " com o aumento de " + per + " reais" + "("+ aumento + "%)");
		
		
		
	}

}
