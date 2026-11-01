class Solution {
    static class Pair{
        int i;
        int j;
        int k;

        Pair(int i,int j,int k){
            this.i=i;
            this.j=j;
            this.k=k;
        }
    } 
    public void islandsAndTreasure(int[][] grid) {
        Queue<Pair> que=new LinkedList<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    que.add(new Pair(i,j,0));
                }
            }
        }
 
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        while(!que.isEmpty()){

            Pair curr = que.poll();
            int n = curr.i;
            int c = curr.j;
            int count = curr.k;
            
            for(int i=0;i<4;i++){
                int nr= n+dir[i][0];
                int nc= c+dir[i][1];

                if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length || grid[nr][nc]!=2147483647) continue;
                grid[nr][nc]=count+1;
                que.add(new Pair(nr,nc,count+1));
            }
        
        }
    }
}
