package view;

import javax.swing.JOptionPane;
import controller.MDC;

public class Main05 {

	public static void main(String[] args) 
	{
		MDC m = new MDC();
		int x, y;
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1 valor: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 valor: "));
		
		System.out.println(m.mdc(x, y));

	}

}
