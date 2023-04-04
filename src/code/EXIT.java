package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EXIT extends JFrame implements ActionListener {
    JLabel main_label = new JLabel();
    JButton N = new JButton();
    JButton y = new JButton();
    JLabel TEXT=new JLabel();
    EXIT() {
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setTitle("EXIT");
        this.setResizable(false);
        this.setIconImage(new ImageIcon("src/images/OK-OK-svgrepo-com (1).png").getImage());
        this.setSize(400, 165);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        main_label.setBounds(0, 0, 400, 200);
        main_label.setBackground(new Color(255, 240, 245));
        main_label.setOpaque(true);

        TEXT.setBounds(15,5,400,60);
        TEXT.setText("Do You Really Want To Exit ?");
        TEXT.setForeground(new Color(255, 20, 147));
        TEXT.setFont(new Font("ZEROGIRL",Font.BOLD,22));

        y.setBounds(65,70,96,40);
        y.setText("YES");
        y.setFont(new Font("ZEROGIRL",Font.BOLD,22));
        y.setCursor(new Cursor(12));
        y.setBackground(new Color(0 , 245 , 171 ));
        y.addActionListener(this);

        N.setBounds(210,70,96,40);
        N.setText("NO");
        N.setFont(new Font("ZEROGIRL",Font.BOLD,22));
        N.setCursor(new Cursor(12));
        N.setBackground(new Color(0 , 245 , 171 ));
        N.addActionListener(this);

        this.setVisible(true);
        this.add(main_label);
        main_label.add(TEXT);
        main_label.add(y);
        main_label.add(N);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==y){
            System.exit(0);
        }
        if (actionEvent.getSource()==N){
            this.dispose();
        }
    }
}
