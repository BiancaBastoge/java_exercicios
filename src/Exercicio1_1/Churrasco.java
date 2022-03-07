package Exercicio1_1;

public class Churrasco {
	
	double qtdCarne;
	
	void verificarConsumo(Pessoa p){
		if(p.idade < 4 || p.vegetariana) {
			qtdCarne = 0;
		}
		else if(p.idade < 13){
			qtdCarne = 1;
		}
		else{
			qtdCarne = 2;
		}
		
		System.out.println("Consumo de Carne: " + qtdCarne + "KG");
	}
}
