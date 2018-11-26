//q2a
public static int jumpToNextWord(String s, int i){
	if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1)  == ' '))
		return i;
	while(i<s.length() && s.charAt(i) != ' ')
		i++;
	while(i<s.length() && s.charAt(i) == ' ')
		i++;
	return i;
}

//q2b
public static boolean compareWords(String s, int i, int j){
	while(i<s.legnth() && j<s.length() && s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ' && s.charAt(j) != ' '){
		i++;
		j++;
	}
	return ((i==s.length() || s.charAt(i) == ' ') &&(j==s.lenght() || s.charAt(j) == ' '));
}


