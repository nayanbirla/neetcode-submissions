class Solution {
    public boolean exist(char[][] board, String word) {
        boolean vis[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(exist(board,i,j,word,0,vis)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean exist(char board[][],int i,int j,String word,int count,boolean vis[][]){

        

        if(board[i][j]!=word.charAt(count) || vis[i][j]) return false;
        
        vis[i][j]=true;
        count++;
        
        if(count==word.length()) return true;
        if((i+1)<board.length && exist(board,i+1,j,word,count,vis)){
            return true;
        }
    if((j+1)<board[0].length && exist(board,i,j+1,word,count,vis)){
            return true;
        }
        
        if((i-1)>=0 && exist(board,i-1,j,word,count,vis)){
            return true;
        }
        
        if((j-1)>=0 && exist(board,i,j-1,word,count,vis)){
            return true;
        }
        
        vis[i][j]=false;
        return false;
    }
}
