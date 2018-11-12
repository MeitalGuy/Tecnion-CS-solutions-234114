//q3

public static boolean mulElements(int a[], int b[], int goal){
	int low = 0;
	int hi = b.length-1;
	while(low<a.length && hi>=0)
	{
		if(a[low]*b[hi] == goal)
			return true;
		else if(a[low]*b[hi] > goal)
			hi --;
		else
			low++;
	}
	return false;
}
//time complexity O(n)

