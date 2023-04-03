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
            if (trap3 != market3 && trap3!= market4 && trap3!= wall3 && trap3!= wall4&&trap3!=54 &&trap3!=wall5&&trap3!=wall6)
                break;
        }
        while (true) {
            trap4 = random.nextInt(25)+75;
            if (trap4 != market4 && trap4!= market5 && trap4!= wall4 && trap4!= wall5 && trap4!=wall6&&trap4!=wall7)
                break;
        }
        castle=54;
        while (true) {
            loot1 = random.nextInt(25);
            if (loot1 != market1 && loot1!= market2 && loot1!= wall1 && loot1!= wall2 &&loot1!=0 &&loot1!=9&&loot1!=10&&loot1!=11&&loot1!=trap1)
                break;
        }
        while (true) {
            loot2 = random.nextInt(25)+25;
            if (loot2 != market2 && loot2!= market3 && loot2!= wall2 && loot2!= wall3&&loot2!=wall4&&loot2!=trap2)
                break;
        }
        while (true) {
            loot3 = random.nextInt(25)+50;
            if (loot3 != market3 && loot3!= market4 && loot3!= wall3 && loot3!= wall4&&loot3!=54 &&loot3!=wall5&&loot3!=wall6&&loot3!=trap3)
                break;
        }
        while (true) {
            loot4 = random.nextInt(25)+75;
            if (loot4 != market4 && loot4!= market5 && loot4!= wall4 && loot4!= wall5 && loot4!=wall6&&loot4!=wall7&&loot4!=trap4)
                break;
        }
        int x,y;
        while (true) {
            x=random.nextInt(2);
            y=random.nextInt(5);

            treasure1 = 10*y+x;
            if (treasure1!=0&& treasure1 != market1 && treasure1 != market2 && treasure1 != market3 && treasure1 != market4 && treasure1 != market5 && treasure1 != wall1 && treasure1 != wall2 && treasure1 != wall3 && treasure1 != wall4 && treasure1 != wall5 && treasure1 != wall6&& treasure1 != wall7 && treasure1 != trap1 && treasure1 != trap2 && treasure1 != trap3 && treasure1 != trap4 && treasure1!=loot1 && treasure1!=loot2 && treasure1!=loot3 && treasure1!=loot4)
                break;
        }
        while (true) {
            x=random.nextInt(3)+2;
            y=random.nextInt(5);

            treasure2 = 10*y+x;
            if (treasure2!= 54&&treasure2 != market1 && treasure2 != market2 && treasure2 != market3 && treasure2 != market4 && treasure2 != market5 && treasure2 != wall1 && treasure2 != wall2 && treasure2 != wall3 && treasure2 != wall4 && treasure2 != wall5 && treasure2 != wall6&& treasure2 != wall7 && treasure2 != trap1 && treasure2 != trap2 && treasure2 != trap3 && treasure2 != trap4 && treasure2!=loot1 && treasure2!=loot2 && treasure2!=loot3 && treasure2!=loot4)
                break;
        }
        while (true) {
            x=random.nextInt(2)+5;
            y=random.nextInt(5);

            treasure3 = 10*y+x;
            if (treasure3 != market1 && treasure3 != market2 && treasure3 != market3 && treasure3 != market4 && treasure3 != market5 && treasure3 != wall1 && treasure3 != wall2 && treasure3 != wall3 && treasure3 != wall4 && treasure3 != wall5 && treasure3 != wall6&& treasure3 != wall7 && treasure3 != trap1 && treasure3 != trap2 && treasure3 != trap3 && treasure3 != trap4 && treasure3!=loot1 && treasure3!=loot2 && treasure3!=loot3 && treasure3!=loot4)
                break;
        }
        while (true) {
            x=random.nextInt(3)+7;
            y=random.nextInt(5);

            treasure4 = 10*y+x;
            if (treasure4!=9&&treasure4 != market1 && treasure4 != market2 && treasure4 != market3 && treasure4 != market4 && treasure4 != market5 && treasure4 != wall1 && treasure4 != wall2 && treasure4 != wall3 && treasure4 != wall4 && treasure4 != wall5 && treasure4 != wall6&& treasure4 != wall7 && treasure4 != trap1 && treasure4 != trap2 && treasure4 != trap3 && treasure4 != trap4 && treasure4!=loot1 && treasure4!=loot2 && treasure4!=loot3 && treasure4!=loot4)
                break;
        }
        while (true) {
            x=random.nextInt(2);
            y=random.nextInt(5)+5;

            treasure5 = 10*y+x;
            if (treasure5 != market1 && treasure5 != market2 && treasure5 != market3 && treasure5 != market4 && treasure5 != market5 && treasure5 != wall1 && treasure5 != wall2 && treasure5 != wall3 && treasure5 != wall4 && treasure5 != wall5 && treasure5 != wall6&& treasure5 != wall7 && treasure5 != trap1 && treasure5 != trap2 && treasure5 != trap3 && treasure5 != trap4 && treasure5!=loot1 && treasure5!=loot2 && treasure5!=loot3 && treasure5!=loot4)
                break;
        }
        while (true) {
            x=random.nextInt(3)+2;
            y=random.nextInt(5)+5;

            treasure6 = 10*y+x;
            if (treasure6!=54&&treasure6 != market1 && treasure6 != market2 && treasure6 != market3 && treasure6 != market4 && treasure6 != market5 && treasure6 != wall1 && treasure6 != wall2 && treasure6 != wall3 && treasure6 != wall4 && treasure6 != wall5 && treasure6 != wall6&& treasure6 != wall7 && treasure6 != trap1 && treasure6 != trap2 && treasure6 != trap3 && treasure6 != trap4 && treasure6!=loot1 && treasure6!=loot2 && treasure6!=loot3 && treasure6!=loot4)
                break;
        }
        while (true) {
            x=random.nextInt(2)+5;
            y=random.nextInt(5)+5;

            treasure7 = 10*y+x;
            if (treasure7 != market1 && treasure7 != market2 && treasure7 != market3 && treasure7 != market4 && treasure7 != market5 && treasure7 != wall1 && treasure7 != wall2 && treasure7 != wall3 && treasure7 != wall4 && treasure7 != wall5 && treasure7 != wall6&& treasure7 != wall7 && treasure7 != trap1 && treasure7 != trap2 && treasure7 != trap3 && treasure7 != trap4 && treasure7!=loot1 && treasure7!=loot2 && treasure7!=loot3 && treasure7!=loot4)
                break;
        }
        while (true) {
            x=random.nextInt(3)+7;
            y=random.nextInt(5)+5;

            treasure8 = 10*y+x;
            if (treasure8 != market1 && treasure8 != market2 && treasure8 != market3 && treasure8 != market4 && treasure8 != market5 && treasure8 != wall1 && treasure8 != wall2 && treasure8 != wall3 && treasure8 != wall4 && treasure8 != wall5 && treasure8 != wall6&& treasure8 != wall7 && treasure8 != trap1 && treasure8 != trap2 && treasure8 != trap3 && treasure8 != trap4 && treasure8!=loot1 && treasure8!=loot2 && treasure8!=loot3 && treasure8!=loot4)
                break;
        }
    }


   /* public static void main(String[] args) {
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
        System.out.println(t.treasure1+" "+t.treasure2+" "+t.treasure3+" "+t.treasure4+" "+t.treasure5+" "+t.treasure6+" "+t.treasure7+" "+t.treasure8);
    }*/

}