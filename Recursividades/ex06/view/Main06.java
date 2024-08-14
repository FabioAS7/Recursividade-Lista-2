package view;

import javax.swing.JOptionPane;
import controller.Invet;

public class Main06 
{
	public static void main(String args[])
	{
		Invet m = new Invet();
		int tamanho;
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vet"));
		int vet[] = new int[tamanho];
		
		for(int i=0; i<tamanho; i++)
		{
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) +" valor: "));
		}
		
		for(int a: vet)
		{
			System.out.print(a + " - " );
		}
		
		vet = m.invet(vet, 0, tamanho-1);
		
		for(int b: vet)
		{
			System.err.print(b + " - " );
		}
	}
}
