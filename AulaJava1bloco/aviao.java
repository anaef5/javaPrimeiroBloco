package POOexercicios;

public class aviao {

	String uso, marca;
	boolean atividade, manutencao;
	int anosConstruido;
	
	public void voar() {
		boolean atividade = true;
		System.out.println("Apertem os cintos: o avi�o ir� decolar!");
	}
	
	public void pousar() {
		boolean atividade = false;
		System.out.println("Estamos pousando!!!");
	}
	public void disponibilidade() {
		if(atividade = true ) {
			System.out.println("Avi�o est� ocupado em rota.");
		}
		else {
			System.out.println("Avi�o pronto para voar!");
		}
	}
	public void chamarTecnicos() {
		if (manutencao == true) {
			System.out.println("N�o precisa, a manuten��o est� em dia!");
		}
		else {
			System.out.println("Precisando de manuten��o!!!");
		}
	}
	public void desgastar() {
		boolean manutencao = false;
	}
	public void revitalizar() {
		boolean manutencao = true;
	}
	public void estadoAviao() {
		System.out.println("O avi�o foi constru�do " + this.anosConstruido + " anos atr�s");
		System.out.println("O avi�o � de uso " + this.uso);
		System.out.println("A marca do avi�o �: " + this.marca);
		System.out.println("Avi�o est� voando no momento? " + this.atividade);
		System.out.println("O avi�o precisa de manuten��o? " + this.manutencao);
	}
}
