package Exerc1;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		Integer numero, numeroAleatorio, count = 0;
		
		System.out.println("Tente adivinhar o número aleátorio de 0 a 10... ");
		Scanner entrada = new Scanner(System.in);
		numeroAleatorio =  random.nextInt(10);
		
		
		do {
			System.out.println("Digite um número abaixo:");
			numero = entrada.nextInt();
			
			if (numero == numeroAleatorio) {
				count++;
				System.out.println("Você adivinhou o numero !!");
				System.out.println("Numero de tentativas : " + count);
				
			} else if (numero > numeroAleatorio) {
				count++;
				System.out.println("Você errou... O número aleátorio é menor que o número citado");
				
			} else {
				count++;
				System.out.println("Você errou... O número aleátorio é maior que o número citado");
			}
			
		} while(numero != numeroAleatorio);
		
		
				
	}

}
