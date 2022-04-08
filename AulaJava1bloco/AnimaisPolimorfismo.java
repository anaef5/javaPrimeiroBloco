package herança;

public class AnimaisPolimorfismo {

	public static void main(String[] args) {
		cachorro cão = new cachorro();
		cavalo pocotó = new cavalo();
		preguica zzz = new preguica();
	
		cão.setNome("Cão");
		cão.getNome();
		cão.getIdade();
		System.out.println(cão.getNome());
		System.out.println(cão.getIdade()+" anos");
		cão.getSom();
		cão.animalCorrer();
		System.out.println();
		
		pocotó.setNome("Pocotó");
		pocotó.getNome();
		pocotó.getIdade();
		System.out.println(pocotó.getNome());
		System.out.println( pocotó.getIdade()+" anos");
		pocotó.emitirSom();
		pocotó.animalCorrer();
		System.out.println();
		
		zzz.setNome("Zzzzzz");
		zzz.getNome();
		zzz.getIdade();
		System.out.println(zzz.getNome());
		System.out.println(zzz.getIdade()+" anos");;
		zzz.emitirSom();
		zzz.animalCorrer();
		System.out.println();
		
		System.out.println("eu sei que está uma gororoba errada");
}

	}


