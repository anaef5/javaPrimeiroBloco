package POOexercicios;

public class mainProdutoEletronico {

	public static void main(String[] args) {

		
		produtoEletronico prod = new produtoEletronico();
		
		prod.nome = "Notebook";
		prod.anoFab = 2021;
		prod.porte = false;
		prod.funcTom = true;
		prod.avaliacao = 4.9;
		
		prod.informacoesProd();
	

	}

}
