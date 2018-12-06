//q3
public static void zero_test(int a[])
{
	int dist = a.length;
	for(int i = 0; i<a.length; i++)
	{
		if(arr[i] == 0)
			dist = 0;
		a[i] = dist;
		dist++;
	}
	for(int j = a.length-1; j>0; j--)
	{
		if(arr[j] == 0)
			dist = 0;
		if(dist<a[j])
			a[j] = dist;
		dist++;
	}
}
//time compliexity O(n)