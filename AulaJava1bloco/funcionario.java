package POOexercicios;

public class funcionario {

	String nome;
	boolean autorizacao;
	int diasFaltas;
	
	public void informacoesFunc() {
		System.out.print("Nome do funcion�rio: " + this.nome);
		
		if (nome == "Ana") {
			
		}
		
		
		System.out.print("Quantidade de faltas: " + this.diasFaltas);
		
		if (diasFaltas >= 4) {
			System.out.println("Perto da demiss�o!");
		}
		else if (diasFaltas > 0 && diasFaltas < 4) {
			System.out.println("N�mero aceit�vel mas tente comparecer mais");
		}
		else {
			System.out.println("Muito bem, sem nenhuma falta!");
		}
	}
}
