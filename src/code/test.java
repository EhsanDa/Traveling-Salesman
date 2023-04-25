package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame {
    JFrame frame=new JFrame();
    ImageIcon gif=new ImageIcon("src/images/Among Us Crewmate Run.gif");
    JLabel main_l=new JLabel();
    Timer timer;
    int count=0;
    public void time(){
        count++;
        System.out.println(count);
    }
    test(){

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(666,439);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setTitle("WINNER WINNER CHICKEN DINNER");

        main_l.setBounds(-2,0,666,439);
        main_l.setBackground(new Color( 170 , 239 , 226 ));
        main_l.setOpaque(true);
        main_l.setIcon(gif);


        frame.setVisible(true);
        frame.add(main_l);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                time();
                if (count==5){
                    frame.dispose();
                }
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        new test();
    }
}
