package exerc�cioJAVAbloco1;

import java.util.Scanner;

public class JAVAexercicio4 {

	public static void main(String[] args) {
		int num, resto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o n�mero: ");
		num = leia.nextInt();
		
		resto = num % 2;
				
		if (resto == 0) {
			System.out.println("O n�mero " + num + " � par" + 
		    " e sua raiz quadrada � " +  Math.sqrt(num));
		}
		else {
			System.out.println("O n�mero " + num + " � impar" +
			" e ao elev�-lo ao quadrado, o resultado � " + Math.pow(num, 2));
			
		}
		System.out.println("FIM DO PROGRAMA!");

	}

}
