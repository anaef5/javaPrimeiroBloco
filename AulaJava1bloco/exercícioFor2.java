package aulaLaços;

import java.util.Scanner;

public class exercícioFor2 {

	public static void main(String[] args) {
		Scanner  ent = new  Scanner ( System . in );
		int  num , contPar = 0 , contImpar = 0 ;
		for ( int  i = 1 ; i <= 10 ; i ++)
		{
			System.out.println("Digite um número: ");
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
		System.out.println("Foram digitados "+contPar+" números pares e \n" +contImpar+" números ímpares");
		System.out.println("FIM DO PROGRAMA");
	}
	
}
