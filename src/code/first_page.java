package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class first_page implements ActionListener {
    JFrame first_frame=new JFrame("WELCOME");
    ImageIcon background = new ImageIcon("src/images/pxfuel.jpg");
    ImageIcon ICON=new ImageIcon("src/images/ICON.jpg");
    ImageIcon Tutorials=new ImageIcon("src/images/icons8-youtube-tutorials-128.png");
    JButton start= new JButton("START");
    JButton Exit=new JButton("EXIT");
    JButton tutorial=new JButton("TUTORIALS");
    JButton contactus=new JButton("CONTACT US");
    JButton pregame=new JButton("PRE GAME");
    JLabel first_page_pic=new JLabel();
    JLabel name=new JLabel("TRAVELLING SALESMAN");
    String  buttons="african",namef="TERMINAT";
    Font button=new Font(buttons,Font.BOLD,36);

    first_page(){

        start.setBounds(300,300,200,80);
        start.setBackground(new Color(255,228,181));
        //start.setOpaque(false);
        start.setCursor(new Cursor(Cursor.HAND_CURSOR));
        start.addActionListener(this);
        start.setFont(button);
        /*********************************************************************/
        //name.setOpaque(true);
        name.setBounds(260,50,700,90);
        name.setForeground(new Color(0,255,255));
        name.setFont(new Font(namef,Font.BOLD,54));
        /*********************************************************************/
        Exit.setBackground(new Color(255,228,181));
        Exit.setBounds(500,560,170,80);
        Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Exit.setFont(new Font(buttons,Font.BOLD,36));
        Exit.addActionListener(this);
        /********************************************************************/
        tutorial.setBackground(new Color(255,228,181));
        tutorial.setBounds(245,425,290,80);
        //tutorial.setOpaque(false);
        tutorial.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tutorial.setFont(new Font(buttons,Font.BOLD,36));
        tutorial.addActionListener(this);
        /******************************************************************/
        contactus.setBackground(new Color(255,228,181));
        contactus.setBounds(640,425,320,80);
        contactus.setCursor(new Cursor(Cursor.HAND_CURSOR));
        contactus.setFont(new Font(buttons,Font.BOLD,36));
        contactus.addActionListener(this);
        /*****************************************************************/
        pregame.setBackground(new Color(255,228,181));
        pregame.setBounds(660,300,260,80);
        pregame.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pregame.setFont(new Font(buttons,Font.BOLD,36));
        pregame.addActionListener(this);
        /******************************************************************/
        first_page_pic.setIcon(background);
        first_page_pic.add(name);

        first_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        first_frame.setSize(1200, 700);
        first_frame.setResizable(false);
        first_frame.setIconImage(ICON.getImage());
        first_frame.setVisible(true);
        first_frame.add(start);
        first_frame.add(tutorial);
        first_frame.add(contactus);
        first_frame.add(pregame);
        first_frame.add(Exit);
        first_frame.add(first_page_pic);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==start){
            new board();
            first_frame.dispose();
        }
        if (actionEvent.getSource()==pregame){

        }
        if (actionEvent.getSource()==contactus){

        }
        if (actionEvent.getSource()==tutorial){

        }
        if (actionEvent.getSource()==Exit){
            System.exit(0);
        }
    }
}
