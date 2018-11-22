//q2
public static boolean builds(String s1, String s2){
	if(s2.length()%s1.length() != 0)
		return false;
	for(int i = 0; i<s2.length(); i =i+s1.length())
	{
		if(!perm(s1,s2,i))
			return false;
	}
	return true;
}

private static boolean perm(String s1, String s2, int i){
	int a[] = new int [26];
	int b[] = new int [26];
	for(int j = 0; j<s1.length(); j++){
		a[(int)(s1.charAt(j)-'a')]++;
	}
	for(int k = 0; k<s1.length;k++){
		b[(int)(s2.charAt(i+k) - 'a')]++;
	}
	for(int j = 0; j<a.length; j++){
		if(a[j] != b[j])
			return false;
	}
	return true;
}

// time complexity O(n)