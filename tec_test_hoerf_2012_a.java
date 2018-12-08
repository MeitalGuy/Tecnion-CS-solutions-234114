//q3
public static boolean isLegal(int a[], int k)
{
	int b[] = new int[k];
	for(int i = 0; i<a.length; i++)
	{
		b[a[i]]++;
	}
	for(int j = 0; j<b.length; j++)
	{
		if(b[j]>1)
			return false;
		if(j+1<b.length && b[j]>0 && b[j+1]>0)
			return false;
	}
	return true;
}
//Time complexity O(n+k)