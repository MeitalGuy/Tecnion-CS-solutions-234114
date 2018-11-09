//q2
public static String searchAndReplace(String str, String search, String replace)
{
	int a[128] = new int [128];
	for(int i = 0; i<a.length; i++)
	{
		a[i] = -1;
	}
	for(int j = 0; j<search.length(); j++)
	{
		a[(int)search.charAt(j)] = (int)(replace.charAt(j));
	}
	String res = "";
	for(int i = 0; i<str.length(); i++){
		if(a[(int)str.charAt(i)] != -1) 
			res = res + (char)a[(int)str.charAt(i)];
		else
			res = res + str.charAt(i);
	}
	return res;
}
//Time complexity O(n)
	
//q3
public static int factors(int num)
{
	int count = 0;
	for(int i = 0; i*i<num; i++)
	{
		if(num%i == 0)
			count = count + 2;
	}
	if(i*i == num)
		count++;
	return count;
	
}
//Time complexity O(sqrt(n))
//q3
public static boolean findKFctors(int arr[], int k)
{
	return findKFctors(arr,k,0,0);
}
private static boolean findKFctors(int arr[], int k, int i,int sum)
{
	if(i==arr.length)
		return factors(sum) == k;
	boolean opt1 = findKFctors(arr,k,i+1,sum+arr[i]);
	boolean opt2 = findKFctors(arr,k,i+1,sum);
	return opt1||opt2;
}	
