 public void setZeroes(int[][] matrix) {
        HashSet<Integer> row_map=new HashSet<>();
        HashSet<Integer> col_map=new HashSet<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i =0 ;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    row_map.add(i);
                    col_map.add(j);
                }
            }
        }
        for(int row:row_map){
            for(int j=0;j<m;j++){
                matrix[row][j]=0;
            }
        }
        for(int col:col_map){
            for(int i=0;i<n;i++){
                matrix[i][col]=0;
            }
        }
    }
