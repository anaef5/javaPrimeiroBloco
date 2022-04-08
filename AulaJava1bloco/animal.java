package herança;

public class animal {

	String nome;
	private String idade;
	protected String som;

	public String getNome() {
		return nome;
	}

	public void setNome(String string) {
		this.nome = string;
	}

	public String getIdade() {
		return idade;
	}

	public void setSexo(String idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
}
