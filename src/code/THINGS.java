package code;
import java.util.Random;
public class THINGS {
    int market1;
    int market2;
    int market3;
    int market4;
    int market5;
    int wall1,wall2,wall3,wall4,wall5,wall6,wall7;
    THINGS() {
        Random random = new Random();
        market1 = random.nextInt(20);
        market2 = random.nextInt(20)+20;
        market3 = random.nextInt(20)+20+20;
        market4 = random.nextInt(20)+20+20+20;
        market5 = random.nextInt(20)+20+20+20+20;
        while (true) {
            wall1 = random.nextInt(12);
            board market_h=null;
            if (wall1!= market1 && wall1 != 0 && wall1 != 10 && wall1 != 9)
                break;
        }
        while (true) {
            wall2 = random.nextInt(12) + 13;
            if (wall2 != market1 && wall2!= market2)
                break;
        }
        while (true) {
            wall3 = random.nextInt(12) + 13 + 12;
            if (wall3 != market3 && wall3!= market2)
                break;
        }
        while (true) {
            wall4 = random.nextInt(12) + 13 + 12 + 13;
            if (wall4 != market3 && wall4!= market2)
                break;
        }
        while (true) {
            wall5 = random.nextInt(12) + 13 + 12 + 13 + 12;
            if (wall5 != market4 && wall5!= market3)
                break;
        }
        while (true) {
            wall5 = random.nextInt(12) + 13 + 12 + 13 + 12 + 13;
            if (wall5 != market4 && wall5!= market3)
                break;
        }
        while (true) {
            wall6 = random.nextInt(12) + 13 + 12 + 13 + 12 + 13 + 12;
            if (wall6 != market4 && wall6!= market5)
                break;
        }
        while (true) {
            wall7 = random.nextInt(12) + 13 + 12 + 13 + 12 + 13 + 12 + 13;
            if (wall7 != market4 && wall7!= market5)
                break;
        }
    }
}