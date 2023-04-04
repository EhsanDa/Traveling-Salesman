package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Castle_checker extends JFrame implements ActionListener {
    ImageIcon CASTLE=new ImageIcon("src/images/New folder/Castle.png");
    JLabel Background=new JLabel();
    JTextField HORIZONTAL=new JTextField();
    JTextField VERTICAL=new JTextField();
    int home;
    JButton OK =new JButton();
    JLabel VER_L=new JLabel();
    JLabel HOR_L=new JLabel();
    JLabel yes=new JLabel();
    Castle_checker(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setIconImage(CASTLE.getImage());
        this.setTitle("CASTLE");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(520,270);
        this.setLayout(null);
        Background.setBounds(0,0,520,300);
        Background.setBackground(new Color(238, 130, 238));
        Background.setOpaque(true);

        HORIZONTAL.setBounds(415,30,80,40);
        HOR_L.setBounds(5,34,400,36);
        HOR_L.setFont(new Font("ZEROGIRL",Font.BOLD,20));
        HOR_L.setText("ENTER YOUR HORIZONTAL OF QUEST :");

        VERTICAL.setBounds(415,100,80,40);
        VER_L.setBounds(5,104,350,36);
        VER_L.setFont(new Font("ZEROGIRL",Font.BOLD,20));
        VER_L.setText("ENTER YOUR VERTICAL OF QUEST :");
        //HO=Integer.parseInt(HO_s);
//
        OK.setBounds(65,160,100,50);
        OK.setText("OK");
        OK.setFont(new Font("ZEROGIRL",Font.BOLD,30));
        OK.setBackground(new Color(0,0,0));
        OK.setOpaque(false);
        OK.setForeground(new Color(139 , 239 , 139));
        OK.addActionListener(this);
//
        //home=(VE-1)*10+HO;

        yes.setFont(new Font("ZEROGIRL",Font.BOLD,30));
        yes.setBounds(250,170,200,30);
        yes.setText("YOU DID IT");

        this.add(Background);
        Background.add(HORIZONTAL);
        Background.add(VERTICAL);
        Background.add(VER_L);
        Background.add(HOR_L);
        Background.add(OK);
        Background.add(yes);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()== OK){
            String s1 = HORIZONTAL.getText();
            String s2 = VERTICAL.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            home=(a-1)*10+(b-1);
            System.out.println(home);
        }
    }

    public static void main(String[] args) {
        new Castle_checker();
    }
}
