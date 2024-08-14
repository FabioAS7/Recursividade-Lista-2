package controller;

public class FatDup 
{
	public int fatDup(int n)
	{
		if(n<0)
		{
			return 1;
		}
		else
		{
			return n * fatDup(n-2);
		}
	}
}
