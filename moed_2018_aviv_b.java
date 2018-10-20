//q2
public static void stableShuffle(int arr[], int start, int n)
{
	if(n<=2)
		return;
	stableShuffle(arr, start, n/2);
	stableShuffle(arr, start+n/2, n/2);
	for(int i = 0; i<n/4; ++i)
		swap(arr, start+n/4+i, start+n/2+i);
}
private static void swap(int arr[], int i, int j)
{
	int x=arr[i];
	arr[i]=arr[j];
	arr[j]=x;
}

//q3
public static char findFirstUnique(String str)
{
	final int SIZE = 128;
	int counts[]=new int [SIZE];
	int first[] = new int [SIZE];
	for(int i = 0; i<first.length; i++)
		first[i] = -1;
	for(int i = 0; i< str.length(); i++)
	{
		if(first[str.charAt(i)] == -1)
			first[str.charAt(i)] = i;
		counts[str.charAt(i)]++;
	}
}

//q4
    public static boolean P(int arr[], int n) 
    {
        return P(arr,n, 0, 1);
    }

    private static boolean P(int arr[], int n, int i, int num)
    {
        if(i+num+1>=arr.length)
            return false;
        if(num > n)
            return true;
        if(arr[i] == 0 && arr[i+num+1] == 0)
        {
            arr[i] = num;
            arr[i+num+1]=num;
            boolean opt1 = P(arr,n,0,num+1);
            if(opt1)
                return true;
            else
            {
                arr[i] = 0;
                arr[i+num+1] = 0;
            }
        }
        boolean opt2 = P(arr,n,i+1,num);
        return opt2;
    }

//Test for q4
    public static void main(String args[])
    {
        for (int i=1; i<11; i++) 
        {
            int arr[] = new int[2*i];
            boolean res = P(arr, i);
            System.out.print("n="+i+": " + res);
            if (res)
            {
                System.out.print(" [");
                for (int j=0; j < arr.length - 1; j++)
                    System.out.print(arr[j] + ", ");
                System.out.print(arr[arr.length-1] + "]");
            }
            System.out.println();
        }
    }
