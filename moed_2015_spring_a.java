//q3
public static String trimSpecial(String str, String special){
	boolean arr[] = new int [128];
	for(int i = 0; i<special.length(); i++) {
		arr[(int)special.charAt(i)] = true; 
	}
	String temp = "";// this the new we string that will be after deleting chars from special
	for(int i = 0; i<str.length(); i++){
		if(arr[(int)str.charAt(i)] != true) // the char does not appear in special
			temp = temp + str.charAt(i);
	}
	return temp;
}
//time complexity O(n+m)