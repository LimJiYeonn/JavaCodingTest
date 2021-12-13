class Solution {
    public int rank(int n){
        switch(n){
            case 6 : n = 1;
                break;
            case 5: n = 2;
                break;
            case 4: n = 3;
                break;
            case 3: n = 4;
                break;
            case 2: n = 5;
                break;
            default: n = 6;
                break;
        }
        return n;
    }


    public int[] solution(int[] lottos, int[] win_nums) {
        int correct=0, zero=0;

        for(int i = 0; i < 6; i++){
            if(lottos[i]==0) zero++;
        }


        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(lottos[i] == win_nums[j]){
                    correct++;
                    continue;
                }
            }
        }

        int best = correct+zero ,worst;
        best = rank(correct+zero);
        worst = rank(correct);


        int[] answer = {best, worst};
        return answer;
    }

}