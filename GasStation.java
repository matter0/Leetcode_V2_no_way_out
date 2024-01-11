public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasspent=0;
        int gasNeeded=0;
        int startingPoint=0;
        int total=0;
        for(int i=0;i<gas.length;i++){
            gasspent+=gas[i];
            gasNeeded+=cost[i];
            total+=gas[i]-cost[i];
            if(total<0){
                startingPoint=(i+1)%(gas.length);
                total=0;
            }
        }
        return gasspent>=gasNeeded?startingPoint:-1;
    }
