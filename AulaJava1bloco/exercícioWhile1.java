package aulaLaços;

import java.util.Scanner;

public class exercícioWhile1 {

	public static void main(String[] args) {
		int idade, cont21=0, cont50=50;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma idade: ");
		idade=ler.nextInt();


		while(idade != -99)
		{
		if(idade<21) {
			cont21++;
		}
		if(idade>50) {
			cont50++;
		}
		System.out.println("Digite uma idade: ");
		idade = ler.nextInt();
		}
		System.out.println("O total de pessoas com menos 21 anos é: " + cont21);
		System.out.println("O total de pessoas com mais 50 anos é: " + cont21);
	}

}
