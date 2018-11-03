//q3a
public static boolean IsWord(String mainWord, String testWord)
{
	int arr1[] = new int [26];//the goal of the array is to count how many times each letter appears in mainWord
	int arr2[] = new int [26];//the goal of the array is to count how many times each letter appears in testWord
	for(int i = 0; i<mainWord.length(); i++)
	{
		int p = mainWord.charAt(i)-'a';
		arr1[p]++;
	}
	for(int i = 0; i<testWord.length(); i++)
	{
		int q = testWord.charAt(i) - 'a';
		arr2[q]++;
	}
	for(int i = 0; i<arr1.length; i++)
	{
		if(arr1[i] < arr2[i])
			return false;
		
	}
	return true;
}
//q3b

public static int WordScore(String dictionary[], String word)
{
	int count = 0;
	for( int i = 0; i< dictionary.length; i++)
	{
		if(IsWord(word, dicionary[i]))
			count++;
	}
	return count-1;
}
