package controller;

public class MulSoma 
{
	public int mulSom(int a, int b)
	{
		if(b<=1)
		{
			return a;
		}
		else
		{
			return a + mulSom(a, --b);
		}
	}
}
