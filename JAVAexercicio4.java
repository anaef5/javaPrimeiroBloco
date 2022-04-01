package exercícioJAVAbloco1;

import java.util.Scanner;

public class JAVAexercicio4 {

	public static void main(String[] args) {
		int num, resto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		num = leia.nextInt();
		
		resto = num % 2;
				
		if (resto == 0) {
			System.out.println("O número " + num + " é par" + 
		    " e sua raiz quadrada é " +  Math.sqrt(num));
		}
		else {
			System.out.println("O número " + num + " é impar" +
			" e ao elevá-lo ao quadrado, o resultado é " + Math.pow(num, 2));
			
		}
		System.out.println("FIM DO PROGRAMA!");

	}

}
