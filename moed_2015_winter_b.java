public static boolean findAverage(int a[],double x){
	int low = 0;
	int hi = a.length-1;
	double sum = 0;
	double avg = 0;
	for(int i = 0; i<a.length; i++){
		sum = sum + a[i];
	}
	avg = sum / a.length;
	while(low=<hi){
		if( avg == x)
			return true;
		if(avg > x)
		{
			sum = sum - a[hi];
			hi--;
			avg = sum/ (hi - low + 1);
		}
		else{
			sum = sum - a[low];
			low++;
			avg = sum / (hi - low +1);
		}
	}
	return false;
}

//q4
public static int sameAvgGroups(int a[], int res[]){
	return sameAvgGroups(a,res,0,0,0,0,0);
}
private static int sameAvgGroups(int a[], int res[], int i, double sum1, double sum2, int count1, int count2){
	if(i == a.length)
		if(sum1/count1 == sum2/count2)
			return count2;
		else
			return 0;
	int opt1 = sameAvgGroups(a,res,i+1,sum1+a[i],sum2,count1+1,count2);
	if(opt1 != 0)
		return opt1;
	res[count2] = a[i];
	int opt2 = sameAvgGroups(a,res,i+1,sum1,sum2+a[i],count1,count2+1);
	return opt2;
}
