package code;

import javax.swing.*;

public class Contact_Us extends JFrame {
    ImageIcon icon =new ImageIcon("src/images/CONTACT.jpg");
    JLabel m=new JLabel();
    Contact_Us(){
        this.setSize(1200,700);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        m.setIcon(icon);
        m.setBounds(0,0,1200,700);

        this.setVisible(true);
        this.add(m);
    }

    /*public static void main(String[] args) {
        new Contact_Us();
    }*/
}
