//q1
private static int count(int [][]mat,int i,int j)
{
	if(i==mat.length-1)
		return 1;
	int opt1 = 0;
	int opt2 = 0;
	int opt3 = 0;
	if(mat[i][j]>mat[i+1][j]) //down
	{
		opt1 = count(mat,i+1,j);
	}
	if(j<mat.length-1 && mat[i][j]>mat[i+1][j+1]) //right
	{
		opt2 = count(mat,i+1,j+1);
	}
	if(j>0 && mat[i][j]>mat[i+1][j-1]) // left
	{
		opt3 = count(mat,i+1,j-1);
	}
	return opt1+opt2+opt3;
}

public static int countRopes(int [][]mat)
{
	return(mat,0,0);

}
private static int countRopes(int [][]mat, int j, int count)
{
	if(j==mat.length)
		return count;
	count = count + count(mat,0,j);
	return countRopes(mat,j+1,count);
}

//q2
private static boolean splitTo3(int []arr)
{
	int low = 0;
	int hi = arr.length -1;
	int sum = 0;
	for(int i = 0; i<arr.length;i++)
	{
		sum = sum + arr[i];
	}
	while(low<hi)
	{
		if(sum == 0)
			return true;
		if(sum<0)
		{
			sum = sum -arr[low];
			low++;
		}
		else
		{
			sum = sum - arr[hi];
			hi--
		}
	}
	return false;
}
//Time Compliexty O(n)