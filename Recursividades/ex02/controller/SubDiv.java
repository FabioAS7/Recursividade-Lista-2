package controller;

public class SubDiv 
{
	public int subDiv(int a, int b)
	{
		if(a<b)
		{
			return a;
		}
		else
		{
			return subDiv((a-b), b);
		}
	}

}
