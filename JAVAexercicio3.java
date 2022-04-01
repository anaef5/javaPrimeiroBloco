package exercícioJAVAbloco1;

import java.util.Scanner;

public class JAVAexercicio3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria é Infantil.");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria é Juvenil.");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Sua categoria é Adulto.");
		}
		else {
			System.out.println("Você é novo/velho demais pra entrar.");
		}
		System.out.println("FIM DO PROGRAMA!");
	}

}
