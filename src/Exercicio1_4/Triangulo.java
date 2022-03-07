package Exercicio1_4;
import java.lang.Math;

public class Triangulo {
	
	float Lado,Perimetro,Area;
	
	void calcArea ()
	{
		Area = (float) (Math.sqrt(3)/2) * Lado; 
	}
	
	void calcPerimetro ()
	{
		Perimetro = Lado*3;
		
	}
	void mostarArea()
	
	{	System.out.println("Area:");
		System.out.println( Area );
	}
	
	void mostarPerimetro()
	{
		System.out.println("Perimetro:");
		System.out.println( Perimetro );
	}
}
