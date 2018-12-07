//q1
public static boolean splitEqualMult(int a[])
{
	return splitEqualMult(a,0,1,1);
}
private static boolean splitEqualMult(int a[], int i, int mult1, int mult2)
{
	if(i==a.length)
		return mult1 == mult2;
	boolean opt1 = splitEqualMult(a,i+1,mult1*a[i],mult2);
	boolean opt2 = splitEqualMult(a,i+1,mult1,mult2*a[i]);
	return opt1 || opt2;
}
//q2
public static boolean findX(int a[], int x)
{
	int low = 0;
	int hi = a.length - 2;
	int mid;
	while(low<=hi)
	{
		mid = (low + hi)/2;
		if(a[mid] + a[mid+1] == x)
			return true;
		if(a[mid] + a[mid+1] > x)
			hi = mid - 1;
		else
			low = mid + 1;
	}
	return false;
}
//Time complexity O(log(n))