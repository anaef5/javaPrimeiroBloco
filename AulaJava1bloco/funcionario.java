package POOexercicios;

public class funcionario {

	String nome;
	boolean autorizacao;
	int diasFaltas;
	
	public void informacoesFunc() {
		System.out.print("Nome do funcionário: " + this.nome);
		
		if (nome == "Ana") {
			
		}
		
		
		System.out.print("Quantidade de faltas: " + this.diasFaltas);
		
		if (diasFaltas >= 4) {
			System.out.println("Perto da demissão!");
		}
		else if (diasFaltas > 0 && diasFaltas < 4) {
			System.out.println("Número aceitável mas tente comparecer mais");
		}
		else {
			System.out.println("Muito bem, sem nenhuma falta!");
		}
	}
}
