//q2
public static void stableShuffle(int arr[], int start, int n)
{
	if(n<=2)
		return;
	stableShuffle(arr, start, n/2);
	stableShuffle(arr, start+n/2, n/2);
	for(int i = 0; i<n/4; ++i)
		swap(arr, start+n/4+i, start+n/2+i);
}
private static void swap(int arr[], int i, int j)
{
	int x=arr[i];
	arr[i]=arr[j];
	arr[j]=x;
}

//q3
public static char findFirstUnique(String str)
{
	final int SIZE = 128;
	int counts[]=new int [SIZE];
	int first[] = new int [SIZE];
	for(int i = 0; i<first.length; i++)
		first[i] = -1;
	for(int i = 0; i< str.length(); i++)
	{
		if(first[str.charAt(i)] == -1)
			first[str.charAt(i)] = i;
		counts[str.charAt(i)]++;
	}
}
