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
