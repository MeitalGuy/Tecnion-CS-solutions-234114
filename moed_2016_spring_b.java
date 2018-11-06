//q2
public staticc int findDistance(int points[][2], double d){
	int low=0;
	int high = points.length-1;
	int mid;
	di= d*d; //distance
	int dp; //the distance of the current point from (X,Y)
	int dn; //the disrance of the next point
	while(low<=high){
		mid = (low + high) /2;
		dp = (points[mid][0] - X)*(points[mid][0] - X) + (points[mid][1] - Y)*(points[mid][1] - Y);
		dn = (points[mid+1][0] - X)*(points[mid+1][0] - X) + (points[mid+1][1] - Y)*(points[mid+1][1] - Y);
		if(dp<di && dn>=di)
			return mid;
		if(dp>=di)
			high = mid - 1;
		else
			low = mid + 1;
	}
	return -1;
}
//Time complexity O(log(n))