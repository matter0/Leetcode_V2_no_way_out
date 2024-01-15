 public void rotate(int[][] matrix) {
        int n=matrix.length-1;
        int progress=0;
        while(progress <= n-1){
            for(int i=progress;i<n-progress;i++){
                int first_row=matrix[progress][i];
                int last_col=matrix[i][n-progress];
                matrix[i][n-progress]=first_row;
                int last_row=matrix[n-progress][n-i];
                matrix[n-progress][n-i]=last_col;
                int first_col=matrix[n-i][progress];
                matrix[n-i][progress]=last_row;
                matrix[progress][i]=first_col;
            }
            progress++;
        }
    }
