package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    JLabel main_label=new JLabel();
    JButton Exit=new JButton();
    JButton Continue=new JButton();
    JButton Save=new JButton();

    Menu(){
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setTitle("MENU");
        this.setResizable(false);
        this.setIconImage(new ImageIcon("src/images/menu_48.png").getImage());
        this.setSize(225,362);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        main_label.setBounds(0,0,225,380);
        main_label.setBackground(new Color(255, 240, 245));
        main_label.setOpaque(true);

        Continue.setBounds(57,10,96,96);
        Continue.setBackground(new Color(255, 240, 245));
        Continue.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Continue.setOpaque(false);
        Continue.setIcon(new ImageIcon("src/images/icons8-next-96.png"));
        Continue.addActionListener(this);

        Save.setBounds(57,116,96,96);
        Save.setBackground(new Color(255, 240, 245));
        Save.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Save.setOpaque(false);
        Save.setIcon(new ImageIcon("src/images/icons8-save-64 (1).png"));
        Save.addActionListener(this);

        Exit.setBounds(57,222,96,96);
        Exit.setBackground(new Color(255, 240, 245));
        Exit.setOpaque(false);
        Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Exit.setIcon(new ImageIcon("src/images/exit-exit-svgrepo-com (1).png"));
        Exit.addActionListener(this);

        this.setVisible(true);
        this.add(main_label);
        main_label.add(Continue);
        main_label.add(Save);
        main_label.add(Exit);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==Exit){
            new EXIT();
        }
        if (actionEvent.getSource()==Continue){
            board.Menu_button.setEnabled(true);
            this.dispose();
        }
    }
}
