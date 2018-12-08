//q2
public static int findB(String s)
{
	int i = 1;
	while(s.charAt(i) == 'a')
		i = i*2;
	return i;
}
//Time complexity O(log(n))