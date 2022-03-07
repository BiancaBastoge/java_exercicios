package Exercicio1_7;

public class Porta 
{
	Boolean isOpen = false;
	int numAberturas; 
	
	void abrir()
	{
		if(isOpen == false)
		{
		isOpen = true;
		numAberturas = numAberturas + 1;
		}
	}
	
	void fechar()
	{
		if (isOpen == true )
		isOpen = false;
	}
	
	void mostrarAberturas()
	{
		System.out.println( "A porta abriu : ");
		System.out.println( numAberturas);
	}

}
