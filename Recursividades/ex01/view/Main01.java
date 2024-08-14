package view;
import javax.swing.JOptionPane;
import controller.MulSoma;

public class Main01 
{
	public static void main(String args[])
	{
		int a, b;
		MulSoma m = new MulSoma();
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser multiplicado: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vezes da multiplicacao: "));
		System.out.println("O resultado de " + a + " * " + b + " = " + m.mulSom(a, b));
		
	}

}
