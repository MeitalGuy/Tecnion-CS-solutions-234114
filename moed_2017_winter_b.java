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

//q3
public static int findMin(String arr[])
{
	int low = 0;
	int high = arr.length-1;
	int mid;
	if(arr[0].compareTo(arr[high]) < 0)
		return 0;
	while(low<=high)
	{
		mid = (low + high)/2;
		if(arr[mid-1].compareTo(arr[mid]) > 0)
			return mid;
		if(arr[0].compareTo(arr[mid]) > 0)
			high = mid - 1;
		else
			low = mid + 1;
	}
	return -1;
}
//time complexity O(m log n)
