package aulaLaços;

import java.util.Scanner;

public class exercícioDoWhile {

	public static void main(String[] args) {
		int num, soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			soma += num;
		} while (num != 0);
		System.out.println("FIM DO PROGRAMA, você digitou '0'!");
		System.out.println("A soma dos números digitados é: " + soma);

	}

}
