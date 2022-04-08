package Exerc3;


import java.util.Scanner;




public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] count  = new int[4];
        String[] alunos = new String[4];
        
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Informe o nome do candidato: ");
            alunos[i] = entrada.nextLine();
        }


        int votarDenovo;
        
        do {
        	System.out.println();
            System.out.println("Em quem voc� quer vota: ");
            System.out.println("1- " + alunos[0]);
            System.out.println("2- " + alunos[1]);
            System.out.println("3- " + alunos[2]);
            System.out.println("4- " + alunos[3]);
            int x = entrada.nextInt();
            switch (x) {
                case 1:
                    count[0]++;

                    break;
                case 2:
                    count[1]++;

                    break;
                case 3:
                    count[2]++;

                    break;
                case 4:
                    count[3]++;
                    break;
                default:
                    System.err.println("Candidato inv�lido.");
                    break;
            }
            
            System.out.println("Quer vota novamente ??");
            System.out.println(" 1-sim   2-n�o");
            votarDenovo = entrada.nextInt();
        } while (votarDenovo == 1);
        
        
        System.out.println(alunos[0] + " " + count[0] + " votos");
        System.out.println(alunos[1] + " " + count[1] + " votos");
        System.out.println(alunos[2] + " " + count[2] + " votos");
        System.out.println(alunos[3] + " " + count[3] + " votos");
        
        int maisVotado = 0, contador = 0, referencia = 0;
        String frase = null;
        for(int voto : count) {
        	if (voto > maisVotado) {
        		maisVotado = voto;
        	}
        }
        
        for(int e : count) {
        	if(e == maisVotado) {
        		contador++;
        		if(contador>= 2) {
            		frase = frase + alunos[referencia] + " - " + count[referencia] + " votos\n";
            	} else {
            		frase = alunos[referencia] + " - " + count[referencia] + " votos\n";
            	}
        		
        	
        	referencia++;
        }
        }
        
        System.out.println();
        if(contador >= 2) {
        	System.out.println("Houve um empate entre os alunos abaixo : ");
        	System.out.println(frase);
        }else {
        
        
        if (count[0] == maisVotado) {
        	System.out.println("O vencedor foi "+ alunos[0] + " !!");
        }else if (count[1] == maisVotado) {
        	System.out.println("O vencedor foi "+ alunos[1] + " !!");}
        	else if (count[2] == maisVotado) {
            	System.out.println("O vencedor foi "+ alunos[2] + " !!");}
            	else if (count[0] == maisVotado) {
                	System.out.println("O vencedor foi "+ alunos[3]+ " !!");
  
    } 
        }
    
    
}
}


