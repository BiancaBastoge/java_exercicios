package Exercicio1_1;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Bianca", "F", 20, true);
		Churrasco c = new Churrasco();
		
		p.mostrarPessoa();
		c.verificarConsumo(p);
	}
}
 