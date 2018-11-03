//q2
public static int findDominant(int a[], int x)
{
	int b[] = new int [10];
	for(int i=0; i<a.length-1; i++)
	{
		if(a[i]<a[i+1] && a[i+1] > b[i])
			b[i] = a[i+1];
	}
	while(b[x] != 0)
		x = b[x];
	return x;
}
///time complexity = O(n)