//q4
public static int change(int coins[], int sum){
	return change(coins,sum,0);
}
private static int change(int coins[],int sum,int i){
	if(i==coins.length)
		return 0;
	if(sum==0)
		return 1;
	if(sum<0)
		return 0;
	int opt1 = change(coins,sum-coins[i],i);
	int opt2= change(coins,sum,i+1);
	return opt1+opt2;
}