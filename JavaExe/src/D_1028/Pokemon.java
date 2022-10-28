package D_1028;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {
    public int solution(int[] num){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }

        int N = num.length / 2;
        
        if(set.size() < N){
            return  set.size();
        } else {
            return N;
        }

    }

}
