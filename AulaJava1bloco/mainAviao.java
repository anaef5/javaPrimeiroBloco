package POOexercicios;

public class mainAviao {

	
		public static void main(String[] args) {
			aviao aviao = new aviao();
			
			aviao.anosConstruido = 50;
			aviao.uso = "ex�rcito";
			aviao.marca = "latam";
			aviao.atividade = true;
			aviao.manutencao = false;
			
			aviao.estadoAviao();
		}
}
