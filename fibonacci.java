class fibonacci 
{
	public static void main(String[] args) 
	{
		int n1=0, n2=1;
		int n=10;
		for (int i=1;i<=n;i++)
		{
			System.out.print(n1+ "+");
			int sum = n1+n2;
			n1 = n2;
			n2 = sum;
		}
	}
}
