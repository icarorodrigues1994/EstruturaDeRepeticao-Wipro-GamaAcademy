package Exerc2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 String nome;
		 double nota1, nota2, notaFinal;
		 
		System.out.println("Informe o nome do aluno");
		nome = entrada.nextLine();
		
		System.out.println("Informe a primeira nota de " + nome + ":");
		nota1 = entrada.nextDouble();
		System.out.println("Informe a segunda nota de " + nome + ":");
		nota2 = entrada.nextDouble();
		
		notaFinal = (nota1 + nota2) / 2;
		
		if (notaFinal >= 6) {
			System.out.println("Parabéns, você foi aprovado !!");
		}else {
			System.out.println("Infelizmente você foi reprovado.");
		}
		
		
		
	}

}
