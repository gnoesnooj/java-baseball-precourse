package baseball;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    BallCount ballCount = new BallCount();

    public boolean startGame(){
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 누르세요");
        int op = sc.nextInt();
        if(op==1)
            return true;
        else
            return false;
    }

    public void tryAnswer(int [] answer){
        while(true){
            int [] userNumber = enterAnswer();

            if(ballCount.printBallCount(answer, userNumber)==1)
                break;
        }
    }

    public int [] enterAnswer(){
        String strNumber;
        while(true) {
            System.out.println("숫자를 입력해주세요");
            strNumber = sc.next();
            if(strNumber.length() != 3){
                System.out.println("3자리수여야합니다.");
                continue;
            }
            else
                break;
        }
        String [] temp = String.valueOf(strNumber).split("");
        int [] userNumber = new int [3];

        for(int i=0;i<3;i++){
            userNumber[i] = Integer.parseInt(temp[i]);
        }

        return userNumber;
    }
}
