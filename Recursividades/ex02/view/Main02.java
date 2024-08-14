package view;

import javax.swing.JOptionPane;

import controller.SubDiv;

public class Main02 
{
	public static void main(String args[])
	{
		SubDiv m = new SubDiv();
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do dividendo: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do divisor: "));
		System.out.println(a + " / " + b + " = " + m.subDiv(a, b));
		
	}
}
