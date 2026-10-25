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
        int ans=0;
        Queue<Pair> pair= new LinkedList<>();
        for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    pair.add(new Pair(i,j));
                    mark(grid,i,j,pair);
                }
            }
        }
        return ans;
    }

    int dir[][]={{-1,0},{1,0},{0,-1},{0,1}}; 
    void mark(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return;
        } 

        grid[i][j]='2';

        for(int d[]:dir){
            int nr=i+d[0];
            int nc=j+d[1];

            if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length || grid[nr][nc]!='1') continue;
            
            mark(grid,nr,nc);
        }
    }

    void mark(char[][] grid,int i,int j, Queue<Pair> pair){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return;
        } 
         grid[i][j]='2';
        while(!pair.isEmpty()) {

            Pair p = pair.poll();
           
            for(int d[]:dir){
            int nr=p.i+d[0];
            int nc=p.j+d[1];

            if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length || grid[nr][nc]!='1') continue;
             grid[nr][nc]='2';
            pair.add(new Pair(nr,nc));
        }
      }
    }
}
