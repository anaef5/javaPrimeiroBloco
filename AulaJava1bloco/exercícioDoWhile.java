package aulaLa�os;

import java.util.Scanner;

public class exerc�cioDoWhile {

	public static void main(String[] args) {
		int num, soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			soma += num;
		} while (num != 0);
		System.out.println("FIM DO PROGRAMA, voc� digitou '0'!");
		System.out.println("A soma dos n�meros digitados �: " + soma);

	}

}
