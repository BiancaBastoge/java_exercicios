package Exercicio1_1;

public class Pessoa {
	String nome, sexo;
	int idade;
	boolean vegetariana;
	
	Pessoa (String nome, String sexo, int idade, boolean vegetariana){
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.vegetariana = vegetariana;
	}
	
    void mostrarPessoa(){
    	 if (sexo == "F" || sexo == "f"){
         	sexo = "Feminino";
         }
    	 else {
    		 sexo = "Masculino";
    	 }
        System.out.println("> Nome: " + nome);
        System.out.println("> Sexo: " + sexo);
        System.out.println("> Idade: " + idade);
        System.out.println((vegetariana ? "Pessoa Vegetariana" : ""));
    }
}
