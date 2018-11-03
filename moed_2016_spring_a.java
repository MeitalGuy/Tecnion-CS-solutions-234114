//q3
public static int countMixedStr(String s1, String s2)
{
	int a1 [] = new int[26];
	int a2 [] = new int [26];
	int i = 0;
	int m = s1.length();
	int count = 0;
	for(i=0; i<s1.length(); i++)
	{
		a1[s1.charAt(i) -'a']++;
	}
	for(i=0; i<m; i++)
	{
		a2[s2.charAt(i) - 'a']++;
	}
	for(i=0; i+m<=s2.length(); i++)
	{
		boolean match = true;
		for(int j = 0; j<a1.length; j++)
		{
			if(a1[j] != a2[j])
				match = false;
		}
		if(match)
			count++;
		a2[s2.charAt(i) -'a']--;
		if(i+m<s2.length())
			a2[s2.charAt(i+m) - 'a']++;
	}
	return count;
}
//O(n+m)
