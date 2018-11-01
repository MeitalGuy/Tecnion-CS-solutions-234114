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

//q3
public static int countBalance(String str)
{
	final int SIZE = 26;
	int leftArr[] = new int [SIZE];
	int rightArr[] = new int [SIZE];
	int count = 0;
	for(int i = 0; i<str.length(); i++)
	{
		rightArr[str.charAt(i)-'a'] ++;
	}
	for(int i = 0; i<str.length(); i++)
	{
		leftArr[str.charAt(i) - 'a']++;
		rightArr[str.charAt(i)-'a'] --;
		boolean isBalance = true;
		for(int j = 0; j<leftArr.length; j++)
			if(leftArr[j] == 0 && rightArr[j] >0 || leftArr[j] >0 && rightArr[j] == 0)
				isBalance = false;
		if(isBalance)
			count++;
	}
	return count;
}
//Time complexity O(n)
