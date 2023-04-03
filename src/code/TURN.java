package code;

import java.util.Random;

public class TURN {
    Random random=new Random();
    int turn;
    TURN(){
        this.turn=random.nextInt(2)+1;
    }
}
