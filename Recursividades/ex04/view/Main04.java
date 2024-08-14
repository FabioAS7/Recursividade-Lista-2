package view;

import javax.swing.JOptionPane;

import controller.FatDup;

public class Main04 
{
	public static void main(String arg[])
	{
		FatDup m = new FatDup();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o fatorial duplo: "));
		System.out.println("resultado de " + n + "!! = " + m.fatDup(n));
	}

}
