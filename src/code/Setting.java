package code;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Setting extends JFrame implements ActionListener, KeyListener {
    int volume;
    int p=0,q=0,r=0,s=0;
    ImageIcon setting=new ImageIcon("src/images/setting_48.png");
    ImageIcon exit=new ImageIcon("src/images/icons8-go-back-48.png");
    /***/
    ImageIcon b1=new ImageIcon("src/images/backgrounds/1.jpg");
    ImageIcon b1_l=new ImageIcon("src/images/backgrounds/1(1).jpg");
    JButton b1_b=new JButton();
    ImageIcon b2=new ImageIcon("src/images/backgrounds/2.jpg");
    ImageIcon b2_l=new ImageIcon("src/images/backgrounds/2(1).jpg");
    JButton b2_b=new JButton();
    ImageIcon b3=new ImageIcon("src/images/backgrounds/3.jpg");
    ImageIcon b3_l=new ImageIcon("src/images/backgrounds/3(1).jpg");
    JButton b3_b=new JButton();
    ImageIcon b4=new ImageIcon("src/images/BackGround.jpg");
    ImageIcon b4_l=new ImageIcon("src/images/backgrounds/BackGround(1).jpg");
    JButton b4_b=new JButton();
    /***/
    JLabel top=new JLabel();
    JLabel middle=new JLabel();
    JLabel music=new JLabel();
    JLabel picture=new JLabel();
    JButton button=new JButton();
    JSlider sound=new JSlider(SwingConstants.HORIZONTAL,0,100,25);
    JButton Exit=new JButton();
    Setting(){
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setIconImage(setting.getImage());
        this.setTitle("SETTING");
        this.addKeyListener(this);
        top.setBounds(0,0,400,70);
        top.setBackground(new Color(32,178,170));
        top.setOpaque(true);
        top.setText("    SETTING");
        top.setFont(new Font("african",Font.BOLD,40));

        music.setBounds(5,10,150,60);
        music.setText("Volume");
        music.setForeground(new Color(255, 20, 147));
        music.setFont(new Font("ZEROGIRL",Font.BOLD,36));

        middle.setBounds(0,70,400,430);
        middle.setBackground(new Color(224, 255, 255));
        middle.setOpaque(true);

        sound.setBounds(200,32,150,20);
        sound.setOpaque(false);
        sound.setBackground(new Color(255,20,147));
        sound.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                volume=sound.getValue();
                System.out.println(volume);;
            }
        });

        Exit.setBounds(0,10,50,50);
        Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Exit.setBackground(new Color(255, 20, 147));
        Exit.setOpaque(false);
        Exit.setIcon(exit);
        Exit.addActionListener(this);

        picture.setBounds(20,80,400,60);
        picture.setText("Change BackGround");
        picture.setForeground(new Color(255, 20, 147));
        picture.setFont(new Font("ZEROGIRL",Font.BOLD,30));

        b1_b.setBounds(25,275,150,100);
        b1_b.setBackground(new Color(224, 255, 255));
        b1_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1_b.setOpaque(false);
        b1_b.setIcon(b1_l);
        b1_b.addActionListener(this);

        b2_b.setBounds(25,150,150,100);
        b2_b.setBackground(new Color(224, 255, 255));
        b2_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2_b.setOpaque(false);
        b2_b.setIcon(b2_l);
        b2_b.addActionListener(this);

        b3_b.setBounds(200,150,150,100);
        b3_b.setBackground(new Color(224, 255, 255));
        b3_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3_b.setOpaque(false);
        b3_b.setIcon(b3_l);
        b3_b.addActionListener(this);

        b4_b.setBounds(200,275,150,100);
        b4_b.setBackground(new Color(224, 255, 255));
        b4_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4_b.setOpaque(false);
        b4_b.setIcon(b4_l);
        b4_b.addActionListener(this);

        this.setVisible(true);
        this.add(top);
        this.add(middle);
        middle.add(music);
        middle.add(sound);
        middle.add(b1_b);
        middle.add(b2_b);
        middle.add(b3_b);
        middle.add(b4_b);
        middle.add(picture);
        top.add(Exit);

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==Exit){
            this.dispose();
        }
        if (actionEvent.getSource()==b1_b){
            board.background_pic_l.setIcon(b1);
            this.revalidate();
            this.paint(this.getGraphics());
        }
        if (actionEvent.getSource()==b2_b){
            board.background_pic_l.setIcon(b2);
            this.revalidate();
            this.paint(this.getGraphics());
        }
        if (actionEvent.getSource()==b3_b){
            board.background_pic_l.setIcon(b3);
            this.revalidate();
            this.paint(this.getGraphics());
        }
        if (actionEvent.getSource()==b4_b){
            board.background_pic_l.setIcon(b4);
            this.revalidate();
            this.paint(this.getGraphics());
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        System.out.println(keyEvent.getKeyCode());
    }
}
