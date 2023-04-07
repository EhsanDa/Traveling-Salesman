package code;

import javax.swing.*;
import java.awt.*;

public class END2 extends JFrame {
    ImageIcon head=new ImageIcon("src/images/New folder/Lost treasure.png");
    ImageIcon win1=new ImageIcon("src/images/win2.jpg");
    JLabel main_l=new JLabel();
    JLabel win=new JLabel();
    END2(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(666,439);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setIconImage(head.getImage());
        this.setTitle("WINNER WINNER CHICKEN DINNER");

        main_l.setBounds(-2,0,666,439);
        main_l.setBackground(new Color( 170 , 239 , 226 ));
        main_l.setOpaque(true);

        win.setIcon(win1);
        win.setBounds(0,0,666,439);

        this.setVisible(true);
        this.add(main_l);
        main_l.add(win);
    }
}
