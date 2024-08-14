package controller;

public class MDC 
{
	public int mdc(int x, int y)
	{
		if(x>y)
		{
			return mdc(x-y,y);
		}
		else
		{
			if(x==y)
			{
				return x;
			}
			return mdc(y, x);
		}
	}
}
