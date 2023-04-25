package code;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class first_page implements ActionListener {
    static ArrayList<String> Saved=new ArrayList<>();
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
    Timer timer;
    int y=-70;
    public void movename(){
        y++;
        name.setLocation(260,y);
        if (y==50){
            timer.stop();
        }
    }
    first_page(){

        timer=new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                movename();
            }
        });
        timer.start();

        first_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        first_frame.setSize(1200, 700);
        first_frame.setResizable(false);
        first_frame.setLayout(null);
        first_frame.setLocationRelativeTo(null);
        first_frame.setIconImage(ICON.getImage());



        start.setBounds(300,300,200,80);
        start.setBackground(new Color(255,228,181));
        //start.setOpaque(false);
        start.setCursor(new Cursor(Cursor.HAND_CURSOR));
        start.addActionListener(this);
        start.setFont(button);
        start.setBorder(BorderFactory.createRaisedBevelBorder());
        start.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                start.setSize(210,90);
                start.setLocation(297,297);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                start.setSize(200,80);
                start.setLocation(300,300);
            }

            @Override
            public void mouseDragged(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {

            }
        });
        /*********************************************************************/
        //name.setOpaque(true);
        name.setBounds(260,y,700,90);
        name.setForeground(new Color(0,255,255));
        name.setFont(new Font(namef,Font.BOLD,54));
        /*********************************************************************/
        Exit.setBackground(new Color(255,228,181));
        Exit.setBounds(500,560,170,80);
        Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Exit.setFont(new Font(buttons,Font.BOLD,36));
        Exit.addActionListener(this);
        Exit.setBorder(BorderFactory.createRaisedBevelBorder());
        Exit.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                Exit.setSize(180,90);
                Exit.setLocation(497,557);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                Exit.setSize(170,80);
                Exit.setLocation(500,560);
            }

            @Override
            public void mouseDragged(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {

            }
        });
        /********************************************************************/
        tutorial.setBackground(new Color(255,228,181));
        tutorial.setBounds(245,425,290,80);
        //tutorial.setOpaque(false);
        tutorial.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tutorial.setFont(new Font(buttons,Font.BOLD,36));
        tutorial.addActionListener(this);
        tutorial.setBorder(BorderFactory.createRaisedBevelBorder());
        tutorial.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                tutorial.setLocation(242,422);
                tutorial.setSize(300,90);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                tutorial.setLocation(245,425);
                tutorial.setSize(290,80);
            }

            @Override
            public void mouseDragged(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {

            }
        });
        /******************************************************************/
        contactus.setBackground(new Color(255,228,181));
        contactus.setBounds(640,425,320,80);
        contactus.setCursor(new Cursor(Cursor.HAND_CURSOR));
        contactus.setFont(new Font(buttons,Font.BOLD,36));
        contactus.addActionListener(this);
        contactus.setBorder(BorderFactory.createRaisedBevelBorder());
        contactus.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                contactus.setSize(330,90);
                contactus.setLocation(637,422);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                contactus.setSize(320,80);
                contactus.setLocation(640,425);
            }

            @Override
            public void mouseDragged(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {

            }
        });
        /*****************************************************************/
        pregame.setBackground(new Color(255,228,181));
        pregame.setBounds(660,300,260,80);
        pregame.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pregame.setFont(new Font(buttons,Font.BOLD,36));
        pregame.addActionListener(this);
        pregame.setBorder(BorderFactory.createRaisedBevelBorder());
        pregame.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                pregame.setLocation(657,297);
                pregame.setSize(270,90);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                pregame.setLocation(660,300);
                pregame.setSize(260,80);
            }

            @Override
            public void mouseDragged(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {

            }
        });
        /******************************************************************/
        first_page_pic.setIcon(background);
        first_page_pic.setOpaque(true);
        first_page_pic.setBounds(0,0,1200,700);
        first_page_pic.add(name);


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
            first_frame.dispose();
            System.out.println("dast");
            new enter_name();
            //LOADING1.iterate();
        }
        if (actionEvent.getSource()==pregame){
            try {
                File myObj = new File("src/Save_Files/Save.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    Saved.add(data);

                }
                for (int i = 0; i < Saved.size(); i++) {
                    System.out.println(Saved.get(i));
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }       }
        if (actionEvent.getSource()==contactus){
            contactus.setEnabled(false);
            first_frame.setVisible(false);
            final Contact_Us x= new Contact_Us();
            x.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    x.dispose();
                    contactus.setEnabled(true);
                    first_frame.setVisible(true);
                }

            });
        }
        if (actionEvent.getSource()==tutorial){

        }
        if (actionEvent.getSource()==Exit){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new first_page();
    }
}
