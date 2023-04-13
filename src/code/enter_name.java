package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class enter_name extends JFrame implements ActionListener, KeyListener {
    static int a,a1;
    JTextField name1=new JTextField(),name2=new JTextField();
    JLabel pict=new JLabel();
    ImageIcon pict_i=new ImageIcon("src/images/3Z_2010.w020.n001.772A.p30.772.jpg");
    static String name1_s="",name2_s="";
    JButton Start=new JButton("START");

    enter_name(){
        this.setLocation(150,50);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        this.setSize(1200,700);
        this.setLayout(null);

        pict.setIcon(pict_i);
        pict.setOpaque(true);
        pict.setBounds(0,0,1200,700);

        Start.setBounds(515,550,150,70);
        Start.setEnabled(false);
        Start.addActionListener(this);

        name1.setBounds(150,400,250,80);
        name1.setBorder(BorderFactory.createTitledBorder("name"));
        name1.setOpaque(false);
        name1.setText("");
        name1.setForeground(new Color(0,0,255));
        name1.setFont(new Font("breakaway",Font.BOLD,36));
        name1.setToolTipText("enter first player name");
        name1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                name1_s=name1.getText();
                a1 = name1_s.length();
                System.out.println("name_1 : "+name1_s);
                System.out.println(a1);
                if (keyEvent.getKeyCode() == 8) {
                    a1--;
                }
                if (a1 > 14) {
                    name1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.red, Color.red, Color.red));
                } else
                    name1.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.green, Color.green, Color.green));
                if (a1==0){
                    name1.setBorder(BorderFactory.createBevelBorder(1, Color.white, Color.white, Color.white, Color.white));
                }
                if (a1>0 && a>0){
                    Start.setEnabled(true);
                }
                else
                    Start.setEnabled(false);
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                name1_s=name1.getText();
                a1 = name1_s.length();
                System.out.println("name_1 : "+name1_s);
                System.out.println(a1);
                if (keyEvent.getKeyCode() == 8) {
                    a1--;
                }
                if (a1 > 14) {
                    name1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.red, Color.red, Color.red));
                } else
                    name1.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.green, Color.green, Color.green));
                if (a1==0){
                    name1.setBorder(BorderFactory.createBevelBorder(1, Color.white, Color.white, Color.white, Color.white));
                }
                if (a1>0 && a>0){
                    Start.setEnabled(true);
                }
                else
                    Start.setEnabled(false);
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                name1_s=name1.getText();
                a1 = name1_s.length();
                System.out.println("name_1 : "+name1_s);
                System.out.println(a1);
                if (keyEvent.getKeyCode() == 8) {
                    a1--;
                }
                if (a1 > 14) {
                    name1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.red, Color.red, Color.red));
                } else
                    name1.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.green, Color.green, Color.green));
                if (a1==0){
                    name1.setBorder(BorderFactory.createBevelBorder(1, Color.white, Color.white, Color.white, Color.white));
                }
                if (a1>0 && a>0){
                    Start.setEnabled(true);
                }
                else
                    Start.setEnabled(false);

            }
        });

        name2.setBounds(750,400,250,80);
        name2.setBorder(BorderFactory.createTitledBorder("name"));
        name2.setFont(new Font("breakaway",Font.BOLD,36));
        name2.setOpaque(false);
        name2.setText("");
        name2.setForeground(new Color(255,0,0));
        name2.setToolTipText("enter second player name");
        name2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                name2_s=name2.getText();
                a = name2_s.length();
                if (keyEvent.getKeyCode() == 8) {
                    a--;
                }
                System.out.println("name_2 : "+name2_s);
                System.out.println(a);
                if (a > 14) {
                    name2.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.red, Color.red, Color.red));
                } else if (a<=14)
                    name2.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.green, Color.green, Color.green));
                if (a==0){
                    name2.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.black, Color.black, Color.black));
                }
                if (a1>0 && a>0){
                    Start.setEnabled(true);
                }
                else
                    Start.setEnabled(false);
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                name2_s=name2.getText();
                a = name2_s.length();
                if (keyEvent.getKeyCode() == 8) {
                    a--;
                }
                System.out.println("name_2 : "+name2_s);
                System.out.println(a);
                if (a > 14) {
                    name2.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.red, Color.red, Color.red));
                } else if (a<=14)
                    name2.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.green, Color.green, Color.green));
                if (a==0){
                    name2.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.black, Color.black, Color.black));
                }
                if (a1>0 && a>0){
                    Start.setEnabled(true);
                }
                else
                    Start.setEnabled(false);

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                name2_s=name2.getText();
                a = name2_s.length();
                if (keyEvent.getKeyCode() == 8) {
                    a--;
                }
                System.out.println("name_2 : "+name2_s);
                System.out.println(a);
                if (a > 14) {
                    name2.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.red, Color.red, Color.red));
                } else if (a<=14)
                    name2.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.green, Color.green, Color.green));
                if (a==0){
                    name2.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.black, Color.black, Color.black));
                }
                if (a1>0 && a>0){
                    Start.setEnabled(true);
                }
                else
                    Start.setEnabled(false);

            }
        });

        this.setVisible(true);
        this.addKeyListener(this);
        this.add(pict);
        pict.add(name1);
        pict.add(name2);
        pict.add(Start);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==Start){
            this.dispose();
            new board();
        }
    }
    public static void main(String[] args) {
        new enter_name();
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        System.out.println(keyEvent.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
