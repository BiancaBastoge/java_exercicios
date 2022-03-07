package Exercicio1_6;
import java.lang.Math;


public class Eq2Grau {
	
	double a,b,c;
	public double d;
	
	void  delta () 
	{
		d = ( b*b ) - 4 *a *c;
		 
		
	}
	
	 double raiz1()
	{
		double r = (- b + (Math.sqrt(d)))/(2 * a);

		return r;
	}
	 
	 double raiz2()
		{
		 double r = (- b - (Math.sqrt(d)))/(2 * a);

			
			return r;
		}
	 
	 void verificarRaiz()
	 {
		 if (raiz1() < 0 && raiz2() < 0)
			 {System.out.println( "Não a raizes Naturais");}
		 else if (raiz2() < 0)
		 	{
			 System.out.println( raiz1() );
			 System.out.println( "NaN" );
			 }
		 else if (raiz1()< 0)
			{
			 System.out.println( "NaN" );
			 System.out.println(raiz2() );
		 	}
		 else 
		 {
			 System.out.println(raiz1());
		 	 System.out.println(raiz2());
		 }
		 		 
		 
	 }

}
