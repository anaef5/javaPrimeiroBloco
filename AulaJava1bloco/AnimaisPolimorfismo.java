package heran�a;

public class AnimaisPolimorfismo {

	public static void main(String[] args) {
		cachorro c�o = new cachorro();
		cavalo pocot� = new cavalo();
		preguica zzz = new preguica();
	
		c�o.setNome("C�o");
		c�o.getNome();
		c�o.getIdade();
		System.out.println(c�o.getNome());
		System.out.println(c�o.getIdade()+" anos");
		c�o.getSom();
		c�o.animalCorrer();
		System.out.println();
		
		pocot�.setNome("Pocot�");
		pocot�.getNome();
		pocot�.getIdade();
		System.out.println(pocot�.getNome());
		System.out.println( pocot�.getIdade()+" anos");
		pocot�.emitirSom();
		pocot�.animalCorrer();
		System.out.println();
		
		zzz.setNome("Zzzzzz");
		zzz.getNome();
		zzz.getIdade();
		System.out.println(zzz.getNome());
		System.out.println(zzz.getIdade()+" anos");;
		zzz.emitirSom();
		zzz.animalCorrer();
		System.out.println();
		
		System.out.println("eu sei que est� uma gororoba errada");
}

	}


