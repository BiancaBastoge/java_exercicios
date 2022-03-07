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
		System.out.println((i == 1 ? i + " Clique" : i + " Cliques "));
        	System.out.println("");
        
        	i++;
	}
}
