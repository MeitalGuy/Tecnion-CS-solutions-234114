//q2
public static int[] findFactors(int n)
{
	int low=2;
	int high=n/2;
	int mid;
	while(low<=high)
	{
		mid=(low+high)/2;
		if(n%mid==0)
			return {mid, n/mid};
		else
		{
			if(isHighFactorInRange(n, mid, high))
				low=mid+1;
			else
				high=mid-1    
		}
	}
	return -1;
}

	//time compliexity: the function Olog(n) * Olog(n) binary search = O(log^2(n))


//q3 seif a
public static char annoying(String str)
{
	final int RANGE = 128;
	int count[]=new int [RANGE];
	for(int i=0; i<str.length(); i++)
	{
		count[str.charAt(i)]++;
	}

	int max=0;
	char popular='\0';
	for(int i=0; i<count.length; i++)
	{
		if(count[i]>max)
		{

			max=count[i];
			popular=(char)i;
		}
	}
	return popular;
}

//q3 seif b
public static void unAnnoy(String a[])
{
	for(int i=0; i<a.length; i++)
	{
		char popular = annoying(a[i]);
		String temp= "";
		for(int j = 0; j<a[i].length(); j++)
		{
			if(a[i].charAt(j) != popular)
				temp=temp+a[i].charAt(j);
		}
		a[i]=temp;
	}
}
