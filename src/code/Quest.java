package code;
import java.util.Random;
import java.util.random.*;
public class Quest {
    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
    int questplace;
    int count = 0;
    Random rand = new Random();
    int quest;
    int a;
    public void endQuest(int a){
        numbers[a]=0;
    }
    public int newQuest() {
        a = rand.nextInt(8);
        quest = numbers[a];
        while (quest == 0) {
            a = rand.nextInt(8);
            quest = numbers[a];
            for (int i = 0; i < 8; i++) {
                if (i == 0) {
                    count++;
                }
            }if(count==8){
                //todo end of game
                break;
            }

        }
        if(quest==1){
            questplace=board.thing.treasure1;
        }
        if(quest==2){
            questplace=board.thing.treasure2;
        }
        if(quest==3){
            questplace=board.thing.treasure3;
        }
        if(quest==4){
            questplace=board.thing.treasure4;
        }
        if(quest==5){
            questplace=board.thing.treasure5;
        }
        if(quest==6){
            questplace=board.thing.treasure6;
        }
        if(quest==7){
            questplace=board.thing.treasure7;
        }
        if(quest==8){
            questplace=board.thing.treasure8;
        }
        System.out.println("Quest is"+ quest);
        return quest;
    }

    public static void main(String[] args) {

        for(int i=0;i<7;i++) {
            Quest q=new Quest();
            int a=q.newQuest();
            System.out.println(a);
            q.endQuest(a - 1);
            System.out.println(q.numbers[a - 1]);

        }


    }
}