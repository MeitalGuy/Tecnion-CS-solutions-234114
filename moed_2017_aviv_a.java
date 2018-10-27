//q3
public static int findSingle(String[] arr){
	int low = 0;
	int high = arr.length-1;
	int mid;
	while(low<=high)
	{
		mid = (low + high) / 2;
		if(arr[mid].equals(arr[mid-1]))
		{
			if(mid%2==0)
				high = mid- 1;
			else
				low = mid + 1;
		}
		else if(arr[mid].equals(arr[mid+1]))
		{
			if(mid%2==0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		else
			return mid;
	}
	return -1;
}
//Time complexity O(m*log(n))
