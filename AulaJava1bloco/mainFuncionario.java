package POOexercicios;

import java.util.Scanner;

public class mainFuncionario {

	public static void main(String[] args) {
		funcionario func = new funcionario();
		
		Scanner leia = new Scanner(System.in);
		
		func.nome = "Analista de dados";
		func.autorizacao = false;
		
		System.out.print("Quantos dias voc� j� faltou nesse m�s? ");
		func.diasFaltas = leia.nextInt();
		
		func.informacoesFunc();
	}

	}


