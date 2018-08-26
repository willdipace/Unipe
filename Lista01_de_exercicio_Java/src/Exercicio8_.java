import java.util.Scanner;

public class Exercicio8_ {
	

	public static void main(String[] args) {
		
	    Scanner leitor = new java.util.Scanner(System.in);
	    
	    //Não entendi direito a questao, se deveria usar o private
	    //Assim usando a criando individualmente para cada caso
	    double diaria = 40.00, taxa, totalPagar;
	    String nome;
	    
	    System.out.println("Ditige o nome do cliente: ");
	    nome = leitor.nextLine();
	    
	    System.out.println("Quantos dias foram registrados? ");
	    taxa = leitor.nextDouble();
	    if(taxa < 10) {
	    	totalPagar = 10 + diaria;
	    	System.out.println("O cliente " + nome + " deve: " + totalPagar);
	    	
	    }else if(taxa >= 10){
	    	totalPagar = (8*taxa) + diaria;
	    	System.out.println("O cliente " + nome + " deve: " + totalPagar);
	    	
	    }else {
	    	System.out.println("Valor invalido!");
	    }
	    
		
	}	
		
}