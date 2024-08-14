package view;

import javax.swing.JOptionPane;
import controller.ParVet;

public class Main03 
{
	public static void main(String arg[])
	{
		ParVet m = new ParVet();
		int tamanho;
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
		int vet[] = new int[tamanho];
		
		for(int i=0; i<tamanho ;i++)
		{
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		}
		
		System.out.println("existem " + m.parVet(vet, tamanho-1, 0) + " numeros pares nesse vetor");
		
	}

}
