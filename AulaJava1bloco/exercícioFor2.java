package aulaLa�os;

import java.util.Scanner;

public class exerc�cioFor2 {

	public static void main(String[] args) {
		Scanner  ent = new  Scanner ( System . in );
		int  num , contPar = 0 , contImpar = 0 ;
		for ( int  i = 1 ; i <= 10 ; i ++)
		{
			System.out.println("Digite um n�mero: ");
			num = ent.nextInt ();
			
			if (num%2==0)
			{
				contPar++;
			}
			 if(num % 2 == 1)
			 {
	            contImpar++;
			 }			 
		}
		System.out.println("Foram digitados "+contPar+" n�meros pares e \n" +contImpar+" n�meros �mpares");
		System.out.println("FIM DO PROGRAMA");
	}
	
}
