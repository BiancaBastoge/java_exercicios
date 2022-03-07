package Exercicio1_2;

public class Lampada {

	boolean on = false;
	int i = 1;
	
	void click() {
		if(i < 8) {
			if(!on) {
				on = true;
			}
			else{
				on = false;
			}
		}
		
		else {
			on = false;
			System.out.println("~~~~~ Lâmpada Queimada!");
		}
		
		
		System.out.println("Lâmpada " + (on ? "ACESA" : "APAGADA"));
		if(i == 1) {
			System.out.println(i + " Clique");
		}
		else {
			System.out.println(i + " Cliques");
		}
        System.out.println("");
        
        i++;
        
	}
}
