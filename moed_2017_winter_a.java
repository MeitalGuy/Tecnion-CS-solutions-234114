//q3a
public static int compare_to_new(String s1, String s2, char[] abc)
{
	int index = 0;
	while(index < s1.length() && index < s2.length() && s1.charAt(index) == s2.charAt(index))
		index++;
	if(index == s1.length() && index == s2.length())
		return 0; // if the strings are equal
	if(index == s1.length())
		return -1; // s1 is before s2
	if(index == s2.length())
		return 1; // s2 is before s1
	for(int i = 0; i<abc.length; i++)
	{
		if(abc[i] == s1.charAt(index)) // s1 is before s2
			return -1;
		if(abc[i] == s2.charAt(index))
			return 1; // s2 before s1
	}
	return -2;  // we will not get here
}
//time complexity O(n)

//q3b
public static findSortedWords(String words[], char[] abc)
{
	int low = 0;
	int high = words.length-1;
	int mid;
	while(low < high){
		mid = (low + high)/2;
		if(compare_to_new(words[mid], words[mid+1], abc) == -1)
			return mid;
		if(compare_to_new(words[low],words[mid],abc) == -1)
			high = mid -1;
		else
			low = mid + 1;
	}
	return -1'
}