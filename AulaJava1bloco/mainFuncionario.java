package POOexercicios;

import java.util.Scanner;

public class mainFuncionario {

	public static void main(String[] args) {
		funcionario func = new funcionario();
		
		Scanner leia = new Scanner(System.in);
		
		func.nome = "Analista de dados";
		func.autorizacao = false;
		
		System.out.print("Quantos dias você já faltou nesse mês? ");
		func.diasFaltas = leia.nextInt();
		
		func.informacoesFunc();
	}

	}


