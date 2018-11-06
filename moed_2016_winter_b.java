//q2
public static String searchAndReplace(String str, String search, String replace)
{
	int a[128] = new int [128];
	for(int i = 0; i<a.length; i++)
	{
		a[i] = -1;
	}
	for(int j = 0; j<search.length(); j++)
	{
		a[(int)search.charAt(j)] = (int)(replace.charAt(j));
	}
	String res = "";
	for(int i = 0; i<str.length(); i++){
		if(a[(int)str.charAt(i)] != -1) 
			res = res + (char)a[(int)str.charAt(i)];
		else
			res = res + str.charAt(i);
	}
	return res;

//Time complexity O(n)