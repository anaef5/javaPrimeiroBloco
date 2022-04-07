package POOexercicios;

public class produtoEletronico {

	String nome;
	int anoFab;
	boolean porte, funcTom;
	double avaliacao;
	
	public void porteG() {
		boolean porte = true;
	}
	
	public void porteP() {
		boolean porte = false;
	}
	
	public void checarP() {
		if (porte = true) {
			System.out.println("Este produto é de grande porte.");
		}
		else {
			System.out.println("Este produto é de pequeno porte.");
		}
	}
	
	public void naoFunciona() {
		boolean funcTom = false;
	}
	
	public void funciona() {
		boolean funcTom = true;
	}
	
	public void checarFuncionamento() {
		if(funcTom = true) {
			System.out.println("Este produto funciona fora da tomada.");
		}
		else {
			System.out.println("Este produto não funciona fora da tomada.");
		}
	}
	
	public void informacoesProd() {
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Ano de fabricação: " + this.anoFab);
		System.out.println("Produto de porte grande? " + this.porte);
		System.out.println("Funciona fora da tomada? " + this.funcTom);
		System.out.println("Avaliação do produto pelos nossos clientes: " + this.avaliacao);
		
		if (avaliacao < 2.0) {
			System.out.println("Vamos melhorar a qualidade do produto em breve.");
		}
		else if (avaliacao > 2.0 && avaliacao <= 4.0){
			System.out.println("Produto de avaliação mediana, de acordo com nossos clientes.");
		}
		else {
			System.out.println("Produto de excelente avaliação pelos nossos clientes!");
		}
	}
}
