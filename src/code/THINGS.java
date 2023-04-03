package code;
import java.util.Random;
public class THINGS {
    int market1;
    int market2;
    int market3;
    int market4;
    int market5;
    int wall1,wall2,wall3,wall4,wall5,wall6,wall7;
    int trap1,trap2,trap3,trap4;
    int castle;
    int loot1,loot2,loot3,loot4;
    int treasure1,treasure2,treasure3,treasure4,treasure5,treasure6,treasure7,treasure8;
    THINGS() {
        Random random = new Random();
        market1 = random.nextInt(20);
        market2 = random.nextInt(20)+20;
        market3 = random.nextInt(20) + 20 + 20;
        while (market3==54) {
            market3 = random.nextInt(20) + 20 + 20;
        }
        market4 = random.nextInt(20)+20+20+20;
        market5 = random.nextInt(20)+20+20+20+20;
        while (true) {
            wall1 = random.nextInt(12);
            if (wall1!= market1 && wall1 != 0 && wall1 != 10 && wall1 != 9&& wall1!=8)
                break;
        }
        while (true) {
            wall2 = random.nextInt(12) + 13;
            if (wall2 != market1 && wall2!= market2 && wall2!=18)
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
            if (wall5 != market4 && wall5!= market3&&wall5!=54)
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
        while (true) {
            trap1 = random.nextInt(25);
            if (trap1 != market1 && trap1!= market2 && trap1!= wall1 && trap1!= wall2 &&trap1!=0 &&trap1!=9&&trap1!=10&&trap1!=11)
                break;
        }
        while (true) {
            trap2 = random.nextInt(25)+25;
            if (trap2 != market2 && trap2!= market3 && trap2!= wall2 && trap2!= wall3&&trap2!=wall4)
                break;
        }
        while (true) {
            trap3 = random.nextInt(25)+50;
            if (trap3 != market3 && trap3!= market4 && trap3!= wall3 && trap3!= wall4&&trap3!=54 &&trap3!=wall5)
                break;
        }
        while (true) {
            trap4 = random.nextInt(25)+75;
            if (trap4 != market4 && trap4!= market5 && trap4!= wall4 && trap4!= wall5 && trap4!=wall6)
                break;
        }
        castle=54;
        while (true) {
            loot1 = random.nextInt(25);
            if (loot1 != market1 && loot1!= market2 && loot1!= wall1 && loot1!= wall2 &&loot1!=0 &&loot1!=9&&loot1!=10&&loot1!=11)
                break;
        }
        while (true) {
            loot2 = random.nextInt(25)+25;
            if (loot2 != market2 && loot2!= market3 && loot2!= wall2 && loot2!= wall3)
                break;
        }
        while (true) {
            loot3 = random.nextInt(25)+50;
            if (loot3 != market3 && loot3!= market4 && loot3!= wall3 && loot3!= wall4&&loot3!=54)
                break;
        }
        while (true) {
            loot4 = random.nextInt(25)+75;
            if (loot4 != market4 && loot4!= market5 && loot4!= wall4 && loot4!= wall5)
                break;
        }
    }


    public static void main(String[] args) {
        THINGS t=new THINGS();
        System.out.println( t.trap1);
        System.out.println( t.trap2);
        System.out.println( t.trap3);
        System.out.println( t.trap4);
        System.out.println(t.market1);
        System.out.println(t.market2);
        System.out.println(t.market3);
        System.out.println(t.market4);
        System.out.println(t.market5);
        System.out.println(t.wall1);
        System.out.println(t.wall2);
        System.out.println(t.wall3);
        System.out.println(t.wall4);
        System.out.println(t.wall5);
        System.out.println(t.wall6);
        System.out.println(t.wall7);
        System.out.println( t.loot1);
        System.out.println( t.loot2);
        System.out.println( t.loot3);
        System.out.println( t.loot4);
    }

}