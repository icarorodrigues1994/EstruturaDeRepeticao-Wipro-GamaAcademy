package Exerc1;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		Integer numero, numeroAleatorio, count = 0;
		
		System.out.println("Tente adivinhar o n�mero ale�torio de 0 a 10... ");
		Scanner entrada = new Scanner(System.in);
		numeroAleatorio =  random.nextInt(10);
		
		
		do {
			System.out.println("Digite um n�mero abaixo:");
			numero = entrada.nextInt();
			
			if (numero == numeroAleatorio) {
				count++;
				System.out.println("Voc� adivinhou o numero !!");
				System.out.println("Numero de tentativas : " + count);
				
			} else if (numero > numeroAleatorio) {
				count++;
				System.out.println("Voc� errou... O n�mero ale�torio � menor que o n�mero citado");
				
			} else {
				count++;
				System.out.println("Voc� errou... O n�mero ale�torio � maior que o n�mero citado");
			}
			
		} while(numero != numeroAleatorio);
		
		
				
	}

}
