package aulaLa�os;

import java.util.Scanner;

public class exerc�ciosDoWhile2 {

	public static void main(String[] args) {
		

			int num, resto, soma = 0, cont = 0;
			double media;

			Scanner leia = new Scanner(System.in);

			do {
				System.out.print("Digite um n�mero: ");
				num = leia.nextInt();

				resto = num % 3;

				if (resto == 0 && num != 0) {
					soma += num;
					cont++;
				}
				media = soma / cont;
			} while (num != 0);
			System.out.println("FIM DO PROGRAMA, voc� '0'! Mas...");
			System.out.println("A m�dia nos n�meros inseridos que s�o m�ltiplos de 3 �: "
			+ media);

	}

}
