//q1
public static int shortestPath(int [][] mat)
{
	return shortestPath(mat,0,0);
}
private static int shortestPath(int [][] mat,int i,int j)
{
	if(i<0|| j<0||i>=mat.length||j>=mat[0].length)
		return Integer.MAX_VALUE;
	if(i == mat.length-1 && j == mat[0].length)
		return 0;
	int opt1 =  Integer.MAX_VALUE;
	int opt2 =  Integer.MAX_VALUE;
	int opt3 =  Integer.MAX_VALUE;
	int opt4 =  Integer.MAX_VALUE;
	if(i+1<mat.length && mat[i][j]<mat[i+1][j])
		opt1 = shortestPath(mat,i+1,j);
	if(j+1<mat[0].length && mat[i][j]<mat[i][j+1])
		opt2 = shortestPath(mat,i,j+1);
	if(j>0 && mat[i][j]<mat[i][j-1])
		opt3 = shortestPath(mat,i,j-1);
	if(i>0 && mat[i][j]<mat[i-1][j])
		opt4=shortestPath(mat,i-1,j);
	return min(min(opt1,opt2),min(opt3,opt4));
}
private static int min(int a, int b)
{
	if(a<b)
		return a;
	else
		return b;
}

//q2a
private static boolean sum2(int []arr, int num)
{
	int low = 0;
	int hi = arr.length - 1;
	while(low<hi)
	{
		if(arr[low]+arr[hi] == num)
			return true;
		if(arr[low]+arr[hi]<num)
			low++;
		else
			hi--;
	}
	return false;
}
//Time complexity O(n)

//q2b
public static boolean sum3(int[]arr,int num)
{
	int low,hi,mid;
	for(hi = arr.length - 1; hi>1; hi--)
	{
		low = 0;
		mid = hi - 1;
		while(low<mid)
		{
			if(arr[low]+arr[mid]+arr[hi] == num)
				return true;
			if(arr[low]+arr[mid]+arr[hi]>num)
				mid--;
			else
				low++;
		}
	}
	return false;
}
//Time complexity O(n^2)