package POOexercicios;

public class mainCliente {

	public static void main(String[] args) {
		cliente cliente = new cliente();
		
		cliente.cadastro = true;
		cliente.nome = "Esterzinha";
		cliente.idade = 22;
		cliente.saldo = 5.500;
		
		cliente.status();
		cliente.entrada();
	}
}
