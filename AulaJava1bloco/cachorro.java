package heran�a;

public class cachorro extends animal {
	private boolean correr = false;
	
	public void animalCorrer() {
		this.correr= true;
		System.out.println("O Animal est� correndo");
	}
	
	public void parado() {
		if(this.correr == true) {
			this.correr = false;
			System.out.println("O animal est� parado.");
		}
		else if(this.correr == false) {
			this.correr = true;
			System.out.println("O animal j� est� parado");
		}
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

}
