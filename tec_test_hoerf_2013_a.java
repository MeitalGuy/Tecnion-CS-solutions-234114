//q2
private static void swap(int a[], int i, int j)
{
	int temp;
	temp = a[i];
	a[i] = a[j];
	a[j] = temp;
}

public static void updateArr(int a[], int i, int x)
{
	a[i] = a[i] + x;
	while(a.length > i+1 && a[i] > a[i+1])
	{
		swap(a,i,i+1);
		i++;
	}
	return;
}
//Time complexity O(x)