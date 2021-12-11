package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Computer {
    public int [] generateAnswer(){ // 3자리수 난수 생성
        int[] answer = new int[3];
        answer[0]=(int)(Math.random()*9)+1;

        for(int i=1;i<3;i++){
            answer[i]=(int)(Math.random()*9)+1;
            if(answer[i]==answer[i-1])
                i--;
            else if(i==2 && answer[i]==answer[i-2])
                i--;
        }

        return answer;
    }
}
