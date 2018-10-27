//q2
public static int identifyIndex(int arr[])
{
	int low = 0;
	int high = arr.length-1;
	int mid;
	while(low<=high)
	{
		mid = (high + low) / 2;
		if(arr[mid] == mid)
			return mid;
		if(arr[mid] > mid)
			high = mid - 1;
		else
			low = mid + 1;
	}
	return -1;
}