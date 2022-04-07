package POOexercicios;

import java.util.Scanner;

public class contaBancaria {

	String agencia, dono;
	boolean tipoConta;
	double saldo, limite;
	double d, s;
	
	Scanner leia = new Scanner(System.in);
	
	public void checaTipoConta() {
		if (tipoConta == true) {
			System.out.println("Esta é uma conta corrente.");
		}
		else {
			System.out.println("Esta é uma conta poupança.");
		}
	}
	
	public void sacar() {
		if (saldo <= 0) {
			System.out.println("Saldo indisponível");
		}
		else {
			System.out.println("Valor a sacar: ");
			s = leia.nextDouble();
			saldo -= s;
			// saldo = saldo - n
		}
	}
	
	public void depositar() {
		System.out.println("Valor a depositar: ");
		d = leia.nextDouble();
		saldo += d;
	}
	
	public void checagemDeConta() {
		System.out.println("A agência é: " + this.agencia);
		System.out.println("O dono da conta é: " + this.dono);
		System.out.println("O tipo da conta é corrente? " + this.tipoConta);
		System.out.println("Saldo da conta: " + String.format("%.3f", this.saldo));
		System.out.println("Limite diário: " + String.format("%.3f", this.limite));
	}
}
