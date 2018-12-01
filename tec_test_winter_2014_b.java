//q2a
public static int closest(double a[], double x){
	int low = 0;
	int hi = a.length - 1;
	int mid;
	while(low<hi-1){
		mid = (low + hi)/2;
		if(a[mid] == x)
			return mid;
		if(a[mid]<x)
			hi = mid-1;
		else
			low = mid + 1;
	}
	if(abs(x-a[low]) > abs(x-a[hi]))
		return hi;
	else
		return low;
}

public static double abs(double x){
	if(x<0)
		return -x;
	else
		return x;
}
//time compliexty O(log(n))
//q2b
public static int range(double a[], double min, double max){
	int close_to_min = closest(a,min);
	int close_to_max = closest(a,max);
	if(a[close_to_min] < min)
		close_to_min++;
	if(a[close_to_max] > max)
		close_to_max--;
	return close_to_max - close_to_min + 1;
}
//time compliexty O(log(n))

//q4
public static boolean split(int []a, int diff){
	return split(a,diff,0,0,0);
}
private static boolean split(int []a, int diff, int i,int sum1,int sum2){
	if(i==a.length){
		if(sum1-sum2 == diff)
			return true;
		else
			return false;
	}
	boolean opt1 = split(a,diff,i+1,sum1+a[i],sum2);
	boolean opt2 = split(a,diff,i+1,sum1,sum2+a[i]);
	return opt1||opt2;
}