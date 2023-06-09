package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Castle_checker extends JFrame implements ActionListener {
    ImageIcon CASTLE=new ImageIcon("src/images/New folder/Castle.png");
    JLabel Background=new JLabel();
    JTextField HORIZONTAL=new JTextField();
    JTextField VERTICAL=new JTextField();
    static int home;
    JButton OK =new JButton();
    JLabel VER_L=new JLabel();
    JLabel HOR_L=new JLabel();
    JLabel yes=new JLabel();
    JLabel no=new JLabel();
    int sw_t=0;
    static int count=0;
    Castle_checker(){
        sw_t=board.SW_PLAYER;
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setIconImage(CASTLE.getImage());
        this.setTitle("CASTLE");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(600,270);
        this.setLayout(null);
        Background.setBounds(0,0,600,300);
        Background.setBackground(new Color(238, 130, 238));
        Background.setOpaque(true);

        HORIZONTAL.setBounds(455,30,80,40);
        HOR_L.setBounds(45,34,400,36);
        HOR_L.setFont(new Font("ZEROGIRL",Font.BOLD,20));
        HOR_L.setText("ENTER YOUR HORIZONTAL OF QUEST :");

        VERTICAL.setBounds(455,100,80,40);
        VER_L.setBounds(45,104,350,36);
        VER_L.setFont(new Font("ZEROGIRL",Font.BOLD,20));
        VER_L.setText("ENTER YOUR VERTICAL OF QUEST :");
        //HO=Integer.parseInt(HO_s);
//
        OK.setBounds(250,160,100,50);
        OK.setText("OK");
        OK.setFont(new Font("ZEROGIRL",Font.BOLD,30));
        OK.setBackground(new Color(0,0,0));
        OK.setOpaque(false);
        OK.setForeground(new Color(139 , 239 , 139));
        OK.setVisible(true);
        OK.addActionListener(this);
//
        //home=(VE-1)*10+HO;

        yes.setFont(new Font("ZEROGIRL",Font.BOLD,30));
        yes.setForeground(new Color(255,255,0));
        yes.setBounds(18,170,600,30);
        yes.setText("THATS RIGHT CONTINUE SEARCHING");
        yes.setVisible(false);

        no.setFont(new Font("ZEROGIRL",Font.BOLD,30));
        no.setForeground(new Color(255,0,0));
        no.setBounds(18,170,600,30);
        no.setText("OH WRONG TRY AGAIN IN NEXT TIME");
        no.setVisible(false);

        this.add(Background);
        Background.add(HORIZONTAL);
        Background.add(VERTICAL);
        Background.add(VER_L);
        Background.add(HOR_L);
        Background.add(OK);
        Background.add(yes);
        Background.add(no);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()== OK){
            OK.setVisible(false);
            String s1 = HORIZONTAL.getText();
            String s2 = VERTICAL.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            home=(a-1)*10+(b-1);
            System.out.println(home);
            System.out.println(board.quest1);
            if (sw_t==1) {
                if (board.questplace1 == home) {
                    board.MONEY_PLAYER_1+=10000;
                    board.MONEY_PLAYER_1_L.setText(String.valueOf(board.MONEY_PLAYER_1));
                    yes.setVisible(true);
                    count++;
                    System.out.println("PREVIOUS QUEST 1: " + board.quest1 + " - " + board.questplace1);
                    if (board.quest1 == board.quest2) {
                        if(count==1){
                            System.out.println("END");
                            if (board.MONEY_PLAYER_1 > board.MONEY_PLAYER_2){
                                this.setVisible(false);
                                new END1();
                            }
                            if (board.MONEY_PLAYER_1 < board.MONEY_PLAYER_2){
                                this.setVisible(false);
                                new END2();
                            }
                        }
                        else {
                            board.quest.endQuest(board.quest1 - 1);
                            board.quest1 = board.quest.newQuest();
                            board.questplace1 = board.quest.questplace;
                            System.out.println("CURRENT QUEST 1: " + board.quest1 + " _ " + board.questplace1);
                            board.quest.endQuest(board.quest2 - 1);
                            board.quest2 = board.quest.newQuest();
                            board.questplace2 = board.quest.questplace;
                            System.out.println("CURRENT QUEST 2: " + board.quest2 + " _ " + board.questplace2);
                        }
                    } else {
                        if(count==1){
                            System.out.println("END");
                            if (board.MONEY_PLAYER_1 > board.MONEY_PLAYER_2){
                                this.setVisible(false);
                                new END1();
                            }
                            if (board.MONEY_PLAYER_1 < board.MONEY_PLAYER_2){
                                this.setVisible(false);
                                new END2();
                            }
                        }
                        else {
                            board.quest.endQuest(board.quest1 - 1);
                            board.quest1 = board.quest.newQuest();
                            board.questplace1 = board.quest.questplace;
                            System.out.println("CURRENT QUEST : " + board.quest1 + " _ " + board.questplace1);
                        }
                    }

                }
                else
                    no.setVisible(true);
            }
            if (sw_t==2){
                if (board.questplace2 == home) {
                    board.MONEY_PLAYER_2+=10000;
                    board.MONEY_PLAYER_2_L.setText(String.valueOf(board.MONEY_PLAYER_2));
                    yes.setVisible(true);
                    count++;
                    if (board.quest1 == board.quest2) {
                        if(count==1){
                            System.out.println("END");
                            if (board.MONEY_PLAYER_1 > board.MONEY_PLAYER_2){
                                this.setVisible(false);
                                new END1();
                            }
                            if (board.MONEY_PLAYER_1 < board.MONEY_PLAYER_2){
                                this.setVisible(false);
                                new END2();
                            }
                        }
                        else {
                            System.out.println("QUEST IS SIMILAR");
                            board.quest.endQuest(board.quest1 - 1);
                            board.quest1 = board.quest.newQuest();
                            board.questplace1 = board.quest.questplace;
                            System.out.println("CURRENT QUEST 1: " + board.quest1 + " _ " + board.questplace1);
                            board.quest2 = board.quest.newQuest();
                            board.questplace2 = board.quest.questplace;
                            System.out.println("CURRENT QUEST 2: " + board.quest2 + " _ " + board.questplace2);
                        }
                    }
                    else {
                        if(count==1){
                            System.out.println("END");
                            if (board.MONEY_PLAYER_1 > board.MONEY_PLAYER_2){
                                this.setVisible(false);
                                new END1();
                            }
                            if (board.MONEY_PLAYER_1 < board.MONEY_PLAYER_2){
                                this.setVisible(false);
                                new END2();
                            }
                        }
                        else {
                            System.out.println("PREVIOUS QUEST 2: " + board.quest2 + " - " + board.questplace2);
                            board.quest.endQuest(board.quest2 - 1);
                            board.quest2 = board.quest.newQuest();
                            board.questplace2 = board.quest.questplace;
                            System.out.println("CURRENT QUEST 2: " + board.quest2 + " _ " + board.questplace2);
                        }
                    }
                }
                else
                    no.setVisible(true);
            }

        }
    }

    /*public static void main(String[] args) {
        new Castle_checker();
    }*/
}
