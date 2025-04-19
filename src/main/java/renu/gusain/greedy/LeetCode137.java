package renu.gusain.greedy;

public class LeetCode137 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sum = gas[0]-cost[0];
        int result = 0;
        int previsouCost=gas[0]-cost[0];


        for (int i = 1; i < n; i++) {
            int currentTotoal=gas[i]-cost[i];
            if(previsouCost<0)
            {
                previsouCost=currentTotoal;
                result =i;

            }
            else {
                previsouCost=previsouCost+currentTotoal;
            }
            sum+=currentTotoal;

        }
        if(sum<0)
        {
            return -1;
        }
        return result;


    }
}
