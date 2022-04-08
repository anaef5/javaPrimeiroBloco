package herança;

public class cavalo extends animal {

private boolean correr = false;
	
	public void animalCorrer() {
		this.correr = true;
		System.out.println("O cavalo está correndo");
	}
	
	public void parado() {
		if(this.correr = false) {
			System.out.println("O cavalo está parado");
		}
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	public void setSom(String som) {
		this.som = som;
	}

	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
}
