import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
	    Scanner leitor = new java.util.Scanner(System.in);
	    
	    int i, alunos, aprovado = 0, reprovado = 0, exame = 0;	    
	    double nota1, nota2, totalNota = 0, mediaClasse = 0;
	    
	    System.out.println("Informe quantos alunos ");
	    alunos = leitor.nextInt();
	    
	    for(i = 0; i < alunos; i++) {
	    	
	    	System.out.println("Informe a primeira nota: ");
	    	nota1 = leitor.nextDouble();
	    	System.out.println("Informe a segunda nota: ");
	    	nota2 = leitor.nextDouble();
	    	
	    	if((nota1 + nota2)/2 >= 7 ) {
	    		System.out.println("Aprovado!");
	    		aprovado = aprovado + 1;
	    	}else if ((nota1 + nota2)/2 < 7 && (nota1 + nota2)/2 > 3)  {
	    		System.out.println("Recuperacao!");
	    		exame = exame + 1;
	    	}else {
	    		System.out.println("Reprovado!");
	    		reprovado = reprovado + 1;
	    	}
	    	
	    	mediaClasse = (nota1 + nota2)/2;
	    	totalNota += mediaClasse;
	    }
	    totalNota = totalNota/alunos;
	    System.out.println("Foram " + aprovado + " aprovados.");
	    System.out.println("Foram " + exame + " para exame.");
	    System.out.println("Foram " + reprovado + " reprovados.");
	    System.out.println("Media da turma é de " + totalNota);
	}
}
