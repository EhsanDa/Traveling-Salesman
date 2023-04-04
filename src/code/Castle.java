package code;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class Castle {
    static int a;
    public static boolean find(int q , int questplace){
               System.out.println("enter place");

        //todo castle

        if(questplace==Castle_checker.home){
            //todo add money

            System.out.println("YOU DID IT");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Castle c=new Castle();

    c.find(2,5);

    }
}

