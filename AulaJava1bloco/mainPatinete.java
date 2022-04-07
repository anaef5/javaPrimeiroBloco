package POOexercicios;

public class mainPatinete {

	public static void main(String[] args) {
		patinete pat = new patinete();
		
		pat.rodas = 4;
		pat.anoFab = 2021;
		pat.marca = "My little poney";
		pat.estado = true;
		
		pat.informacoesPatinete();
		pat.andar();
	}

}


