package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Market2 extends JFrame implements ActionListener {
    ImageIcon market=new ImageIcon("src/images/market (50).png");
    ImageIcon exit=new ImageIcon("src/images/icons8-go-back-48.png");
    JLabel main_l=new JLabel();
    JLabel top=new JLabel();
    JButton Exit=new JButton();
    Market2(){
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setIconImage(market.getImage());
        this.setTitle("MARKET");

        main_l.setBounds(0,0,600,600);
        main_l.setBackground(new Color(255, 182, 193));
        main_l.setOpaque(true);

        top.setBounds(0,0,600,70);
        top.setText("    WELCOME TO MARKET 2");
        top.setFont(new Font("ZEROGIRL",Font.BOLD,36));
        top.setBackground(new Color(192 , 255 , 246 ));
        top.setOpaque(true);

        Exit.setBounds(0,10,50,50);
        Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Exit.setBackground(new Color(255, 20, 147));
        Exit.setOpaque(false);
        Exit.setIcon(exit);
        Exit.addActionListener(this);

        this.setVisible(true);
        this.add(main_l);
        main_l.add(top);
        top.add(Exit);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==Exit){
            this.dispose();
        }
    }

    public static void main(String[] args) {
        new Market2();
    }
}
