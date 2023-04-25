package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOADING extends JFrame{
    JProgressBar loading=new JProgressBar(0, 2000);
    ImageIcon ICON=new ImageIcon("src/images/ICON.jpg");
    ImageIcon icon=new ImageIcon("src/images/LOADING PAGE.jpg");
    JLabel main_L=new JLabel();
    JLabel waiting=new JLabel("wait");
    String s1="wait ";
    String s2="wait .";
    String s3="wait ..";
    String s4="wait ...";
    int i=0;
    Timer timer;
    int count=0;
    int x=150;
    public void wait_l(){
        if (count==0){
            waiting.setText(s1);
        }
        if (count==1){
            waiting.setText(s2);
        }
        if (count==2){
            waiting.setText(s3);
        }
        if (count==3){
            waiting.setText(s4);
        }
    }
    LOADING(){
        timer=new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                wait_l();
                count++;
                if (count==4){
                    System.out.println("sssssssssssssssssssssssss");
                    count=0;
                }
            }
        });
        timer.start();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setSize(1200,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setIconImage(ICON.getImage());
        this.setTitle("LOADING GAME");

        main_L.setIcon(icon);
        main_L.setBounds(0,0,1200,700);

        waiting.setBounds(550,580,200,50);
        waiting.setFont(new Font("BoobToobOpen",Font.TRUETYPE_FONT,36));
        waiting.setForeground(new Color(255,215,0));

        loading.setValue(0);
        loading.setStringPainted(true);
        loading.setBounds(340,630,550,15);
        loading.setOpaque(false);
        loading.setForeground(new Color(255, 20, 147));


        this.setVisible(true);
        this.add(main_L);
        main_L.add(waiting);
        main_L.add(loading);
    }
    public void iterate() {
        while (i <= 2000) {
            loading.setValue(i);
            i = i + 20;
            if (loading.getValue()==2000){
                timer.stop();
                this.dispose();
                new first_page();
            }
            try {
                Thread.sleep(150);
            } catch (Exception e) {
            }
        }
    }
}
