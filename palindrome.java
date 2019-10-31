class palindrome 
{
	public static void main(String[] args) 
	{
		int num = 919, reverseInteger = 0, reminder, originalno;
		originalno = num;
		while (num!=0)
		{
			reminder = num%10;
			reverseInteger = reverseInteger*10+reminder;
			num=num/10;
		}
		if (originalno == reverseInteger)
			System.out.println(num+ "is a palindrome.");
		else
		System.out.println(num+"is not a palindrome.");
	}
}
