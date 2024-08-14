package controller;

public class Invet 
{
	public int[] invet(int[] vet, int inicio, int fim)
	{
		if (inicio >= fim)
		{
			return vet;
		}
		else
		{
			int aux = vet[inicio];
			vet[inicio] = vet[fim];
			vet[fim] = aux;
			return invet(vet, (inicio+1) , (fim-1));
		}
	}
}