package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

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
        if (actionEvent.getSource()==Save){
            try {
                FileWriter fileWriter=new FileWriter("src/Save_Files/Save.txt");
                fileWriter.write(String.valueOf(board.SW)+"\n");
                fileWriter.write(String.valueOf(board.x)+"\n");
                fileWriter.write(String.valueOf(board.y)+"\n");
                fileWriter.write(String.valueOf(board.x1)+"\n");
                fileWriter.write(String.valueOf(board.y1)+"\n");
                fileWriter.write(String.valueOf(board.Dice_number)+"\n");
                fileWriter.write(String.valueOf(board.dice_number1)+"\n");
                fileWriter.write(String.valueOf(board.SW_PLAYER )+"\n");
                fileWriter.write(String.valueOf(board.POWER_PLAYER_1)+"\n");
                fileWriter.write(String.valueOf(board.MONEY_PLAYER_1)+"\n");
                fileWriter.write(String.valueOf(board.POWER_PLAYER_2)+"\n");
                fileWriter.write(String.valueOf(board.MONEY_PLAYER_2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_3)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_4)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_5)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_6)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_7)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_8)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_9)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_10)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_11)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_12)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_13)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure1_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure1_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure2_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure2_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure3_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure3_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure4_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure4_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure5_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure5_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure6_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure6_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure7_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure7_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure8_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_treasure8_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_trap1_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_trap1_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_trap2_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_trap2_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_trap3_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_trap3_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_trap4_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_trap4_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_1_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_1_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_2_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_2_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_3_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_3_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_4_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_4_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_5_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_5_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_6_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_6_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_7_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_7_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_8_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_8_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_9_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_9_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_10_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_10_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_11_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_11_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_12_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_12_p2)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_13_p1)+"\n");
                fileWriter.write(String.valueOf(board.sw_loot_13_p2)+"\n");
                fileWriter.write(String.valueOf(board.quest1)+"\n");
                fileWriter.write(String.valueOf(board.quest2)+"\n");
                fileWriter.write(String.valueOf(board.questplace1)+"\n");
                fileWriter.write(String.valueOf(board.questplace2)+"\n");
                fileWriter.write(String.valueOf(board.thing.wall1)+"\n");
                fileWriter.write(String.valueOf(board.thing.wall2)+"\n");
                fileWriter.write(String.valueOf(board.thing.wall3)+"\n");
                fileWriter.write(String.valueOf(board.thing.wall4)+"\n");
                fileWriter.write(String.valueOf(board.thing.wall5)+"\n");
                fileWriter.write(String.valueOf(board.thing.wall6)+"\n");
                fileWriter.write(String.valueOf(board.thing.wall7)+"\n");
                fileWriter.write(String.valueOf(board.thing.market1)+"\n");
                fileWriter.write(String.valueOf(board.thing.market2)+"\n");
                fileWriter.write(String.valueOf(board.thing.market3)+"\n");
                fileWriter.write(String.valueOf(board.thing.market4)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot1)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot2)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot3)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot4)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot5)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot6)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot7)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot8)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot9)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot10)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot11)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot12)+"\n");
                fileWriter.write(String.valueOf(board.thing.loot13)+"\n");
                fileWriter.write(String.valueOf(board.thing.trap1)+"\n");
                fileWriter.write(String.valueOf(board.thing.trap2)+"\n");
                fileWriter.write(String.valueOf(board.thing.trap3)+"\n");
                fileWriter.write(String.valueOf(board.thing.trap4)+"\n");
                fileWriter.write(String.valueOf(board.thing.treasure1)+"\n");
                fileWriter.write(String.valueOf(board.thing.treasure2)+"\n");
                fileWriter.write(String.valueOf(board.thing.treasure3)+"\n");
                fileWriter.write(String.valueOf(board.thing.treasure4)+"\n");
                fileWriter.write(String.valueOf(board.thing.treasure5)+"\n");
                fileWriter.write(String.valueOf(board.thing.treasure6)+"\n");
                fileWriter.write(String.valueOf(board.thing.treasure7)+"\n");
                fileWriter.write(String.valueOf(board.thing.treasure8)+"\n");












                fileWriter.close();
                System.out.println("sad");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("sad");
        }
        if (actionEvent.getSource()==Exit){
            new EXIT();
        }
        if (actionEvent.getSource()==Continue){
            board.Menu_button.setEnabled(true);
            this.dispose();
        }
    }
}
