 public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int begin=intervals[0][0];
        int end =intervals[0][1];
        List<int[]> answerInter =new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
                if(intervals[i][0] <= end){
                    end=Math.max(intervals[i][1],end);
                }
                else{
                    int temp[]={begin,end};
                    answerInter.add(temp);
                    begin=intervals[i][0];
                    end=intervals[i][1];
                }               
        }
        int temp[]={begin,end};
        answerInter.add(temp);
        int[][] answer =new int[answerInter.size()][2];
        for(int i=0;i<answerInter.size();i++){
            answer[i]=answerInter.get(i);
        }
        return answer;
    }
