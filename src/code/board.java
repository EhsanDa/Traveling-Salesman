package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class board extends JFrame implements ActionListener /*,KeyListener*/ {




    int M = 280;
    static int x = 243, y = 62;

    static int xNew = 0, yNew = 0, xOld = 0, yOld = 0;
    static int x1 = 243 + 11 * 59, y1 = 62;
    static int x1New = 0, y1New = 0, x1Old = 0, y1Old = 0;
    static int Dice_number, dice_number1;
    static int SW_PLAYER = 1;
    static int POWER_PLAYER_1=500;
    static int MONEY_PLAYER_1=1500;
    static int POWER_PLAYER_2=500;
    static int MONEY_PLAYER_2=1500;
    String POWER_PLAYER_1_S=String.valueOf(POWER_PLAYER_1);
    String MONEY_PLAYER_1_S=String.valueOf(MONEY_PLAYER_1);
    String POWER_PLAYER_2_S=String.valueOf(POWER_PLAYER_2);
    String MONEY_PLAYER_2_S=String.valueOf(MONEY_PLAYER_2);
    ImageIcon background = new ImageIcon("src/images/BackGround.jpg");
    ImageIcon board_pic = new ImageIcon("src/images/10.jpg");
    ImageIcon Icon = new ImageIcon("src/images/ICON.jpg");
    ImageIcon BUR = new ImageIcon("src/images/icons8-right-button-48.png");
    ImageIcon BUL = new ImageIcon("src/images/icons8-prev-48.png");
    ImageIcon BUD = new ImageIcon("src/images/icons8-drop-down-48.png");
    ImageIcon BUU = new ImageIcon("src/images/icons8-up-squared-48.png");
    ImageIcon player1 = new ImageIcon("src/images/among_us_player_blue_icon_156941.png");
    ImageIcon player2 = new ImageIcon("src/images/7033731_among us_icon.png");
    ImageIcon piece_player1 = new ImageIcon("src/images/pawn-50.png");
    ImageIcon piece_player2 = new ImageIcon("src/images/pawn-50 (1).png");
    ImageIcon market = new ImageIcon("src/images/market (50).png");
    ImageIcon wall=new ImageIcon("src/images/wall (50).png");
    ImageIcon trap =new ImageIcon("src/images/caution (50).png");
    ImageIcon treasure=new ImageIcon("src/images/treasure (50).png");
    ImageIcon loot=new ImageIcon("src/images/LOOT.png");
    ImageIcon castle=new ImageIcon("src/images/castle (50).png");
    ImageIcon wallet = new ImageIcon("src/images/wallet (1).png");
    ImageIcon power = new ImageIcon("src/images/muscle (1).png");
    ImageIcon Upper1 = new ImageIcon("src/images/up-p1.png");
    ImageIcon Upper2 = new ImageIcon("src/images/up-p2.png");
    ImageIcon Click_dice = new ImageIcon("src/images/icons8-dice-64 (1).png");
    ImageIcon dice1 = new ImageIcon("src/images/dice/dice(1).png");
    ImageIcon dice2 = new ImageIcon("src/images/dice/dice(2).png");
    ImageIcon dice3 = new ImageIcon("src/images/dice/dice(3).png");
    ImageIcon dice4 = new ImageIcon("src/images/dice/dice(4).png");
    ImageIcon dice5 = new ImageIcon("src/images/dice/dice(5).png");
    ImageIcon dice6 = new ImageIcon("src/images/dice/dice(6).png");
    ImageIcon setting = new ImageIcon("src/images/setting_48.png");
    ImageIcon Info = new ImageIcon("src/images/information (2) (1).png");
    ImageIcon Menu = new ImageIcon("src/images/menu_48.png");
    ImageIcon start1 = new ImageIcon("src/images/start1.png");
    ImageIcon start2 = new ImageIcon("src/images/start2.png");
    //BufferedImage piece1= null,piece2=null;
    JLabel board_pic_l = new JLabel();
    public static JLabel background_pic_l = new JLabel();
    JLabel p_p1 = new JLabel();
    JLabel p_p2 = new JLabel();
    public static JLabel POWER_PLAYER_1_L=new JLabel();
    public static JLabel MONEY_PLAYER_1_L=new JLabel();
    public static JLabel POWER_PLAYER_2_L=new JLabel();
    public static JLabel MONEY_PLAYER_2_L=new JLabel();
    JLabel turn_p1 = new JLabel();
    JLabel turn_p2 = new JLabel();
    JLabel market1 = new JLabel();
    JLabel market2 = new JLabel();
    JLabel market3 = new JLabel();
    JLabel market4 = new JLabel();
    JLabel market5 = new JLabel();
    JLabel wall1=new JLabel();
    JLabel wall2=new JLabel();
    JLabel wall3=new JLabel();
    JLabel wall4=new JLabel();
    JLabel wall5=new JLabel();
    JLabel wall6=new JLabel();
    JLabel wall7=new JLabel();
    JLabel loot1=new JLabel();
    JLabel loot2=new JLabel();
    JLabel loot3=new JLabel();
    JLabel loot4=new JLabel();
    JLabel loot5=new JLabel();
    JLabel loot6=new JLabel();
    JLabel loot7=new JLabel();
    JLabel loot8=new JLabel();
    JLabel loot9=new JLabel();
    JLabel loot10=new JLabel();
    JLabel loot11=new JLabel();
    JLabel loot12=new JLabel();
    JLabel loot13=new JLabel();
    JLabel trap1_l=new JLabel();
    JLabel trap2_l=new JLabel();
    JLabel trap3_l=new JLabel();
    JLabel trap4_l=new JLabel();
    JLabel treasure1_l=new JLabel();
    JLabel treasure2_l=new JLabel();
    JLabel treasure3_l=new JLabel();
    JLabel treasure4_l=new JLabel();
    JLabel treasure5_l=new JLabel();
    JLabel treasure6_l=new JLabel();
    JLabel treasure7_l=new JLabel();
    JLabel treasure8_l=new JLabel();
    JLabel castle_l=new JLabel();
    JLabel wallet_L1 = new JLabel();
    JLabel power_L1 = new JLabel();
    JLabel power_L2 = new JLabel();
    JLabel wallet_L2 = new JLabel();
    JLabel dice1_l = new JLabel();
    JLabel dice2_l = new JLabel();
    JLabel dice3_l = new JLabel();
    JLabel dice4_l = new JLabel();
    JLabel dice5_l = new JLabel();
    JLabel dice6_l = new JLabel();
    JLabel start1_l = new JLabel();
    JLabel start2_l = new JLabel();
    JButton buttonR = new JButton();
    JButton buttonL = new JButton();
    JButton buttonU = new JButton();
    JButton buttonD = new JButton();
    JButton player1_info = new JButton();
    JButton Upper_b1 = new JButton();
    JButton Upper_b2 = new JButton();
    JButton player2_info = new JButton();
    JButton dice_button = new JButton();
    JButton Setting_button = new JButton();
    JButton Info_button = new JButton();
    JButton Menu_button = new JButton();
    dice dice;
    TURN turn;
    String buttons = "african";
    Coordinates[] houses;
    static THINGS thing = new THINGS();
    Castle c= new Castle();
    /*****************************************************/
    static Quest quest=new Quest();
    static int quest1=quest.newQuest();
    static int questplace1=quest.questplace;
    static int quest2=quest.newQuest();
    static int questplace2=quest.questplace;
    /*****************************************************/
    //Timer timer;
    //piece1 player1=new piece1();

    //CONSTRUCTOR
    public board() {
        /************************************************/
        houses = new Coordinates[100];
        for (int i = 0; i < 100; i++) {
            houses[i] = new Coordinates();
        }
        for (int i = 0; i < 10; i++) {
            houses[i].x = 243 + (i + 1) * 59;
            houses[i].y = 62;
        }
        for (int i = 0; i < 10; i++) {
            houses[i + 10].x = 243 + (i + 1) * 59;
            houses[i + 10].y = 62 + 59;
        }
        for (int i = 0; i < 10; i++) {
            houses[i + 20].x = 243 + (i + 1) * 59;
            houses[i + 20].y = 62 + 2 * 59;
        }
        for (int i = 0; i < 10; i++) {
            houses[i + 30].x = 243 + (i + 1) * 59;
            houses[i + 30].y = 62 + 3 * 59;
        }
        for (int i = 0; i < 10; i++) {
            houses[i + 40].x = 243 + (i + 1) * 59;
            houses[i + 40].y = 62 + 4 * 59;
        }
        for (int i = 0; i < 10; i++) {
            houses[i + 50].x = 243 + (i + 1) * 59;
            houses[i + 50].y = 62 + 5 * 59;
        }
        for (int i = 0; i < 10; i++) {
            houses[i + 60].x = 243 + (i + 1) * 59;
            houses[i + 60].y = 62 + 6 * 59;
        }
        for (int i = 0; i < 10; i++) {
            houses[i + 70].x = 243 + (i + 1) * 59;
            houses[i + 70].y = 62 + 7 * 59;
        }
        for (int i = 0; i < 10; i++) {
            houses[i + 80].x = 243 + (i + 1) * 59;
            houses[i + 80].y = 62 + 8 * 59;
        }
        for (int i = 0; i < 10; i++) {
            houses[i + 90].x = 243 + (i + 1) * 59;
            houses[i + 90].y = 62 + 9 * 59;
        }
        /***********************************************/

        /***********************************************/
        turn = new TURN();
        int num = turn.turn;
        System.out.println("SW_PLAYER IS : " + num);
        if (num == 1) {
            SW_PLAYER = 1;
        }
        if (num == 2) {
            SW_PLAYER = 2;
        }
        /***********************************************/

        p_p1.setIcon(piece_player1);
        p_p1.setBounds(x, y, 50, 50);

        p_p2.setIcon(piece_player2);
        p_p2.setBounds(x1, y1, 50, 50);

        POWER_PLAYER_1_L.setText(POWER_PLAYER_1_S);
        POWER_PLAYER_1_L.setBounds(145,300,150,30);
        POWER_PLAYER_1_L.setForeground(new Color(255, 69, 0 ));
        POWER_PLAYER_1_L.setFont(new Font("breakaway", Font.BOLD, 45));
        POWER_PLAYER_1_L.setVisible(false);

        MONEY_PLAYER_1_L.setText(MONEY_PLAYER_1_S);
        MONEY_PLAYER_1_L.setBounds(145,200,150,30);
        MONEY_PLAYER_1_L.setForeground(new Color(255, 69, 0 ));
        MONEY_PLAYER_1_L.setFont(new Font("breakaway", Font.BOLD, 45));
        MONEY_PLAYER_1_L.setVisible(false);

        POWER_PLAYER_2_L.setText(POWER_PLAYER_2_S);
        POWER_PLAYER_2_L.setBounds(950,300,150,30);
        POWER_PLAYER_2_L.setForeground(new Color(255, 69, 0 ));
        POWER_PLAYER_2_L.setFont(new Font("breakaway", Font.BOLD, 45));
        POWER_PLAYER_2_L.setVisible(false);

        MONEY_PLAYER_2_L.setText(MONEY_PLAYER_2_S);
        MONEY_PLAYER_2_L.setBounds(950,200,150,30);
        MONEY_PLAYER_2_L.setForeground(new Color(255, 69, 0 ));
        MONEY_PLAYER_2_L.setFont(new Font("breakaway", Font.BOLD, 45));
        MONEY_PLAYER_2_L.setVisible(false);

        turn_p1.setBounds(140, 15, 120, 30);
        turn_p1.setForeground(new Color(50, 90, 255));
        turn_p1.setText("PLAYER 1");
        turn_p1.setFont(new Font("breakaway", Font.BOLD, 36));
        turn_p1.setVisible(false);

        turn_p2.setBounds(930, 15, 130, 30);
        turn_p2.setForeground(new Color(255, 80, 20));
        turn_p2.setText("PLAYER 2");
        turn_p2.setFont(new Font("breakaway", Font.BOLD, 36));
        turn_p2.setVisible(false);

        if (SW_PLAYER == 1) {
            turn_p1.setVisible(true);
        }
        if (SW_PLAYER == 2) {
            turn_p2.setVisible(true);
        }

        market1.setIcon(market);
        market1.setBounds(houses[thing.market1].x, houses[thing.market1].y, 50, 50);
        System.out.println("MARKET1 IN HOUSE " + (thing.market1 + 1) + " BY COORDINATES { X IS : " + houses[thing.market1].x + " & Y IS : " + houses[thing.market1].y + "}");

        market2.setIcon(market);
        market2.setBounds(houses[thing.market2].x, houses[thing.market2].y, 50, 50);
        System.out.println("MARKET2 IN HOUSE " + (thing.market2 + 1) + " BY COORDINATES { X IS : " + houses[thing.market2].x + " & Y IS : " + houses[thing.market2].y + "}");

        market3.setIcon(market);
        market3.setBounds(houses[thing.market3].x, houses[thing.market3].y, 50, 50);
        System.out.println("MARKET3 IN HOUSE " + (thing.market3 + 1) + " BY COORDINATES { X IS : " + houses[thing.market3].x + " & Y IS : " + houses[thing.market3].y + "}");

        market4.setIcon(market);
        market4.setBounds(houses[thing.market4].x, houses[thing.market4].y, 50, 50);
        System.out.println("MARKET4 IN HOUSE " + (thing.market4 + 1) + " BY COORDINATES { X IS : " + houses[thing.market4].x + " & Y IS : " + houses[thing.market4].y + "}");

        market5.setIcon(market);
        market5.setBounds(houses[thing.market5].x, houses[thing.market5].y, 50, 50);
        System.out.println("MARKET5 IN HOUSE " + (thing.market5 + 1) + " BY COORDINATES { X IS : " + houses[thing.market5].x + " & Y IS : " + houses[thing.market5].y + " }");

        wall1.setIcon(wall);
        wall1.setBounds(houses[thing.wall1].x,houses[thing.wall1].y,50,50);
        System.out.println("THERE IS A WALL IN HOUSE "+(thing.wall1+1)+" BY COORDINATES { x is : "+houses[thing.wall1].x+" & Y IS : "+houses[thing.wall1].y+" }");

        wall2.setIcon(wall);
        wall2.setBounds(houses[thing.wall2].x,houses[thing.wall2].y,50,50);
        System.out.println("THERE IS A WALL IN HOUSE "+(thing.wall2+1)+" BY COORDINATES { x is : "+houses[thing.wall2].x+" & Y IS : "+houses[thing.wall2].y+" }");

        wall3.setIcon(wall);
        wall3.setBounds(houses[thing.wall3].x,houses[thing.wall3].y,50,50);
        System.out.println("THERE IS A WALL IN HOUSE "+(thing.wall3+1)+" BY COORDINATES { x is : "+houses[thing.wall3].x+" & Y IS : "+houses[thing.wall3].y+" }");

        wall4.setIcon(wall);
        wall4.setBounds(houses[thing.wall4].x,houses[thing.wall4].y,50,50);
        System.out.println("THERE IS A WALL IN HOUSE "+(thing.wall4+1)+" BY COORDINATES { x is : "+houses[thing.wall4].x+" & Y IS : "+houses[thing.wall4].y+" }");

        wall5.setIcon(wall);
        wall5.setBounds(houses[thing.wall5].x,houses[thing.wall5].y,50,50);
        System.out.println("THERE IS A WALL IN HOUSE "+(thing.wall5+1)+" BY COORDINATES { x is : "+houses[thing.wall5].x+" & Y IS : "+houses[thing.wall5].y+" }");

        wall6.setIcon(wall);
        wall6.setBounds(houses[thing.wall6].x,houses[thing.wall6].y,50,50);
        System.out.println("THERE IS A WALL IN HOUSE "+(thing.wall6+1)+" BY COORDINATES { x is : "+houses[thing.wall6].x+" & Y IS : "+houses[thing.wall6].y+" }");

        wall7.setIcon(wall);
        wall7.setBounds(houses[thing.wall7].x,houses[thing.wall7].y,50,50);
        System.out.println("THERE IS A WALL IN HOUSE "+(thing.wall7+1)+" BY COORDINATES { x is : "+houses[thing.wall7].x+" & Y IS : "+houses[thing.wall7].y+" }");

        castle_l.setIcon(castle);
        castle_l.setBounds(houses[54].x,houses[54].y,50,50);
        //System.out.println("THERE IS A CASTLE IN HOUSE "+(thing.wall7+1)+" BY COORDINATES { x is : "+houses[thing.wall7].x+" & Y IS : "+houses[thing.wall7].y+" }");

        trap1_l.setIcon(trap);
        trap1_l.setBounds(houses[thing.trap1].x,houses[thing.trap1].y,50,50);
        System.out.println("THERE IS A TRAP IN HOUSE "+(thing.trap1+1)+" BY COORDINATES { x is : "+houses[thing.trap1].x+" & Y IS : "+houses[thing.trap1].y+" }");

        trap2_l.setIcon(trap);
        trap2_l.setBounds(houses[thing.trap2].x,houses[thing.trap2].y,50,50);
        System.out.println("THERE IS A TRAP IN HOUSE "+(thing.trap2+1)+" BY COORDINATES { x is : "+houses[thing.trap2].x+" & Y IS : "+houses[thing.trap2].y+" }");

        trap3_l.setIcon(trap);
        trap3_l.setBounds(houses[thing.trap3].x,houses[thing.trap3].y,50,50);
        System.out.println("THERE IS A TRAP IN HOUSE "+(thing.trap3+1)+" BY COORDINATES { x is : "+houses[thing.trap3].x+" & Y IS : "+houses[thing.trap3].y+" }");

        trap4_l.setIcon(trap);
        trap4_l.setBounds(houses[thing.trap4].x,houses[thing.trap4].y,50,50);
        System.out.println("THERE IS A TRAP IN HOUSE "+(thing.trap4+1)+" BY COORDINATES { x is : "+houses[thing.trap4].x+" & Y IS : "+houses[thing.trap4].y+" }");
/////////////////////////////////////////////////////////////
        treasure1_l.setIcon(treasure);
        treasure1_l.setBounds(houses[thing.treasure1].x,houses[thing.treasure1].y,50,50);
        System.out.println("THERE IS A TREASURE 1 IN HOUSE "+(thing.treasure1+1)+" BY COORDINATES { x is : "+houses[thing.treasure1].x+" & Y IS : "+houses[thing.treasure1].y+" }");

        treasure2_l.setIcon(treasure);
        treasure2_l.setBounds(houses[thing.treasure2].x,houses[thing.treasure2].y,50,50);
        System.out.println("THERE IS A TREASURE 2 IN HOUSE "+(thing.treasure2+1)+" BY COORDINATES { x is : "+houses[thing.treasure2].x+" & Y IS : "+houses[thing.treasure2].y+" }");

        treasure3_l.setIcon(treasure);
        treasure3_l.setBounds(houses[thing.treasure3].x,houses[thing.treasure3].y,50,50);
        System.out.println("THERE IS A TREASURE 3 IN HOUSE "+(thing.treasure3+1)+" BY COORDINATES { x is : "+houses[thing.treasure3].x+" & Y IS : "+houses[thing.treasure3].y+" }");

        treasure4_l.setIcon(treasure);
        treasure4_l.setBounds(houses[thing.treasure4].x,houses[thing.treasure4].y,50,50);
        System.out.println("THERE IS A TREASURE 4 IN HOUSE "+(thing.treasure4+1)+" BY COORDINATES { x is : "+houses[thing.treasure4].x+" & Y IS : "+houses[thing.treasure4].y+" }");

        treasure5_l.setIcon(treasure);
        treasure5_l.setBounds(houses[thing.treasure5].x,houses[thing.treasure5].y,50,50);
        System.out.println("THERE IS A TREASURE 5 IN HOUSE "+(thing.treasure5)+" BY COORDINATES { x is : "+houses[thing.treasure5].x+" & Y IS : "+houses[thing.treasure5].y+" }");

        treasure6_l.setIcon(treasure);
        treasure6_l.setBounds(houses[thing.treasure6].x,houses[thing.treasure6].y,50,50);
        System.out.println("THERE IS A TREASURE 6 IN HOUSE "+(thing.treasure6+1)+" BY COORDINATES { x is : "+houses[thing.treasure6].x+" & Y IS : "+houses[thing.treasure6].y+" }");

        treasure7_l.setIcon(treasure);
        treasure7_l.setBounds(houses[thing.treasure7].x,houses[thing.treasure7].y,50,50);
        System.out.println("THERE IS A TREASURE 7 IN HOUSE "+(thing.treasure7+1)+" BY COORDINATES { x is : "+houses[thing.treasure7].x+" & Y IS : "+houses[thing.treasure7].y+" }");

        treasure8_l.setIcon(treasure);
        treasure8_l.setBounds(houses[thing.treasure8].x,houses[thing.treasure8].y,50,50);
        System.out.println("THERE IS A TREASURE 8 IN HOUSE "+(thing.treasure8+1)+" BY COORDINATES { x is : "+houses[thing.treasure8].x+" & Y IS : "+houses[thing.treasure8].y+" }");
//////////////////////////////////////////////////////////////////////////
        loot1.setIcon(loot);
        loot1.setBounds(houses[thing.loot1].x,houses[thing.loot1].y,50,50);

        loot2.setIcon(loot);
        loot2.setBounds(houses[thing.loot2].x,houses[thing.loot2].y,50,50);

        loot3.setIcon(loot);
        loot3.setBounds(houses[thing.loot3].x,houses[thing.loot3].y,50,50);

        loot4.setIcon(loot);
        loot4.setBounds(houses[thing.loot4].x,houses[thing.loot4].y,50,50);

        loot5.setIcon(loot);
        loot5.setBounds(houses[thing.loot5].x,houses[thing.loot5].y,50,50);

        loot6.setIcon(loot);
        loot6.setBounds(houses[thing.loot6].x,houses[thing.loot6].y,50,50);

        loot7.setIcon(loot);
        loot7.setBounds(houses[thing.loot7].x,houses[thing.loot7].y,50,50);

        loot8.setIcon(loot);
        loot8.setBounds(houses[thing.loot8].x,houses[thing.loot8].y,50,50);

        loot9.setIcon(loot);
        loot9.setBounds(houses[thing.loot9].x,houses[thing.loot9].y,50,50);

        loot10.setIcon(loot);
        loot10.setBounds(houses[thing.loot10].x,houses[thing.loot10].y,50,50);

        loot11.setIcon(loot);
        loot11.setBounds(houses[thing.loot11].x,houses[thing.loot11].y,50,50);

        loot12.setIcon(loot);
        loot12.setBounds(houses[thing.loot12].x,houses[thing.loot12].y,50,50);

        loot13.setIcon(loot);
        loot13.setBounds(houses[thing.loot13].x,houses[thing.loot13].y,50,50);


        wallet_L1.setIcon(wallet);
        wallet_L1.setBounds(28, 155, 96, 96);
        wallet_L1.setVisible(false);

        wallet_L2.setIcon(wallet);
        wallet_L2.setBounds(1086, 155, 96, 96);
        wallet_L2.setVisible(false);

        power_L2.setIcon(power);
        power_L2.setBounds(1086, 260, 96, 96);
        power_L2.setVisible(false);

        power_L1.setIcon(power);
        power_L1.setBounds(28, 260, 96, 96);
        power_L1.setVisible(false);


        dice1_l.setIcon(dice1);
        dice1_l.setBounds(1005, 550, 50, 50);
        dice1_l.setVisible(false);

        dice2_l.setIcon(dice2);
        dice2_l.setBounds(1005, 550, 50, 50);
        dice2_l.setVisible(false);

        dice3_l.setIcon(dice3);
        dice3_l.setBounds(1005, 550, 50, 50);
        dice3_l.setVisible(false);

        dice4_l.setIcon(dice4);
        dice4_l.setBounds(1005, 550, 50, 50);
        dice4_l.setVisible(false);

        dice5_l.setIcon(dice5);
        dice5_l.setBounds(1005, 550, 50, 50);
        dice5_l.setVisible(false);

        dice6_l.setIcon(dice6);
        dice6_l.setBounds(1005, 550, 50, 50);
        dice6_l.setVisible(false);


        start1_l.setIcon(start1);
        start1_l.setBounds(M, 10, 48, 48);

        start2_l.setIcon(start2);
        start2_l.setBounds(873, 10, 48, 48);


        board_pic_l = new JLabel(board_pic);
        board_pic_l.setBounds(295, 55, 598, 596);
        //board_pic_l.add(player1);


        background_pic_l = new JLabel(background);
        background_pic_l.setBounds(0, 0, 1200, 700);
        background_pic_l.add(p_p1);
        background_pic_l.add(p_p2);
        background_pic_l.add(market1);
        background_pic_l.add(market2);
        background_pic_l.add(market3);
        background_pic_l.add(market4);
        background_pic_l.add(market5);
        background_pic_l.add(wall1);
        background_pic_l.add(wall2);
        background_pic_l.add(wall3);
        background_pic_l.add(wall4);
        background_pic_l.add(wall5);
        background_pic_l.add(wall6);
        background_pic_l.add(wall7);
        background_pic_l.add(trap1_l);
        background_pic_l.add(trap2_l);
        background_pic_l.add(trap3_l);
        background_pic_l.add(trap4_l);
        background_pic_l.add(treasure1_l);
        background_pic_l.add(treasure2_l);
        background_pic_l.add(treasure3_l);
        background_pic_l.add(treasure4_l);
        background_pic_l.add(treasure5_l);
        background_pic_l.add(treasure6_l);
        background_pic_l.add(treasure7_l);
        background_pic_l.add(treasure8_l);
        background_pic_l.add(loot1);
        background_pic_l.add(loot2);
        background_pic_l.add(loot3);
        background_pic_l.add(loot4);
        background_pic_l.add(loot5);
        background_pic_l.add(loot6);
        background_pic_l.add(loot7);
        background_pic_l.add(loot8);
        background_pic_l.add(loot9);
        background_pic_l.add(loot10);
        background_pic_l.add(loot11);
        background_pic_l.add(loot12);
        background_pic_l.add(loot13);
        background_pic_l.add(castle_l);
        background_pic_l.add(board_pic_l);
        background_pic_l.add(POWER_PLAYER_1_L);
        background_pic_l.add(MONEY_PLAYER_1_L);
        background_pic_l.add(POWER_PLAYER_2_L);
        background_pic_l.add(MONEY_PLAYER_2_L);
        background_pic_l.add(wallet_L1);
        background_pic_l.add(power_L1);
        background_pic_l.add(wallet_L2);
        background_pic_l.add(power_L2);
        background_pic_l.add(dice1_l);
        background_pic_l.add(dice2_l);
        background_pic_l.add(dice3_l);
        background_pic_l.add(dice4_l);
        background_pic_l.add(dice5_l);
        background_pic_l.add(dice6_l);
        background_pic_l.add(start1_l);
        background_pic_l.add(start2_l);
        background_pic_l.add(turn_p1);
        background_pic_l.add(turn_p2);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 700);
        this.setResizable(false);
        this.setTitle("TRAVELLING SALESMAN");
        this.setIconImage(Icon.getImage());
        this.setLocationRelativeTo(null);

        this.setLayout(null);
        /***this.addKeyListener(listener);*/


        buttonR.setBounds(1055, 550, 50, 50);
        buttonR.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonR.setBackground(new Color(255, 218, 185));
        buttonR.setOpaque(false);
        buttonR.setIcon(BUR);
        buttonR.setFont(new Font(buttons, Font.BOLD, 15));
        buttonR.addActionListener(this);

        buttonL.setBounds(955, 550, 50, 50);
        buttonL.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonL.setBackground(new Color(255, 218, 185));
        buttonL.setOpaque(false);
        buttonL.setIcon(BUL);
        buttonL.setFont(new Font(buttons, Font.BOLD, 15));
        buttonL.addActionListener(this);

        buttonU.setBounds(1005, 500, 50, 50);
        buttonU.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonU.setBackground(new Color(255, 218, 185));
        buttonU.setOpaque(false);
        buttonU.setIcon(BUU);
        buttonU.setFont(new Font(buttons, Font.BOLD, 15));
        buttonU.addActionListener(this);


        buttonD.setBounds(1005, 600, 50, 50);
        buttonD.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonD.setBackground(new Color(255, 218, 185));
        buttonD.setOpaque(false);
        buttonD.setIcon(BUD);
        buttonD.setFont(new Font(buttons, Font.BOLD, 15));
        buttonD.addActionListener(this);

        dice_button.setBounds(1005, 550, 50, 50);
        dice_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        dice_button.setBackground(new Color(255, 218, 185));
        dice_button.setOpaque(false);
        dice_button.setIcon(Click_dice);
        dice_button.addActionListener(dice_move);


        player1_info.setBounds(20, 20, 100, 120);
        player1_info.setCursor(new Cursor(Cursor.HAND_CURSOR));
        player1_info.setBackground(new Color(255, 218, 185));
        player1_info.setOpaque(false);
        player1_info.setIcon(player1);
        player1_info.addActionListener(info);

        Upper_b1.setBounds(35, 365, 70, 70);
        Upper_b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Upper_b1.setBackground(new Color(255, 218, 185));
        Upper_b1.setOpaque(false);
        Upper_b1.setIcon(Upper1);
        Upper_b1.setVisible(false);
        Upper_b1.addActionListener(info);


        player2_info.setBounds(1080, 20, 100, 120);
        player2_info.setCursor(new Cursor(Cursor.HAND_CURSOR));
        player2_info.setBackground(new Color(255, 218, 185));
        player2_info.setOpaque(false);
        player2_info.setIcon(player2);
        player2_info.addActionListener(info);

        Upper_b2.setBounds(1095, 365, 70, 70);
        Upper_b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Upper_b2.setBackground(new Color(255, 218, 185));
        Upper_b2.setOpaque(false);
        Upper_b2.setIcon(Upper2);
        Upper_b2.setVisible(false);
        Upper_b2.addActionListener(info);


        Setting_button.setBounds(570, 4, 48, 48);
        Setting_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Setting_button.setBackground(new Color(255, 218, 185));
        Setting_button.setOpaque(false);
        Setting_button.setIcon(setting);
        Setting_button.addActionListener(SMI);

        Menu_button.setBounds(481, 4, 48, 48);
        Menu_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Menu_button.setBackground(new Color(255, 218, 185));
        Menu_button.setOpaque(false);
        Menu_button.setIcon(Menu);
        Menu_button.addActionListener(SMI);

        Info_button.setBounds(659, 4, 48, 48);
        Info_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Info_button.setBackground(new Color(255, 218, 185));
        Info_button.setOpaque(false);
        Info_button.setIcon(Info);
        Info_button.addActionListener(SMI);

        this.setVisible(true);
        this.add(buttonR);
        this.add(buttonL);
        this.add(buttonU);
        this.add(buttonD);
        this.add(player1_info);
        this.add(Upper_b1);
        this.add(player2_info);
        this.add(Upper_b2);
        this.add(dice_button);
        this.add(Setting_button);
        this.add(Menu_button);
        this.add(Info_button);
        this.add(background_pic_l);
        //this.add(player1);
        this.revalidate();
        this.paint(this.getGraphics());
    }

    //
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.revalidate();
        this.paint(this.getGraphics());
        System.out.println("Quest place 1 is"+questplace1+ "  "+quest1);
        System.out.println("Quest place 2 is"+questplace2+ "  "+quest2);

        if (actionEvent.getSource() == buttonR) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("SW_PLAYER IS (NOW) : " + SW_PLAYER);
            System.out.println("BUTTON RIGHT CLICKED ! ");
            if (SW_PLAYER == 1 && x + 59 != xOld && dice_number1 > 0 && x + 59 < 900) {
                System.out.println("PREVIOUS X : " + x);
                System.out.println("PREVIOUS Y : " + y);
                yOld = 0;
                xOld = x;
                xNew = x + 59;
                x = xNew;
                if (x==houses[thing.wall1].x && y==houses[thing.wall1].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x-=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall2].x && y==houses[thing.wall2].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x-=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall3].x && y==houses[thing.wall3].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x-=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall4].x && y==houses[thing.wall4].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x-=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall5].x && y==houses[thing.wall5].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x-=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall6].x && y==houses[thing.wall6].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x-=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall7].x && y==houses[thing.wall7].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x-=59;
                    dice_number1++;
                }
                ////////////////////////////////////////////////////////
                if (x==houses[thing.treasure1].x && y==houses[thing.treasure1].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 1");
                }
                if (x==houses[thing.treasure2].x && y==houses[thing.treasure2].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 2");
                }
                if (x==houses[thing.treasure3].x && y==houses[thing.treasure3].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 3");
                }
                if (x==houses[thing.treasure4].x && y==houses[thing.treasure4].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 4");
                }
                if (x==houses[thing.treasure5].x && y==houses[thing.treasure5].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 5");
                }
                if (x==houses[thing.treasure6].x && y==houses[thing.treasure6].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 6");
                }
                if (x==houses[thing.treasure7].x && y==houses[thing.treasure7].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 7");
                }
                if (x==houses[thing.treasure8].x && y==houses[thing.treasure8].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 8");
                }
                ///////////////////////////////////////////////////////
                if (x==houses[thing.market1].x && y==houses[thing.market1].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET1");
                    new Market1();
                    dice_number1++;
                }
                if (x==houses[thing.market2].x && y==houses[thing.market2].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET2");
                    new Market2();
                    dice_number1++;
                }
                if (x==houses[thing.market3].x && y==houses[thing.market3].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET3");
                    new Market3();
                    dice_number1++;
                }
                if (x==houses[thing.market4].x && y==houses[thing.market4].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET4");
                    new Market4();
                    dice_number1++;
                }
                if (x==houses[thing.market5].x && y==houses[thing.market5].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET5");
                    new Market5();
                    dice_number1++;
                }
                if (x==houses[thing.castle].x && y==houses[thing.castle].y){
                    System.out.println("YOU GOT IT !!!!!! CASTLE");
                    new Castle_checker();
                }
                p_p1.setLocation(x, y);
                System.out.println("CURRENT X : " + x);
                System.out.println("CURRENT Y : " + y);
                dice_number1--;
                if (dice_number1 == 0) {
                    System.out.println("SW_PLAYER IS (BEFORE) : " + SW_PLAYER);
                    if (SW_PLAYER == 1) {
                        turn_p1.setVisible(false);
                        turn_p2.setVisible(true);
                        SW_PLAYER = 2;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());

                    } else if (SW_PLAYER == 2) {
                        turn_p1.setVisible(true);
                        turn_p2.setVisible(false);
                        SW_PLAYER = 1;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());
                    }
                }
                System.out.println("dice_number1 : " + dice_number1);
            }
            if (SW_PLAYER == 2 && x1 + 59 != x1Old && dice_number1 > 0 && x1 + 59 < 900) {
                System.out.println("PREVIOUS X1 : " + x1);
                System.out.println("PREVIOUS Y1 : " + y1);
                y1Old = 0;
                x1Old = x1;
                x1New = x1 + 59;
                x1 = x1New;
                if (x1==houses[thing.wall1].x && y1==houses[thing.wall1].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1-=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall2].x && y1==houses[thing.wall2].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1-=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall3].x && y1==houses[thing.wall3].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1-=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall4].x && y1==houses[thing.wall4].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1-=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall5].x && y1==houses[thing.wall5].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1-=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall6].x && y1==houses[thing.wall6].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1-=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall7].x && y1==houses[thing.wall7].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1-=59;
                    dice_number1++;
                }
                /////////////////////////////////////////////////////////
                if (x1==houses[thing.treasure1].x && y1==houses[thing.treasure1].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 1");
                }
                if (x1==houses[thing.treasure2].x && y1==houses[thing.treasure2].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 2");
                }
                if (x1==houses[thing.treasure3].x && y1==houses[thing.treasure3].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 3");
                }
                if (x1==houses[thing.treasure4].x && y1==houses[thing.treasure4].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 4");
                }
                if (x1==houses[thing.treasure5].x && y1==houses[thing.treasure5].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 5");
                }
                if (x1==houses[thing.treasure6].x && y1==houses[thing.treasure6].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 6");
                }
                if (x1==houses[thing.treasure7].x && y1==houses[thing.treasure7].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 7");
                }
                if (x1==houses[thing.treasure8].x && y1==houses[thing.treasure8].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 8");
                }
                ////////////////////////////////////////////////////////////////////
                if (x1==houses[thing.market1].x && y1==houses[thing.market1].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET1");
                    new Market1();
                    dice_number1++;
                }
                if (x1==houses[thing.market2].x && y1==houses[thing.market2].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET2");
                    new Market2();
                    dice_number1++;
                }
                if (x1==houses[thing.market3].x && y1==houses[thing.market3].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET3");
                    new Market3();
                    dice_number1++;
                }
                if (x1==houses[thing.market4].x && y1==houses[thing.market4].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET4");
                    new Market4();
                    dice_number1++;
                }
                if (x1==houses[thing.market5].x && y1==houses[thing.market5].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET5");
                    new Market5();
                    dice_number1++;
                }
                if (x1==houses[thing.castle].x && y1==houses[thing.castle].y){
                    System.out.println("YOU GOT IT !!!!!! CASTLE");
                    new Castle_checker();
                }
                p_p2.setLocation(x1, y1);
                System.out.println("CURRENT X1 : " + x1);
                System.out.println("CURRENT Y1 : " + y1);
                dice_number1--;
                if (dice_number1 == 0) {
                    System.out.println("SW_PLAYER IS (BEFORE) : " + SW_PLAYER);
                    if (SW_PLAYER == 1) {
                        turn_p1.setVisible(false);
                        turn_p2.setVisible(true);
                        SW_PLAYER = 2;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());

                    } else if (SW_PLAYER == 2) {
                        turn_p1.setVisible(true);
                        turn_p2.setVisible(false);
                        SW_PLAYER = 1;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());
                    }
                }
                System.out.println("dice_number1 : " + dice_number1);
            }
            if (dice_number1 == 0) {
                dice_button.setVisible(true);
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 1) {
                dice1_l.setVisible(true);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 2) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(true);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 3) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(true);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 4) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(true);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 5) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(true);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 6) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(true);
            }
            System.out.println("----------------------------------------------------------------------------------------");
            this.revalidate();
            this.paint(this.getGraphics());
        }
        //
        if (actionEvent.getSource() == buttonL) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("SW_PLAYER IS (NOW) : " + SW_PLAYER);
            System.out.println("BUTTON LEFT CLICKED ! ");
            if (SW_PLAYER == 1 && x - 59 != xOld && dice_number1 > 0 && x - 59 > 295) {
                System.out.println("PREVIOUS X : " + x);
                System.out.println("PREVIOUS Y : " + y);
                yOld = 0;
                xOld = x;
                xNew = x - 59;
                x = xNew;
                if (x==houses[thing.wall1].x && y==houses[thing.wall1].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall2].x && y==houses[thing.wall2].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall3].x && y==houses[thing.wall3].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall4].x && y==houses[thing.wall4].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall5].x && y==houses[thing.wall5].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall6].x && y==houses[thing.wall6].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall7].x && y==houses[thing.wall7].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x+=59;
                    dice_number1++;
                }
                /////////////////////////////////////////////////////////////
                if (x==houses[thing.treasure1].x && y==houses[thing.treasure1].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 1");
                }
                if (x==houses[thing.treasure2].x && y==houses[thing.treasure2].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 2");
                }
                if (x==houses[thing.treasure3].x && y==houses[thing.treasure3].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 3");
                }
                if (x==houses[thing.treasure4].x && y==houses[thing.treasure4].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 4");
                }
                if (x==houses[thing.treasure5].x && y==houses[thing.treasure5].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 5");
                }
                if (x==houses[thing.treasure6].x && y==houses[thing.treasure6].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 6");
                }
                if (x==houses[thing.treasure7].x && y==houses[thing.treasure7].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 7");
                }
                if (x==houses[thing.treasure8].x && y==houses[thing.treasure8].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 8");
                }
                ///////////////////////////////////////////////////////////////////
                if (x==houses[thing.market1].x && y==houses[thing.market1].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET1");
                    new Market1();
                    dice_number1++;
                }
                if (x==houses[thing.market2].x && y==houses[thing.market2].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET2");
                    new Market2();
                    dice_number1++;
                }
                if (x==houses[thing.market3].x && y==houses[thing.market3].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET3");
                    new Market3();
                    dice_number1++;
                }
                if (x==houses[thing.market4].x && y==houses[thing.market4].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET4");
                    new Market4();
                    dice_number1++;
                }
                if (x==houses[thing.market5].x && y==houses[thing.market5].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET5");
                    new Market5();
                    dice_number1++;
                }
                if (x==houses[thing.castle].x && y==houses[thing.castle].y){
                    System.out.println("YOU GOT IT !!!!!! CASTLE");
                    new Castle_checker();
                }
                p_p1.setLocation(x, y);
                System.out.println("CURRENT X : " + x);
                System.out.println("CURRENT Y : " + y);
                dice_number1--;
                if (dice_number1 == 0) {
                    System.out.println("SW_PLAYER IS (BEFORE) : " + SW_PLAYER);
                    if (SW_PLAYER == 1) {
                        turn_p1.setVisible(false);
                        turn_p2.setVisible(true);
                        SW_PLAYER = 2;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());

                    } else if (SW_PLAYER == 2) {
                        turn_p1.setVisible(true);
                        turn_p2.setVisible(false);
                        SW_PLAYER = 1;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());
                    }
                }
                System.out.println("dice_number1 : " + dice_number1);
            }
            if (SW_PLAYER == 2 && x1 - 59 != x1Old && dice_number1 > 0 && x1 - 59 > 295) {
                System.out.println("PREVIOUS X1 : " + x1);
                System.out.println("PREVIOUS Y1 : " + y1);
                y1Old = 0;
                x1Old = x1;
                x1New = x1 - 59;
                x1 = x1New;
                if (x1==houses[thing.wall1].x && y1==houses[thing.wall1].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall2].x && y1==houses[thing.wall2].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall3].x && y1==houses[thing.wall3].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall4].x && y1==houses[thing.wall4].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall5].x && y1==houses[thing.wall5].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall6].x && y1==houses[thing.wall6].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall7].x && y1==houses[thing.wall7].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    x1+=59;
                    dice_number1++;
                }
                ////////////////////////////////////////////////////////////
                if (x1==houses[thing.treasure1].x && y1==houses[thing.treasure1].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 1");
                }
                if (x1==houses[thing.treasure2].x && y1==houses[thing.treasure2].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 2");
                }
                if (x1==houses[thing.treasure3].x && y1==houses[thing.treasure3].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 3");
                }
                if (x1==houses[thing.treasure4].x && y1==houses[thing.treasure4].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 4");
                }
                if (x1==houses[thing.treasure5].x && y1==houses[thing.treasure5].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 5");
                }
                if (x1==houses[thing.treasure6].x && y1==houses[thing.treasure6].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 6");
                }
                if (x1==houses[thing.treasure7].x && y1==houses[thing.treasure7].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 7");
                }
                if (x1==houses[thing.treasure8].x && y1==houses[thing.treasure8].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 8");
                }
                //////////////////////////////////////////////////////////////
                if (x1==houses[thing.market1].x && y1==houses[thing.market1].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET1");
                    new Market1();
                    dice_number1++;
                }
                if (x1==houses[thing.market2].x && y1==houses[thing.market2].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET2");
                    new Market2();
                    dice_number1++;
                }
                if (x1==houses[thing.market3].x && y1==houses[thing.market3].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET3");
                    new Market3();
                    dice_number1++;
                }
                if (x1==houses[thing.market4].x && y1==houses[thing.market4].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET4");
                    new Market4();
                    dice_number1++;
                }
                if (x1==houses[thing.market5].x && y1==houses[thing.market5].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET5");
                    new Market5();
                    dice_number1++;
                }
                if (x1==houses[thing.castle].x && y1==houses[thing.castle].y){
                    System.out.println("YOU GOT IT !!!!!! CASTLE");
                    new Castle_checker();
                }
                p_p2.setLocation(x1, y1);
                System.out.println("CURRENT X1 : " + x1);
                System.out.println("CURRENT Y1 : " + y1);
                dice_number1--;
                if (dice_number1 == 0) {
                    System.out.println("SW_PLAYER IS (BEFORE) : " + SW_PLAYER);
                    if (SW_PLAYER == 1) {
                        turn_p1.setVisible(false);
                        turn_p2.setVisible(true);
                        SW_PLAYER = 2;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());

                    } else if (SW_PLAYER == 2) {
                        turn_p1.setVisible(true);
                        turn_p2.setVisible(false);
                        SW_PLAYER = 1;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());
                    }
                }
                System.out.println("dice_number1 : " + dice_number1);
            }
            if (dice_number1 == 0) {
                dice_button.setVisible(true);
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);

            }
            if (dice_number1 == 1) {
                dice1_l.setVisible(true);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 2) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(true);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 3) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(true);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 4) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(true);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 5) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(true);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 6) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(true);
            }
            System.out.println("----------------------------------------------------------------------------------------");
            this.revalidate();
            this.paint(this.getGraphics());
        }
        //
        if (actionEvent.getSource() == buttonU) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("SW_PLAYER IS (NOW) : " + SW_PLAYER);
            System.out.println("BUTTON UP CLICKED ! ");
            if (SW_PLAYER == 1 && y - 59 != yOld && dice_number1 > 0 && y - 59 > 55) {
                System.out.println("PREVIOUS X : " + x);
                System.out.println("PREVIOUS Y : " + y);
                xOld = 0;
                yOld = y;
                yNew = y - 59;
                y = yNew;
                if (x==houses[thing.wall1].x && y==houses[thing.wall1].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall2].x && y==houses[thing.wall2].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall3].x && y==houses[thing.wall3].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall4].x && y==houses[thing.wall4].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall5].x && y==houses[thing.wall5].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall6].x && y==houses[thing.wall6].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y+=59;
                    dice_number1++;
                }
                if (x==houses[thing.wall7].x && y==houses[thing.wall7].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y+=59;
                    dice_number1++;
                }
                //////////////////////////////////////////////////////////////
                if (x==houses[thing.treasure1].x && y==houses[thing.treasure1].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 1");
                }
                if (x==houses[thing.treasure2].x && y==houses[thing.treasure2].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 2");
                }
                if (x==houses[thing.treasure3].x && y==houses[thing.treasure3].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 3");
                }
                if (x==houses[thing.treasure4].x && y==houses[thing.treasure4].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 4");
                }
                if (x==houses[thing.treasure5].x && y==houses[thing.treasure5].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 5");
                }
                if (x==houses[thing.treasure6].x && y==houses[thing.treasure6].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 6");
                }
                if (x==houses[thing.treasure7].x && y==houses[thing.treasure7].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 7");
                }
                if (x==houses[thing.treasure8].x && y==houses[thing.treasure8].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 8");
                }
                ////////////////////////////////////////////////////////////////
                if (x==houses[thing.market1].x && y==houses[thing.market1].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET1");
                    new Market1();
                    dice_number1++;
                }
                if (x==houses[thing.market2].x && y==houses[thing.market2].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET2");
                    new Market2();
                    dice_number1++;
                }
                if (x==houses[thing.market3].x && y==houses[thing.market3].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET3");
                    new Market3();
                    dice_number1++;
                }
                if (x==houses[thing.market4].x && y==houses[thing.market4].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET4");
                    new Market4();
                    dice_number1++;
                }
                if (x==houses[thing.market5].x && y==houses[thing.market5].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET5");
                    new Market5();
                    dice_number1++;
                }
                if (x==houses[thing.castle].x && y==houses[thing.castle].y){
                    System.out.println("YOU GOT IT !!!!!! CASTLE");
                    new Castle_checker();
                }
                p_p1.setLocation(x, y);
                dice_number1--;
                System.out.println("CURRENT X : " + x);
                System.out.println("CURRENT Y : " + y);
                if (dice_number1 == 0) {
                    System.out.println("SW_PLAYER IS (BEFORE) : " + SW_PLAYER);
                    if (SW_PLAYER == 1) {
                        turn_p1.setVisible(false);
                        turn_p2.setVisible(true);
                        SW_PLAYER = 2;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());

                    } else if (SW_PLAYER == 2) {
                        turn_p1.setVisible(true);
                        turn_p2.setVisible(false);
                        SW_PLAYER = 1;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());
                    }
                }
                System.out.println("dice_number1 : " + dice_number1);
            }
            if (SW_PLAYER == 2 && y1 - 59 != y1Old && dice_number1 > 0 && y1 - 59 > 55) {
                System.out.println("PREVIOUS X1 : " + x1);
                System.out.println("PREVIOUS Y1 : " + y1);
                x1Old = 0;
                y1Old = y1;
                y1New = y1 - 59;
                y1 = y1New;
                if (x1==houses[thing.wall1].x && y1==houses[thing.wall1].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall2].x && y1==houses[thing.wall2].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall3].x && y1==houses[thing.wall3].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall4].x && y1==houses[thing.wall4].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall5].x && y1==houses[thing.wall5].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall6].x && y1==houses[thing.wall6].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y1+=59;
                    dice_number1++;
                }
                if (x1==houses[thing.wall7].x && y1==houses[thing.wall7].y){
                    System.out.println("THERE IS A BLOCK :D !!");
                    y1+=59;
                    dice_number1++;
                }
                /////////////////////////////////////////////////////////////////
                if (x1==houses[thing.treasure1].x && y1==houses[thing.treasure1].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 1");
                }
                if (x1==houses[thing.treasure2].x && y1==houses[thing.treasure2].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 2");
                }
                if (x1==houses[thing.treasure3].x && y1==houses[thing.treasure3].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 3");
                }
                if (x1==houses[thing.treasure4].x && y1==houses[thing.treasure4].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 4");
                }
                if (x1==houses[thing.treasure5].x && y1==houses[thing.treasure5].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 5");
                }
                if (x1==houses[thing.treasure6].x && y1==houses[thing.treasure6].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 6");
                }
                if (x1==houses[thing.treasure7].x && y1==houses[thing.treasure7].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 7");
                }
                if (x1==houses[thing.treasure8].x && y1==houses[thing.treasure8].y){
                    System.out.println("YOU GOT TREASURE !!! TREASURE 8");
                }
                //////////////////////////////////////////////////////////////////
                if (x1==houses[thing.market1].x && y1==houses[thing.market1].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET1");
                    new Market1();
                    dice_number1++;
                }
                if (x1==houses[thing.market2].x && y1==houses[thing.market2].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET2");
                    new Market2();
                    dice_number1++;
                }
                if (x1==houses[thing.market3].x && y1==houses[thing.market3].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET3");
                    new Market3();
                    dice_number1++;
                }
                if (x1==houses[thing.market4].x && y1==houses[thing.market4].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET4");
                    new Market4();
                    dice_number1++;
                }
                if (x1==houses[thing.market5].x && y1==houses[thing.market5].y){
                    System.out.println("YOU GOT IT !!!!!! MARKET5");
                    new Market5();
                    dice_number1++;
                }
                if (x1==houses[thing.castle].x && y1==houses[thing.castle].y){
                    System.out.println("YOU GOT IT !!!!!! CASTLE");
                    new Castle_checker();
                }
                p_p2.setLocation(x1, y1);
                System.out.println("CURRENT X1 : " + x1);
                System.out.println("CURRENT Y1 : " + y1);
                dice_number1--;
                if (dice_number1 == 0) {
                    System.out.println("SW_PLAYER IS (BEFORE) : " + SW_PLAYER);
                    if (SW_PLAYER == 1) {
                        turn_p1.setVisible(false);
                        turn_p2.setVisible(true);
                        SW_PLAYER = 2;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());

                    } else if (SW_PLAYER == 2) {
                        turn_p1.setVisible(true);
                        turn_p2.setVisible(false);
                        SW_PLAYER = 1;
                        System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                        this.revalidate();
                        this.paint(this.getGraphics());
                    }
                }
                System.out.println("dice_number1 : " + dice_number1);
            }
            if (dice_number1 == 0) {
                dice_button.setVisible(true);
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 1) {
                dice1_l.setVisible(true);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 2) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(true);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 3) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(true);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 4) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(true);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 5) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(true);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 6) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(true);
            }
            System.out.println("----------------------------------------------------------------------------------------");
            this.revalidate();
            this.paint(this.getGraphics());
        }
        //
        if (actionEvent.getSource() == buttonD) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("SW_PLAYER IS (NOW) : " + SW_PLAYER);
            System.out.println("BUTTON DOWN CLICKED ! ");
            if (SW_PLAYER == 1 && y + 59 != yOld && dice_number1 > 0 && y + 59 < 596 + 55) {
                if (x == 243 && y == 62) {

                } else {
                    System.out.println("PREVIOUS X : " + x);
                    System.out.println("PREVIOUS Y : " + y);
                    xOld = 0;
                    yOld = y;
                    yNew = y + 59;
                    y = yNew;
                    if (x==houses[thing.wall1].x && y==houses[thing.wall1].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y-=59;
                        dice_number1++;
                    }
                    if (x==houses[thing.wall2].x && y==houses[thing.wall2].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y-=59;
                        dice_number1++;
                    }
                    if (x==houses[thing.wall3].x && y==houses[thing.wall3].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y-=59;
                        dice_number1++;
                    }
                    if (x==houses[thing.wall4].x && y==houses[thing.wall4].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y-=59;
                        dice_number1++;
                    }
                    if (x==houses[thing.wall5].x && y==houses[thing.wall5].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y-=59;
                        dice_number1++;
                    }
                    if (x==houses[thing.wall6].x && y==houses[thing.wall6].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y-=59;
                        dice_number1++;
                    }
                    if (x==houses[thing.wall7].x && y==houses[thing.wall7].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y-=59;
                        dice_number1++;
                    }
                    /////////////////////////////////////////////////////////////
                    if (x==houses[thing.treasure1].x && y==houses[thing.treasure1].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 1");
                    }
                    if (x==houses[thing.treasure2].x && y==houses[thing.treasure2].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 2");
                    }
                    if (x==houses[thing.treasure3].x && y==houses[thing.treasure3].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 3");
                    }
                    if (x==houses[thing.treasure4].x && y==houses[thing.treasure4].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 4");
                    }
                    if (x==houses[thing.treasure5].x && y==houses[thing.treasure5].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 5");
                    }
                    if (x==houses[thing.treasure6].x && y==houses[thing.treasure6].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 6");
                    }
                    if (x==houses[thing.treasure7].x && y==houses[thing.treasure7].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 7");
                    }
                    if (x==houses[thing.treasure8].x && y==houses[thing.treasure8].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 8");
                    }
                    //////////////////////////////////////////////////////////////////
                    if (x==houses[thing.market1].x && y==houses[thing.market1].y){
                        System.out.println("YOU GOT IT !!!!!! MARKET1");
                        new Market1();
                        dice_number1++;
                    }
                    if (x==houses[thing.market2].x && y==houses[thing.market2].y){
                        System.out.println("YOU GOT IT !!!!!! MARKET2");
                        new Market2();
                        dice_number1++;
                    }
                    if (x==houses[thing.market3].x && y==houses[thing.market3].y){
                        System.out.println("YOU GOT IT !!!!!! MARKET3");
                        new Market3();
                        dice_number1++;
                    }
                    if (x==houses[thing.market4].x && y==houses[thing.market4].y){
                        System.out.println("YOU GOT IT !!!!!! MARKET4");
                        new Market4();
                        dice_number1++;
                    }
                    if (x==houses[thing.market5].x && y==houses[thing.market5].y){
                        System.out.println("YOU GOT IT !!!!!! MARKET5");
                        new Market5();
                        dice_number1++;
                    }
                    if (x==houses[thing.castle].x && y==houses[thing.castle].y){
                        System.out.println("YOU GOT IT !!!!!! CASTLE");
                        new Castle_checker();
                    }
                    p_p1.setLocation(x, y);
                    System.out.println("CURRENT X : " + x);
                    System.out.println("CURRENT Y : " + y);
                    dice_number1--;
                    if (dice_number1 == 0) {
                        System.out.println("SW_PLAYER IS (BEFORE) : " + SW_PLAYER);
                        if (SW_PLAYER == 1) {
                            turn_p1.setVisible(false);
                            turn_p2.setVisible(true);
                            SW_PLAYER = 2;
                            System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                            this.revalidate();
                            this.paint(this.getGraphics());

                        } else if (SW_PLAYER == 2) {
                            turn_p1.setVisible(true);
                            turn_p2.setVisible(false);
                            SW_PLAYER = 1;
                            System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                            this.revalidate();
                            this.paint(this.getGraphics());
                        }
                    }
                    System.out.println("dice_number1 : " + dice_number1);
                }
            }
            if (SW_PLAYER == 2 && y1 + 59 != y1Old && dice_number1 > 0 && y1 + 59 < 596 + 55) {
                if (x1 == 243 + 11 * 59 && y1 == 62) {
                    System.out.println("WRONG !");
                } else {
                    System.out.println("PREVIOUS X1 : " + x1);
                    System.out.println("PREVIOUS Y1 : " + y1);
                    x1Old = 0;
                    y1Old = y1;
                    y1New = y1 + 59;
                    y1 = y1New;
                    if (x1==houses[thing.wall1].x && y1==houses[thing.wall1].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y1-=59;
                        dice_number1++;
                    }
                    if (x1==houses[thing.wall2].x && y1==houses[thing.wall2].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y1-=59;
                        dice_number1++;
                    }
                    if (x1==houses[thing.wall3].x && y1==houses[thing.wall3].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y1-=59;
                        dice_number1++;
                    }
                    if (x1==houses[thing.wall4].x && y1==houses[thing.wall4].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y1-=59;
                        dice_number1++;
                    }
                    if (x1==houses[thing.wall5].x && y1==houses[thing.wall5].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y1-=59;
                        dice_number1++;
                    }
                    if (x1==houses[thing.wall6].x && y1==houses[thing.wall6].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y1-=59;
                        dice_number1++;
                    }
                    if (x1==houses[thing.wall7].x && y1==houses[thing.wall7].y){
                        System.out.println("THERE IS A BLOCK :D !!");
                        y1-=59;
                        dice_number1++;
                    }
                    //////////////////////////////////////////////////////////////
                    if (x1==houses[thing.treasure1].x && y1==houses[thing.treasure1].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 1");
                    }
                    if (x1==houses[thing.treasure2].x && y1==houses[thing.treasure2].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 2");
                    }
                    if (x1==houses[thing.treasure3].x && y1==houses[thing.treasure3].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 3");
                    }
                    if (x1==houses[thing.treasure4].x && y1==houses[thing.treasure4].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 4");
                    }
                    if (x1==houses[thing.treasure5].x && y1==houses[thing.treasure5].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 5");
                    }
                    if (x1==houses[thing.treasure6].x && y1==houses[thing.treasure6].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 6");
                    }
                    if (x1==houses[thing.treasure7].x && y1==houses[thing.treasure7].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 7");
                    }
                    if (x1==houses[thing.treasure8].x && y1==houses[thing.treasure8].y){
                        System.out.println("YOU GOT TREASURE !!! TREASURE 8");
                    }
                    /////////////////////////////////////////////////////////////////
                    if (x1==houses[thing.market1].x && y1==houses[thing.market1].y){
                        System.out.println("YOU GOT IT !!!!!! MARKET1");
                        new Market1();
                        dice_number1++;
                    }
                    if (x1==houses[thing.market2].x && y1==houses[thing.market2].y){
                        System.out.println("YOU GOT IT !!!!!! MARKET2");
                        new Market2();
                        dice_number1++;
                    }
                    if (x1==houses[thing.market3].x && y1==houses[thing.market3].y){
                        System.out.println("YOU GOT IT !!!!!! MARKET3");
                        new Market3();
                        dice_number1++;
                    }
                    if (x1==houses[thing.market4].x && y1==houses[thing.market4].y){
                        System.out.println("YOU GOT IT !!!!!! MARKET4");
                        new Market4();
                        dice_number1++;
                    }
                    if (x1==houses[thing.market5].x && y1==houses[thing.market5].y){
                        System.out.println("YOU GOT IT !!!!!! MARKET5");
                        new Market5();
                        dice_number1++;
                    }
                    if (x1==houses[thing.castle].x && y1==houses[thing.castle].y){
                        System.out.println("YOU GOT IT !!!!!! CASTLE");
                        new Castle_checker();
                    }
                    p_p2.setLocation(x1, y1);
                    System.out.println("CURRENT X1 : " + x1);
                    System.out.println("CURRENT Y1 : " + y1);
                    dice_number1--;
                    if (dice_number1 == 0) {
                        System.out.println("SW_PLAYER IS (BEFORE) : " + SW_PLAYER);
                        if (SW_PLAYER == 1) {
                            turn_p1.setVisible(false);
                            turn_p2.setVisible(true);
                            SW_PLAYER = 2;
                            System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                            this.revalidate();
                            this.paint(this.getGraphics());

                        } else if (SW_PLAYER == 2) {
                            turn_p1.setVisible(true);
                            turn_p2.setVisible(false);
                            SW_PLAYER = 1;
                            System.out.println("SW_PLAYER IS (AFTER) : " + SW_PLAYER);
                            this.revalidate();
                            this.paint(this.getGraphics());
                        }
                    }
                    System.out.println("dice_number1 : " + dice_number1);
                }
            }
            if (dice_number1 == 1) {
                dice1_l.setVisible(true);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 2) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(true);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 3) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(true);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 4) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(true);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 5) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(true);
                dice6_l.setVisible(false);
            }
            if (dice_number1 == 6) {
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(true);
            }
            if (dice_number1 == 0) {
                dice_button.setVisible(true);
                dice1_l.setVisible(false);
                dice2_l.setVisible(false);
                dice3_l.setVisible(false);
                dice4_l.setVisible(false);
                dice5_l.setVisible(false);
                dice6_l.setVisible(false);
            }
            System.out.println("----------------------------------------------------------------------------------------");
            this.revalidate();
            this.paint(this.getGraphics());
        }
        this.revalidate();
        this.paint(this.getGraphics());
    }

    ActionListener dice_move = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (actionEvent.getSource() == dice_button) {
                dice_button.setVisible(false);
                dice = new dice();
                Dice_number = dice.getDice_num();
                System.out.println("DICE NUMBER : " + Dice_number);
                dice_number1 = Dice_number;
                if (dice_number1 == 1) {
                    dice1_l.setVisible(true);
                }
                if (dice_number1 == 2) {
                    dice2_l.setVisible(true);
                }
                if (dice_number1 == 3) {
                    dice3_l.setVisible(true);
                }
                if (dice_number1 == 4) {
                    dice4_l.setVisible(true);
                }
                if (dice_number1 == 5) {
                    dice5_l.setVisible(true);
                }
                if (dice_number1 == 6) {
                    dice6_l.setVisible(true);
                }
                revalidate();
                repaint();
            }
        }
    };
    /**********************************************************
     ActionListener move=new ActionListener() {
    @Override public void actionPerformed(ActionEvent actionEvent) {
    }
    };*********************************************************/

    ActionListener info = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (actionEvent.getSource() == player1_info) {
                System.out.println("pl1");
                POWER_PLAYER_1_L.setVisible(true);
                MONEY_PLAYER_1_L.setVisible(true);
                wallet_L1.setVisible(true);
                power_L1.setVisible(true);
                Upper_b1.setVisible(true);
            }
            if (actionEvent.getSource() == Upper_b1) {
                POWER_PLAYER_1_L.setVisible(false);
                MONEY_PLAYER_1_L.setVisible(false);
                wallet_L1.setVisible(false);
                power_L1.setVisible(false);
                Upper_b1.setVisible(false);
            }
            if (actionEvent.getSource() == player2_info) {
                System.out.println("pl2");
                POWER_PLAYER_2_L.setVisible(true);
                MONEY_PLAYER_2_L.setVisible(true);
                wallet_L2.setVisible(true);
                power_L2.setVisible(true);
                Upper_b2.setVisible(true);
            }
            if (actionEvent.getSource() == Upper_b2) {
                POWER_PLAYER_2_L.setVisible(false);
                MONEY_PLAYER_2_L.setVisible(false);
                wallet_L2.setVisible(false);
                power_L2.setVisible(false);
                Upper_b2.setVisible(false);
            }
        }
    };

    ActionListener SMI = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (actionEvent.getSource() == Setting_button) {
                new Setting();
            }
            if (actionEvent.getSource() == Menu_button) {
                new Menu();
            }
        }
    };

    /**@Override public void paint(Graphics g) {
    Graphics2D graphics2D=(Graphics2D) g;
    super.paint(g);
    try {
    piece1= ImageIO.read(new File("src/images/pawn-50.png"));
    this.revalidate();
    //this.paint(this.getGraphics());
    }catch (IOException e){
    e.printStackTrace();
    }
    try {
    piece2= ImageIO.read(new File("src/images/pawn-50 (1).png"));
    this.revalidate();
    }catch (IOException e){
    e.printStackTrace();
    }


    graphics2D.drawImage(piece1,x,y,null);
    graphics2D.drawImage(piece2,x1,y1,null);
    graphics2D.setStroke(new BasicStroke(4));

    }*/


    /**KeyListener listener=new KeyListener() {

    @Override public void keyTyped(KeyEvent keyEvent) {

    }

    @Override public void keyPressed(KeyEvent keyEvent) {

    }

    @Override public void keyReleased(KeyEvent keyEvent) {
    System.out.println(keyEvent.getKeyChar());
    }
    };

     @Override public void keyTyped(KeyEvent keyEvent) {

     }

     @Override public void keyPressed(KeyEvent keyEvent) {

     }

     @Override public void keyReleased(KeyEvent keyEvent) {

     }*/
}
