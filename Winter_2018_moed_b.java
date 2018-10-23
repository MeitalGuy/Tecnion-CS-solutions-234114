//q3
public static int getKShortSubstring(String str, int k)
{
	int[] counts=new int[26];
	int maxLength=0;
	int start = 0;
	for(int end = 0; end<str.length(); end++)
	{
		int index = str.charAt(end) -'a';
		counts[index]++;
		while(counts[index]>=k)
		{
			int j = str.charAt(start) - 'a';
			counts[j]--;
			start++;
		}
		int length = end - start + 1;
		if(length > maxLength)
			maxLength = length;
	}
	return maxLength;
}
