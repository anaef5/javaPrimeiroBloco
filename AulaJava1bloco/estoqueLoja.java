package collection;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class estoqueLoja {

	public static void main(String[] args) {
		String item1 = "Caneta";
		String item2 = "Mochila";
		String item3 = "Papel";
		String item4 = "Agenda";
		int escolha;
		
		ArrayList<String> est = new ArrayList<>();
		Scanner leia = new Scanner(System.in);
		
		est.add(item1);
		est.add(item2);
		est.add(item3);
		est.add(item4);
		
		System.out.println(est);
		
		System.out.println();
		est.remove(3);
		System.out.println(est);
		
		System.out.print("Selecione o item para alterá-lo, ou digite 4 para prosseguir: ");
		escolha = leia.nextInt();
		
		try {
			while (escolha != 4) {
				switch (escolha) {
				case 1:
					System.out.println("Qual o novo produto?");
					item1 = leia.next();
					System.out.println(est);
					System.out.print("Se deseja alterar mais algum, escolha um dos itens. Se não, digite 4 para prosseguir: ");
					escolha = leia.nextInt();
					break;
				case 2:
					System.out.println("Qual o novo produto?");
					item2 = leia.next();
					System.out.println(est);
					System.out.print("Se deseja alterar mais algum, escolha um dos itens. Se não, digite 4 para prosseguir: ");
					escolha = leia.nextInt();
					break;
				case 3:
					System.out.println("Qual o novo produto?");
					item3 = leia.next();
					System.out.println(est);
					System.out.print("Se deseja alterar mais algum, escolha um dos itens. Se não, digite 4 para prosseguir: ");
					escolha = leia.nextInt();
					break;
				case 4:
					System.out.println("Entendido.");
					break;
				}
			}
		} catch (InputMismatchException erro) {
			System.out.println("ERRO" + erro);
			System.out.println("Se deseja alterar mais algum, escolha um dos itens. Se não, digite 5.");
			escolha = leia.nextInt();
		}
	}
	

}
