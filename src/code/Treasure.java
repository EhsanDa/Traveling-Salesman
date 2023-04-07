package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Treasure extends JFrame implements ActionListener {
    ImageIcon T1=new ImageIcon("src/images/Treasure/bow.png");
    ImageIcon T2=new ImageIcon("src/images/Treasure/cup.png");
    ImageIcon T3=new ImageIcon("src/images/Treasure/diamond-ring (1).png");
    ImageIcon T4=new ImageIcon("src/images/Treasure/glass.png");
    ImageIcon T5=new ImageIcon("src/images/Treasure/icons8-dragon-face-96 (2).png");
    ImageIcon T6=new ImageIcon("src/images/Treasure/icons8-heart-key-80.png");
    ImageIcon T7=new ImageIcon("src/images/Treasure/shield.png");
    ImageIcon T8=new ImageIcon("src/images/Treasure/icons8-jim-trollhunters-sword-96.png");
    String T1_s="YOU FOUND WOODEN BOW";
    String T2_s="YOU FOUND GOLDEN GLASS";
    String T3_s="YOU FOUND DIAMOND RING";
    String T4_s="YOU FOUND GLASS CUP";
    String T5_s="YOU FOUND DRAGONSCROLL";
    String T6_s="YOU FOUND GOLDEN KEY";
    String T7_s="YOU FOUND STEEL SHIELD";
    String T8_s="YOU FOUND THE SWORD";
    JLabel T1_l=new JLabel();
    JLabel T2_l=new JLabel();
    JLabel T3_l=new JLabel();
    JLabel T4_l=new JLabel();
    JLabel T5_l=new JLabel();
    JLabel T6_l=new JLabel();
    JLabel T7_l=new JLabel();
    JLabel T8_l=new JLabel();
    JLabel Background=new JLabel();
    JLabel text=new JLabel();
    Treasure(int T_N){
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setTitle("TREASURE");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(400,270);
        this.setLayout(null);
        text.setFont(new Font("ZEROGIRL",Font.BOLD,25));
        text.setBounds(28,10,350,36);
        text.setForeground(new Color(139 , 239 , 139 ));
        Background.setBounds(0,0,400,300);
        Background.setBackground(new Color(238, 130, 238));
        Background.setOpaque(true);
        switch (T_N){
            case 1:
                text.setText(T1_s);
                T1_l.setIcon(T1);
                T1_l.setBounds(100,0,350,280);
                Background.add(T1_l);
                break;
            case 2:
                text.setText(T2_s);
                T2_l.setIcon(T2);
                T2_l.setBounds(100,0,350,280);
                Background.add(T2_l);
                break;
            case 3:
                text.setText(T3_s);
                T3_l.setIcon(T3);
                T3_l.setBounds(100,0,350,280);
                Background.add(T3_l);
                break;
            case 4:
                text.setText(T4_s);
                T4_l.setIcon(T4);
                T4_l.setBounds(100,0,350,280);
                Background.add(T4_l);
                break;
            case 5:
                text.setText(T5_s);
                T5_l.setIcon(T5);
                T5_l.setBounds(100,0,350,280);
                Background.add(T5_l);
                break;
            case 6:
                text.setText(T6_s);
                T6_l.setIcon(T6);
                T6_l.setBounds(100,0,350,280);
                Background.add(T6_l);
                break;
            case 7:
                text.setText(T7_s);
                T7_l.setIcon(T7);
                T7_l.setBounds(100,0,350,280);
                Background.add(T7_l);
                break;
            case 8:
                text.setText(T8_s);
                T8_l.setIcon(T8);
                T8_l.setBounds(100,0,350,280);
                Background.add(T8_l);
                break;
        }
        this.add(Background);
        Background.add(text);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
