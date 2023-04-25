package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Market4 extends JFrame implements ActionListener {
    ImageIcon market=new ImageIcon("src/images/market (50).png");
    ImageIcon exit=new ImageIcon("src/images/icons8-go-back-48.png");
    ImageIcon Weapon1=new ImageIcon("src/images/WEAPONS/flail (1).png");
    ImageIcon Weapon2=new ImageIcon("src/images/WEAPONS/spear (1).png");
    ImageIcon PO=new ImageIcon("src/images/wallet (1) (50).png");
    ImageIcon MO=new ImageIcon("src/images/muscle.png");
    JButton w1_b=new JButton();
    JButton w2_b=new JButton();
    JButton LOCATE_TREASURE=new JButton();
    JLabel main_l=new JLabel();
    JLabel top=new JLabel();
    JLabel text=new JLabel();
    JLabel money1=new JLabel();
    JLabel power1=new JLabel();
    JLabel money2=new JLabel();
    JLabel power2=new JLabel();
    JLabel PO_L=new JLabel();
    JLabel MO_L =new JLabel();
    JLabel money3=new JLabel();
    JLabel MO_L1 =new JLabel();
    JLabel loc=new JLabel();
    JLabel loc_num=new JLabel();
    String text1="CLICK TO LOCATE A \n TREASURE";
    JButton Exit=new JButton();
    int sw_t;
    Market4(){
        board.dice_number1--;
        sw_t=board.SW_PLAYER;
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setSize(500,600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setIconImage(market.getImage());
        this.setTitle("MARKET");

        main_l.setBounds(0,0,600,600);
        main_l.setBackground(new Color(255, 182, 193));
        main_l.setOpaque(true);

        text.setBounds(5,90,600,60);
        text.setText("CHOOSE YOUR WEAPON : ");
        text.setForeground(new Color(255, 20, 147));
        text.setFont(new Font("ZEROGIRL",Font.BOLD,36));

        MO_L.setIcon(MO);
        MO_L.setBounds(0,330,48,48);

        PO_L.setIcon(PO);
        PO_L.setBounds(0,270,48,48);

        money1.setText("-500");
        money1.setBounds(80,280,100,36);
        money1.setForeground(new Color(255, 0, 0));
        money1.setFont(new Font("ZEROGIRL",Font.BOLD,30));

        money2.setText("-500");
        money2.setBounds(260,280,100,36);
        money2.setForeground(new Color(255, 0, 0));
        money2.setFont(new Font("ZEROGIRL",Font.BOLD,30));

        power1.setText("+1000");
        power1.setBounds(80,337,100,36);
        power1.setForeground(new Color(0, 255, 0));
        power1.setFont(new Font("ZEROGIRL",Font.BOLD,30));

        power2.setText("+1500");
        power2.setBounds(260,337,100,36);
        power2.setForeground(new Color(0, 255, 0));
        power2.setFont(new Font("ZEROGIRL",Font.BOLD,30));

        top.setBounds(0,0,600,70);
        top.setText("    WELCOME TO MARKET 4");
        top.setFont(new Font("ZEROGIRL",Font.BOLD,36));
        top.setBackground(new Color(192 , 255 , 246 ));
        top.setOpaque(true);

        w1_b.setBounds(80,175,100,100);
        w1_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        w1_b.setBackground(new Color(192 , 255 , 246 ));
        w1_b.setOpaque(false);
        w1_b.setIcon(Weapon1);
        w1_b.addActionListener(this);

        w2_b.setBounds(260,175,100,100);
        w2_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        w2_b.setBackground(new Color(192 , 255 , 246 ));
        w2_b.setOpaque(false);
        w2_b.setIcon(Weapon2);
        w2_b.addActionListener(this);

        money3.setText("-4000");
        money3.setBounds(80,450,100,36);
        money3.setForeground(new Color(255, 0, 0));
        money3.setFont(new Font("ZEROGIRL",Font.BOLD,30));

        MO_L1.setIcon(PO);
        MO_L1.setBounds(0,440,48,48);

        loc.setText("There Is A Treasure In : ");
        loc.setFont(new Font("ZEROGIRL",Font.BOLD,25));
        loc.setBounds(15,500,400,50);

        loc_num.setText("90");
        loc_num.setBounds(360,483,80,80);
        loc_num.setFont(new Font("ZEROGIRL",Font.BOLD,25));
        loc_num.setVisible(false);

        LOCATE_TREASURE.setBounds(5,390,475,36);
        LOCATE_TREASURE.setCursor(new Cursor(Cursor.HAND_CURSOR));
        LOCATE_TREASURE.setBackground(new Color(192 , 255 , 246 ));
        LOCATE_TREASURE.setOpaque(false);
        LOCATE_TREASURE.setForeground(new Color( 0 , 167 , 147));
        LOCATE_TREASURE.setFont(new Font("ZEROGIRL",Font.BOLD,28));
        LOCATE_TREASURE.setText(text1);
        LOCATE_TREASURE.addActionListener(this);

        Exit.setBounds(0,10,50,50);
        Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Exit.setBackground(new Color(255, 20, 147));
        Exit.setOpaque(false);
        Exit.setIcon(exit);
        Exit.addActionListener(this);

        this.setVisible(true);
        this.add(main_l);
        main_l.add(top);
        main_l.add(text);
        main_l.add(w1_b);
        main_l.add(w2_b);
        main_l.add(money1);
        main_l.add(money2);
        main_l.add(power1);
        main_l.add(power2);
        main_l.add(MO_L);
        main_l.add(PO_L);
        main_l.add(LOCATE_TREASURE);
        main_l.add(money3);
        main_l.add(MO_L1);
        main_l.add(loc);
        main_l.add(loc_num);
        top.add(Exit);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==Exit){
            this.dispose();
        }
        if (actionEvent.getSource()==w1_b){
            if (sw_t==1){
                String p_t=power1.getText();
                String M_t=money1.getText();
                int temp=Integer.parseInt(p_t);
                System.out.println(M_t);
                int temp_M=Integer.parseInt(M_t);
                if (board.MONEY_PLAYER_1+temp_M>=0){
                    board.POWER_PLAYER_1+=temp;
                    board.MONEY_PLAYER_1+=temp_M;
                    board.POWER_PLAYER_1_L.setText(String.valueOf(board.POWER_PLAYER_1));
                    board.MONEY_PLAYER_1_L.setText(String.valueOf(board.MONEY_PLAYER_1));
                    System.out.println(board.POWER_PLAYER_1_L.getText());
                }
            }
            if (sw_t==2){
                String p_t=power1.getText();
                String M_t=money1.getText();
                int temp=Integer.parseInt(p_t);
                System.out.println(M_t);
                int temp_M=Integer.parseInt(M_t);
                if (board.MONEY_PLAYER_2+temp_M>=0){
                    board.POWER_PLAYER_2+=temp;
                    board.MONEY_PLAYER_2+=temp_M;
                    board.POWER_PLAYER_2_L.setText(String.valueOf(board.POWER_PLAYER_2));
                    board.MONEY_PLAYER_2_L.setText(String.valueOf(board.MONEY_PLAYER_2));
                    System.out.println(board.POWER_PLAYER_2_L.getText());
                }
            }
        }
        if (actionEvent.getSource()==w2_b){
            if (sw_t==1){
                String p_t=power2.getText();
                String M_t=money2.getText();
                int temp=Integer.parseInt(p_t);
                System.out.println(M_t);
                int temp_M=Integer.parseInt(M_t);
                if (board.MONEY_PLAYER_1+temp_M>=0){
                    board.POWER_PLAYER_1+=temp;
                    board.MONEY_PLAYER_1+=temp_M;
                    board.POWER_PLAYER_1_L.setText(String.valueOf(board.POWER_PLAYER_1));
                    board.MONEY_PLAYER_1_L.setText(String.valueOf(board.MONEY_PLAYER_1));
                    System.out.println(board.POWER_PLAYER_1_L.getText());
                }
            }
            if (sw_t==2){
                String p_t=power2.getText();
                String M_t=money2.getText();
                int temp=Integer.parseInt(p_t);
                System.out.println(M_t);
                int temp_M=Integer.parseInt(M_t);
                if (board.MONEY_PLAYER_2+temp_M>=0){
                    board.POWER_PLAYER_2+=temp;
                    board.MONEY_PLAYER_2+=temp_M;
                    board.POWER_PLAYER_2_L.setText(String.valueOf(board.POWER_PLAYER_2));
                    board.MONEY_PLAYER_2_L.setText(String.valueOf(board.MONEY_PLAYER_2));
                    System.out.println(board.POWER_PLAYER_2_L.getText());
                }
            }
        }
        if (actionEvent.getSource()==LOCATE_TREASURE){
            Quest q=new Quest();
            int a=q.newQuest();
            a=q.questplace;
            System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : "+a);
            if (sw_t==1){
                if (Integer.parseInt(board.MONEY_PLAYER_1_L.getText())>=4000) {
                    board.MONEY_PLAYER_1 -= 4000;
                    board.MONEY_PLAYER_1_L.setText(String.valueOf(board.MONEY_PLAYER_1));
                    loc_num.setText(String.valueOf(a+1));
                    loc_num.setVisible(true);
                }
            }
            if (sw_t==2){
                if (Integer.parseInt(board.MONEY_PLAYER_2_L.getText())>=4000) {
                    board.MONEY_PLAYER_2 -= 4000;
                    board.MONEY_PLAYER_2_L.setText(String.valueOf(board.MONEY_PLAYER_2));
                    loc_num.setText(String.valueOf(a+1));
                    loc_num.setVisible(true);
                }
            }
        }
    }

    /*public static void main(String[] args) {
        new Market4();
    }*/
}
