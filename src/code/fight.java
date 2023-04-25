package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fight {
    JFrame frame=new JFrame();
    ImageIcon gif1=new ImageIcon("");
    ImageIcon gif2=new ImageIcon("");
    JLabel m_l=new JLabel();
    Timer timer;
    int count=0;
    public void time(){
        count++;
        System.out.println(count);
    }
    fight(int a){
        timer=new Timer(250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                time();
                if (count==8){
                    frame.dispose();
                    timer.stop();
                }
            }
        });
        timer.start();
        frame.setLocation(430,190);
        frame.setTitle("FIGHT");
        frame.setResizable(false);
        frame.setSize(320,220);
        frame.setDefaultCloseOperation(3);

        frame.setLayout(null);

        m_l.setBounds(0,-165,700,500);

        if (a==1){
            m_l.setText(" blue fucked red");
            m_l.setFont(new Font("src/Fonts/breakaway.ttf",Font.BOLD,36));
            m_l.setBackground(new Color(242 , 79 , 231));
            m_l.setForeground(new Color(0,0,255));
        } else if (a==2) {
            m_l.setText("  red fucked blue");
            m_l.setFont(new Font("src/Fonts/breakaway.ttf",Font.BOLD,36));
            m_l.setBackground(new Color(242 , 79 , 231));
            m_l.setForeground(new Color(255,0,0));
        }

        frame.setVisible(true);
        frame.add(m_l);
        int sw=0;
        if (board.POWER_PLAYER_1>board.POWER_PLAYER_2){
            sw=1;
        }
        if (board.POWER_PLAYER_2>board.POWER_PLAYER_1){
            sw=2;
        }
        if (sw==1){
            System.out.println("p1 win this fight");
            m_l.setIcon(gif1);
        } else if (sw==2) {
            System.out.println("p2 win this fight");
            m_l.setIcon(gif2);
        }


    }

    public static void main(String[] args) {
        new fight(2);
    }
}
