public static String encode(String s, int k)
{
	String str = "";
	for(int i=0; i<s.length(); i++)
	{
		char temp = s.charAt(i) - k;
		if(temp<'a')
			temp = temp + ('z'-'a'+1);
		str = str + temp;
	}
	return str;
}

public static String decode(String s, int k)
{
	String str = "";
	for(int i=0; i<s.length(); i++)
	{
		char temp = s.charAt(i) + k;
		if(temp>'z')
			temp = temp - ('z'-'a'+1);
		str = str + temp;
	}
	return str;
}

//Time Complexity O(n)