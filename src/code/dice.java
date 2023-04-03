package code;

import java.util.Random;

public class dice {

    private int dice_num=0;

    public int getDice_num() {
        return dice_num;
    }
    private Random random=new Random();
    dice(){
        this.dice_num= random.nextInt(6)+1;
    }
}
