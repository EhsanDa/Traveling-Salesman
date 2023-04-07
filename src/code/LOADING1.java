package code;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class LOADING1 {
    static JFrame frame=new JFrame();
    static JProgressBar loading=new JProgressBar(0, 1000);
    ImageIcon ICON=new ImageIcon("src/images/ICON.jpg");
    ImageIcon icon=new ImageIcon("src/images/3Z_2010.w020.n001.772A.p30.772.jpg");
    JLabel main_L=new JLabel();
    JLabel waiting=new JLabel("wait ...");
    static int i=0;
    LOADING1(){
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setSize(1200,700);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setIconImage(ICON.getImage());
        frame.setTitle("LOADING GAME");

        main_L.setIcon(icon);
        main_L.setBounds(0,0,1200,700);
        main_L.setBackground(new Color(0,0,0));
        main_L.setOpaque(true);

        waiting.setBounds(550,580,200,50);
        waiting.setFont(new Font("BoobToobOpen",Font.TRUETYPE_FONT,36));
        waiting.setForeground(new Color(255,215,0));

        loading.setValue(0);
        loading.setStringPainted(true);
        loading.setBounds(340,630,550,15);
        loading.setOpaque(false);
        loading.setForeground(new Color(72, 209, 204));


        frame.setVisible(true);
        frame.add(main_L);
        main_L.add(waiting);
        main_L.add(loading);
    }
    public static void run(){
        LOADING1 loading1 =new LOADING1();
        loading1.iterate();
    }
    public static void iterate() {
        while (i <= 1000) {
            loading.setValue(i);
            i = i + 20;
            if (loading.getValue()==1000){
                frame.dispose();
                new board();
            }
            try {
                Thread.sleep(150);
            } catch (Exception e) {
            }
        }
    }
    /*public static void main(String[] args) {
        LOADING1 loading1=new LOADING1();
        loading1.iterate();
    }*/
}
