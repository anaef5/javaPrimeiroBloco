package herança;

public class preguica extends animal {

private boolean subirArvore = true;
	
	public void subirArvore() {
		this.subirArvore = true;
		System.out.println("O bicho-preguiça está dormindo na árvore");
	}
	
	public void acordou() {
		if(this.subirArvore==true) {
			this.subirArvore = false;
			System.out.println("O bicho-preguiça desceu");
		}
		else 
			System.out.println("O bicho-preguiça não está na árvore");
	}

	public boolean isSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
}
