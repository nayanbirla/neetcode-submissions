class Solution {
    static class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> que = new LinkedList<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    que.add(new Pair(i,j));
                }
            }
        }

        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}}; 

        
            int count=0;
            boolean Dfirst=false;
            while(!que.isEmpty()){
                int size = que.size();
                for(int i=0;i<size;i++){
                    Pair curr = que.poll();
                    for(int d[]:dir){
                        int nr= curr.i+d[0];
                        int nc = curr.j+d[1];

                        if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length || grid[nr][nc]!=1){
                            continue;
                        }
                        grid[nr][nc]=2;
                        que.add(new Pair(nr,nc));
                    }
                }
                 if(Dfirst)
                 count++;

                 Dfirst=true;
            }
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1) return -1;
                }
            }
           return count;
    }
}
