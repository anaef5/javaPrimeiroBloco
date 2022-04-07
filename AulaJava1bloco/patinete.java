package POOexercicios;

public class patinete {

	int rodas, anoFab;
	String marca;
	boolean estado;
	
	public void quebrar() {
		boolean estado = false;
	}
	
	public void consertar() {
		boolean estado = true;
	}
	
	public void andar() {
		if (estado == false) {
			System.out.println("Conserte antes de usar!");
		}
		else {
			System.out.println("Pronto para uso");
		}
	}
	
	public void informacoesPatinete() {
		System.out.println("O patinete tem " + this.rodas + " rodas.");
		
		System.out.println("Fabricado no ano de: " + this.anoFab);
		System.out.println("Marca: " + this.marca);
		System.out.println("Está em boas condições? " + this.estado);
		
		
	}
}
