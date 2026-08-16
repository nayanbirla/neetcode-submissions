class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m=board.length;
        int n=board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(board[i][j]!='.' && !isValid(board,i,j)){
                  return false;
               } 
            }
        }

        return true;
    }

    boolean isValid(char board[][],int i,int j){

        for(int k=0;k<board.length;k++){
            if(j!=k && board[i][k]==board[i][j]){
               return false;
            }
        }

        for(int k=0;k<board.length;k++){
            if(i!=k && board[k][j]==board[i][j]){
               return false;
            }
        }

        int row = (i/3)*3;
        int col = (j/3)*3;

        for(int l=row;l<row+3;l++){
            for(int o=col;o<col+3;o++){
                if(!(i==l && j==o) && board[l][o]==board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
