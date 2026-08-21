class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int fRow=0;
        int i=0,j=matrix.length-1;
        while(i<=j){
            int mid= (i+j)/2;
            if(matrix[mid][0]==target) return true;
            else if(matrix[mid][0]>target) j=mid-1;
            else{
                i=mid+1;
            }
        }
        fRow=j;

        if(fRow<0 || fRow>=matrix.length) return false;

        i=0;j=matrix[0].length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(matrix[fRow][mid]==target) return true;
            else if(matrix[fRow][mid]>target) j = mid-1;
            else i=mid+1;
        }

        return false;


    }
}
