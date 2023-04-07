package code;

import javax.swing.*;
import java.awt.*;

public class information extends JFrame {
    ImageIcon title=new ImageIcon("src/images/information (2) (1).png");
    JLabel main_l=new JLabel();
    JLabel main_l_1=new JLabel();
    JLabel task_1=new JLabel();
    JLabel task_2=new JLabel();
    JLabel task_1_P=new JLabel();
    JLabel task_2_P=new JLabel();
    information(){
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setSize(700,300);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setIconImage(title.getImage());
        this.setTitle("INFORMATION");

        main_l.setBounds(0,0,343,300);
        main_l.setBackground(new Color(0, 182, 193));
        main_l.setOpaque(true);

        main_l_1.setBounds(343,0,370,300);
        main_l_1.setBackground(new Color(140, 20, 20));
        main_l_1.setOpaque(true);

        task_1_P.setText("LOOK FOR");
        task_1_P.setBounds(10,10,300,30);
        task_1_P.setFont(new Font("ZEROGIRL",Font.BOLD,36));
        task_1_P.setForeground(new Color(50, 90, 255));

        task_1.setBounds(10,60,300,30);
        task_1.setFont(new Font("ZEROGIRL",Font.BOLD,36));
        task_1.setForeground(new Color(50, 90, 255));
        if (board.quest1==1){
            task_1.setText("WOODEN BOW");
        }
        if (board.quest1==2){
            task_1.setText("GOLDEN GLASS");
        }
        if (board.quest1==3){
            task_1.setText("DIAMOND RING");
        }
        if (board.quest1==4){
            task_1.setText("GLASS CUP");
        }
        if (board.quest1==5){
            task_1.setText("DRAGONSCROLL");
        }
        if (board.quest1==6){
            task_1.setText("GOLDEN KEY");
        }
        if (board.quest1==7){
            task_1.setText("STEEL SHIELD");
        }
        if (board.quest1==8){
            task_1.setText("THE SWORD");
        }


        task_2_P.setText("LOOK FOR");
        task_2_P.setBounds(10,10,300,30);
        task_2_P.setFont(new Font("ZEROGIRL",Font.BOLD,36));
        task_2_P.setForeground(new Color(255, 90, 0));

        task_2.setBounds(10,60,300,30);
        task_2.setFont(new Font("ZEROGIRL",Font.BOLD,36));
        task_2.setForeground(new Color(255, 90, 0));
        if (board.quest2==1){
            task_2.setText("WOODEN BOW");
        }
        if (board.quest2==2){
            task_2.setText("GOLDEN GLASS");
        }
        if (board.quest2==3){
            task_2.setText("DIAMOND RING");
        }
        if (board.quest2==4){
            task_2.setText("GLASS CUP");
        }
        if (board.quest2==5){
            task_2.setText("DRAGONSCROLL");
        }
        if (board.quest2==6){
            task_2.setText("GOLDEN KEY");
        }
        if (board.quest2==7){
            task_2.setText("STEEL SHIELD");
        }
        if (board.quest2==8){
            task_2.setText("THE SWORD");
        }

        this.setVisible(true);
        this.add(main_l);
        this.add(main_l_1);
        main_l.add(task_1);
        main_l_1.add(task_2);
        main_l.add(task_1_P);
        main_l_1.add(task_2_P);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D=(Graphics2D) g;
        graphics2D.drawLine(350,0,350,300);
    }
}
