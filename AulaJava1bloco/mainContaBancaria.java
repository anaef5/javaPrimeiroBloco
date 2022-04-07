package POOexercicios;

import java.util.Scanner;

public class mainContaBancaria {

	public static void main(String[] args) {
		contaBancaria cont = new contaBancaria();
		
		Scanner leia = new Scanner(System.in);
		
		cont.agencia = "Bradesco";
		cont.dono = "Ester";
		cont.tipoConta = true;
		
		System.out.print("Saldo atual: ");
		cont.saldo = leia.nextDouble();
		
		cont.depositar();
		
		cont.sacar();
		
		cont.limite = cont.saldo * 0.20;
		
		cont.checagemDeConta();
	}

	

}
