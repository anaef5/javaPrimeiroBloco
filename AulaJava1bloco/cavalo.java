package heran�a;

public class cavalo extends animal {

private boolean correr = false;
	
	public void animalCorrer() {
		this.correr = true;
		System.out.println("O cavalo est� correndo");
	}
	
	public void parado() {
		if(this.correr = false) {
			System.out.println("O cavalo est� parado");
		}
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
}
