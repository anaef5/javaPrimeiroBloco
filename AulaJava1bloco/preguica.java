package heran�a;

public class preguica extends animal {

private boolean subirArvore = true;
	
	public void subirArvore() {
		this.subirArvore = true;
		System.out.println("O bicho-pregui�a est� dormindo na �rvore");
	}
	
	public void acordou() {
		if(this.subirArvore==true) {
			this.subirArvore = false;
			System.out.println("O bicho-pregui�a desceu");
		}
		else 
			System.out.println("O bicho-pregui�a n�o est� na �rvore");
	}

	public boolean isSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
}
