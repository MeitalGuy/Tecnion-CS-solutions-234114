//q4
public static boolean search(char board[M][M], String word, int i, int j, int k){
	if(k==word.length())
		return true;
	if(i<0||j<0||i>=board.length||j>=board.length)
		return false;
	if(word.charAt(k) != board[i][j])
		return false;
	char temp = board[i][j];
	board[i][j] = '\0';
	boolean opt1 = search(board,word,i,j+1,k+1);
	boolean opt2 = search(board,word,i+1,j,k+1);
	boolean opt3= search(board,word,i-1,j,k+1);
	boolean opt4 = search(board,word,i,j-1,k+1);
	board[i][j] = temp;
	return opt1||opt2||opt3||opt4;
}

public static boolean searchWord(char board[M][M], String word)
{
	return searchWord(board, word, 0, 0);
}
private static boolean searchWord(char board[M][M], String word, int i, int j){
	if(i==board.length)
		return false; // we arrive to the end of the matrix and we do not find anything
	boolean opt1 = search(board,word,i,j,0);
	if(opt1)
		return true;
	if(j == board[0].length-1)
		return searchWord(board,word,i+1,0);
	return searchWord(board,word,i,j+1);
}