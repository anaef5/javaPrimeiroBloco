package exerc�cioJAVAbloco1;

import java.util.Scanner;

public class JAVAtopDeLinha2 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
        
		int n1,n2,n3;
				
		System.out.println("Entre com o primeiro n�mero: ");
		n1=num.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		n2=num.nextInt();
		
		System.out.println("Entre com o terceiro n�mero: ");
		n3=num.nextInt();

		if(n1<n2)
		{
			if(n2<n3)
			{
				System.out.println("A ordem crescente correta �: " + (n1) + " " + (n2) + " " + (n3));
			}
			else if(n1<n3) 
			{
				System.out.println("A ordem crescente correta �: "+(n1) + (n3) + (n2));
			} 
			else 
			{
				System.out.println("A ordem crescente correta �: "+(n3) + (n1) + (n2));
			}
		}
			else if(n2<n3) 
			{
				if(n1<n3) 
				{
					System.out.println("A ordem crescente correta �: "+(n2) + (n1) + (n3));
				}else 
				{
					System.out.println("A ordem crescente correta �: "+(n2) + (n3) + (n1));
				}
			} 
			else 
			{
				System.out.println("A ordem crescente correta �: "+(n3) + (n2) + (n1));
			}


	}

}
