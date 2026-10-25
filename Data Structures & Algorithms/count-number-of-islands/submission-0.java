class Solution {

    static class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }

    public int numIslands(char[][] grid) {
        
        Queue<Pair> points =new LinkedList<>();
        int ans=0;
        for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    mark(grid,points,i,j);
                }
            }
        }
        return ans;
    }

    int dir[][]={{-1,0},{1,0},{0,-1},{0,1}}; 
    void mark(char[][] grid,Queue<Pair> points,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return;
        } 

        grid[i][j]='2';

        for(int d[]:dir){
            int nr=i+d[0];
            int nc=j+d[1];

            if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length || grid[nr][nc]!='1') continue;
            
            mark(grid,points,nr,nc);
        }

    }
}
