package Exercicio1_5;
import java.lang.Math;

public class NumerosAleatorios {
	
	int numeroQualquer;
	
	void sortearNumero ()
	{
		numeroQualquer = ( int ) (java.lang.Math.random() * 100 + 1);
	}
	
	void mostrarNumero ()
	
	{
		System.out.println( "O numero sorteado foi : ");
		System.out.println(numeroQualquer);
	}

}
