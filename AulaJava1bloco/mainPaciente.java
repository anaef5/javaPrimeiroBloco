package POOexercicios;

import java.util.Scanner;

public class mainPaciente {

	public static void main(String[] args) {
		paciente pac = new paciente();
		
		pac.nome="Joana";
		pac.doenca="tosse";
		pac.idade=34;
		pac.sexo=false;
		pac.peso=68;
		
		pac.checarSexo();
		pac.informacaoPaciente(null, null, false, 0, 0);
	}

}
