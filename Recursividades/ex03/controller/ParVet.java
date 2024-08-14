package controller;

public class ParVet 
{
	public int parVet(int[] vet, int tamanho, int q)
	{
		if(tamanho<0)
		{
			return q;
		}
		else
		{
			if(vet[tamanho]%2==0)
			{
				q++;
			}
			System.out.println("vet["+ tamanho +"] = " + vet[tamanho] + " - " + q);
			return parVet(vet,--tamanho,q);
		}

	}
}
