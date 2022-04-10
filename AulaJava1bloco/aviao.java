package POOexercicios;

public class aviao {

	String uso, marca;
	boolean atividade, manutencao;
	int anosConstruido;
	
	public void voar() {
		boolean atividade = true;
		System.out.println("Apertem os cintos: o avião irá decolar!");
	}
	
	public void pousar() {
		boolean atividade = false;
		System.out.println("Estamos pousando!!!");
	}
	public void disponibilidade() {
		if(atividade = true ) {
			System.out.println("Avião está ocupado em rota.");
		}
		else {
			System.out.println("Avião pronto para voar!");
		}
	}
	public void chamarTecnicos() {
		if (manutencao == true) {
			System.out.println("Não precisa, a manutenção está em dia!");
		}
		else {
			System.out.println("Precisando de manutenção!!!");
		}
	}
	public void desgastar() {
		boolean manutencao = false;
	}
	public void revitalizar() {
		boolean manutencao = true;
	}
	public void estadoAviao() {
		System.out.println("O avião foi construído " + this.anosConstruido + " anos atrás");
		System.out.println("O avião é de uso " + this.uso);
		System.out.println("A marca do avião é: " + this.marca);
		System.out.println("Avião está voando no momento? " + this.atividade);
		System.out.println("O avião precisa de manutenção? " + this.manutencao);
	}
}
